import DTO.GenerateTicketRequestDto;
import controller.TicketController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GenerateTicketRequestDto generateTicketRequestDto =
                new GenerateTicketRequestDto();
        /*--*/
        TicketController ticketController = new TicketController();
        ticketController.generateTicket(generateTicketRequestDto);
    }
}