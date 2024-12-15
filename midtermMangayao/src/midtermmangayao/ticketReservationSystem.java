package midtermmangayao;

public class ticketReservationSystem {

    int front, back;
    int size ;
    int[] item;

    ticketReservationSystem(int x) {

        front = -1;
        back = -1;
        size = x;
        item = new int[size];

    }

    boolean isFull() {
        return back == size - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    public void reserveTicket(int x) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            front = 0;
            back++;
            item[back] = x;
            System.out.println("Ticket " + x + " reserved successfully");
        }
    }

    public int serveTicket() {
        int x;
        if (isEmpty()) {
            System.out.println("Empty");
            return (-1);
        } else {
            x = item[front];
            if (front >= back) {
                front = -1;
                back = -1;
            } else {
                front++;
            }
            System.out.println("Ticket " + x + " served");
            return (x);
        }
    }
    
    public void totalReservation() {
        
      System.out.println("");
      if (isEmpty()) {
            System.out.println("Empty");
            System.exit(0);
        }
      for (int i = back; i <= back; i++) {
            System.out.println("Total reservation: ");
            System.out.println(item.length - front);
        }
         System.out.println("");
    }
    
    public void viewFirstReservation() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
        System.out.println("First Reservation: ");
        System.out.println(item[front]);
        }
    }

    public void viewQueue() {
        if (isEmpty()) {
            System.out.println("Empty");
            System.exit(0);
        }
        System.out.println("");
        System.out.println("current queue after reservation");
        System.out.println("items");
        
        for (int i = front; i <= back; i++) {
            System.out.println(item[i]);
        }
        System.out.println("");
        
    }
}
