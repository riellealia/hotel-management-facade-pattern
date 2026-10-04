public class Valet implements HotelService<String> {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is retrieving vehicle with plate number " + plateNumber + ".");
    }

    @Override
    public void provideService(String plateNumber) {
        pickUpVehicle(plateNumber);
    }
}
