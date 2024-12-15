package midtermmangayao;

public class MidtermMangayao {


    public static void main(String[] args) {
       
        
        ticketReservationSystem q = new ticketReservationSystem(5);
        
        q.reserveTicket(101);
        q.reserveTicket(102);
        q.reserveTicket(103);
        q.reserveTicket(104);
        q.reserveTicket(105);
        q.reserveTicket(106);
        
        
        q.viewQueue();
        
        q.serveTicket();
        q.serveTicket();
        q.serveTicket();
        q.serveTicket();
//        q.serveTicket();
//        q.serveTicket();
        
        q.totalReservation();
        q.viewFirstReservation();
        
    }
    
}
