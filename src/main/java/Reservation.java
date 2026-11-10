public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;
//    private double reservationTotal;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
       // this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
//        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice(){
        double basePrice;

        if (this.roomType.equalsIgnoreCase("King")) {
            basePrice = 139.0;
        }
        else if (this.roomType.equalsIgnoreCase("double")){
            basePrice = 124.0;
        }
        else{
            basePrice = 0;
        }
        if (weekend) {
            System.out.println(basePrice * .10);
        }
        else
            return basePrice;

        return basePrice;
    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
