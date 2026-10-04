public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Hotel Guest Service Requests ===");
        frontDesk.requestVehiclePickUp("ABC-1234");
        frontDesk.requestRoomCleaning(305);
        frontDesk.requestLuggageCart(2);
    }
}
