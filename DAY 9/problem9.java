class Furniture {

    String type = "Sofa";

    void display() {
        System.out.println("Furniture : " + type);
    }
}

class Room {

    Furniture furniture = new Furniture();

    void displayRoom() {
        System.out.println("Room");
        furniture.display();
    }
}

class House {

    Room room = new Room();

    void displayHouse() {
        System.out.println("House");
        room.displayRoom();
    }
}

public class Main {

    public static void main(String[] args) {

        House h = new House();
        h.displayHouse();
    }
}