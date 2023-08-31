package controller;

import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;
    //DTO - Data Transfer Object
    //problems with directly involving Models in the Controller API's :-
    //1. If we add/remove models from the input, current clients will start failing.
    //2. We should not expose the Model details to client because of privacy.
    //The solution to this : Data Transfer Objects (DTO).

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {

        // validation criminal lic no
        Ticket ticket = ticketService.generateTicket(
                generateTicketRequestDto.getVehicleNumber(),
                generateTicketRequestDto.getVehicleType(),
                generateTicketRequestDto.getGateId());


    }

    /* - CompleteProject
    4 service -
     */
}
