package Übungen_PR2.Hotel;

public class Key {

    private boolean withGuest;
    private int roomnumber;

    //Constructor-----------------------------------------------
    public Key(boolean withGuest, int roomnumber) {
        this.withGuest = withGuest;
        this.roomnumber = roomnumber;
    }


    //Getter und Setter
    public boolean isWithGuest() {
        return withGuest;
    }

    public void setWithGuest(boolean withGuest) {
        this.withGuest = withGuest;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    @Override
    public String toString() {
        return "Key{" +
                "withGuest=" + withGuest +
                ", roomnumber=" + roomnumber +
                '}';
    }
}

