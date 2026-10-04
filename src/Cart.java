public class Cart implements HotelService<Integer> {
    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " luggage cart(s) have been requested.");
    }

    @Override
    public void provideService(Integer numberOfCarts) {
        requestCart(numberOfCarts);
    }
}
