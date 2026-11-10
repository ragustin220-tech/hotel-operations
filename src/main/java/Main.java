import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main {
    public static void main (String [] args){


        Room r = new Room(2,124.00,false,true);
        System.out.println(r.isAvailable());

        Reservation r1 = new Reservation("king",20,false);

        System.out.println(r1.getPrice());
        System.out.println(r.getPrice());

        Employee An = new Employee(2, "An", "housekeeping", 20 , 10);

        System.out.println(An.getTotalPay());








    }
}
