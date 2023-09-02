package controller;

import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import DTO.ResponseStatus;
import exception.NoParkingSpotFoundException;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;
    //DTO - Data Transfer Object
    //problems with directly involving Models in the Controller API's :-
    //1. If we add/remove models from the input, current clients will start failing.
    //2. We should not expose the Model details to client because of privacy.
    //The solution to this : Data Transfer Objects (DTO).

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {

        try {
            // validation criminal lic no
            Ticket ticket = ticketService.generateTicket(
                    generateTicketRequestDto.getVehicleNumber(),
                    generateTicketRequestDto.getVehicleType(),
                    generateTicketRequestDto.getGateId());

            GenerateTicketResponseDto generateTicketResponseDto
                    = new GenerateTicketResponseDto();
            generateTicketResponseDto.setTicket(ticket);
            generateTicketResponseDto.setStatus(ResponseStatus.SUCCESS);

            return generateTicketResponseDto;
        } catch (NoParkingSpotFoundException e) {
            GenerateTicketResponseDto generateTicketResponseDto
                    = new GenerateTicketResponseDto();
            generateTicketResponseDto.setStatus(ResponseStatus.FAILURE);
            generateTicketResponseDto.setFailureMessage(e.getMessage());
            return generateTicketResponseDto;
        } catch (Exception e) {
            GenerateTicketResponseDto generateTicketResponseDto
                    = new GenerateTicketResponseDto();
            generateTicketResponseDto.setStatus(ResponseStatus.FAILURE);
            generateTicketResponseDto.setFailureMessage(e.getMessage());
            return generateTicketResponseDto;
        }
    }

    /* - CompleteProject
    4 service -
     */
}
