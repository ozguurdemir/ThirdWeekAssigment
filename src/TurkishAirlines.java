public class TurkishAirlines extends Airline implements Catering {
    public TurkishAirlines(Company name, int fare, boolean isInternational) {
        super(name, fare, isInternational);
    }

    @Override
    public void food() {
        System.out.println("Yemek verildi");
    }
}
