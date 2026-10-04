public class HouseKeeping implements HotelService<Integer> {
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping has been requested to clean room " + roomNumber + ".");
    }

    @Override
    public void provideService(Integer roomNumber) {
        cleanRoom(roomNumber);
    }
}
