public class Room {

   private int numberOfBeds;
   private double price;
   private boolean occupied;
   private boolean dirty;
    //   private boolean available;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
//        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }



    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }
    public void checkOut(){
        this.occupied = false;
    }
    public void cleanRoom(){
        this.dirty = false;
    }

    public boolean isAvailable(){
        return ( !this.occupied && !this.dirty );
    }

}
