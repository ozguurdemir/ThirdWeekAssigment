public class Pegasus extends Airline implements Catering{
    public Pegasus(Company name, int fare, boolean isInternational) {
        super(name, fare, isInternational);
    }

    @Override
    public void food() {
        if (isInternational == true){
            System.out.println("yemek verildi");
        }
    }
}
