import java.util.List;

public class Main {
    public static void main(String[] args) {

        TurkishAirlines turkishAirlines = new TurkishAirlines(Company.THY, 700,false);
        Pegasus pegasus = new Pegasus(Company.PEGASUS,650,true);
        List<String> seatList = SeatGenerator.generateSeatList(42,6);
        Booking booking = new Booking();
        int price = booking.bookTicket(turkishAirlines,seatList);
        System.out.println(price);
        System.out.println(pegasus.getName());
        //pegasus.food();
        int price2=booking.bookTicket(pegasus,seatList);

    }
}