public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestVehiclePickUp(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
