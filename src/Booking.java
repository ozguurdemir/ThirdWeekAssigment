import java.util.List;

public class Booking {
    final int BUSINESS = 1000;
    //SeatPicker seatPicker = new SeatPicker();
    public int bookTicket(Airline airline, List<String> seatList){

        int price=airline.ticketPricing();
        String selectedSeat = SeatPicker.pickSeat(airline, seatList);
        if (airline.isBusiness){
            price=airline.ticketPricing()+BUSINESS;
        }
        return price;

    }
}
