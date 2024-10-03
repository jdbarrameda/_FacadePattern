public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("\nRequesting " + numberOfCarts + " luggage carts.\n");
    }

    @Override
    public void provideService() {
        requestCart();
    }
}
