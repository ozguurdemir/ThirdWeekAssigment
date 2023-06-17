public abstract class Airline {
    Company name;
    boolean isBusiness;
    int fare;
    boolean isInternational;

    public int ticketPricing(){
        return fare;
    }

    public Airline(Company name,  int fare, boolean isInternational) {
        this.name = name;
        this.fare = fare;
        this.isInternational = isInternational;
    }

    public Company getName() {
        return name;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public void setName(Company name) {
        this.name = name;
    }
}
