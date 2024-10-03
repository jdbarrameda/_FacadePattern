public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("NEU0301");

        frontDesk.requestHouseKeeping(2004);

        frontDesk.requestCart(3);
    }
}
