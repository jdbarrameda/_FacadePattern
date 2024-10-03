public class FrontDesk {
    public void requestValet(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.provideService();
    }

    public void requestHouseKeeping(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.provideService();
    }

    public void requestCart(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.provideService();
    }
}
