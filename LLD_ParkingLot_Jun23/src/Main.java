import DTO.GenerateTicketRequestDto;
import Repository.TicketRepository;
import controller.TicketController;
import services.TicketService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        GenerateTicketRequestDto generateTicketRequestDto =
//                new GenerateTicketRequestDto();
//        /*--*/
//        TicketController ticketController = new TicketController();
//        ticketController.generateTicket(generateTicketRequestDto);

        ObjectContainer objectContainer = new ObjectContainer();

        TicketService ticketService = new TicketService();
        objectContainer.register("ticketService", ticketService);

        TicketController ticketController =
                new TicketController((TicketService) objectContainer.get("ticketService"));

    }

    /*
    Assignment - complete generate ticket and implement generate bill
     */
}