public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("\nCleaning room number: " + roomNumber);
    }

    @Override
    public void provideService() {
        cleanRoom();
    }
}
