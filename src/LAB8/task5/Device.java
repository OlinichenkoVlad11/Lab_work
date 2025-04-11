package LAB8.task5;

class Device {
    public void turnOn() {
        System.out.println("Device is turning on...");
    }
}

//  Підклас Phone
class Phone extends Device {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }
}

//  Підклас Tablet
class Tablet extends Device {
    public void watchVideo() {
        System.out.println("Watching a video...");
    }
}

//  Клас SmartPhone
class SmartPhone extends Phone {
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Smartphone is ready to use!");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}

class Main {
    public static void main(String[] args) {


        System.out.println("=== Phone ===");
        Phone phone = new Phone();
        phone.turnOn();
        phone.makeCall();

        System.out.println("\n=== Tablet ===");
        Tablet tablet = new Tablet();
        tablet.turnOn();
        tablet.watchVideo();

        System.out.println("\n=== SmartPhone ===");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.turnOn();
        smartPhone.makeCall();
        smartPhone.browseInternet();

        // Демонстрація ієрархії наслідування
        System.out.println("\n--- Ієрархія наслідування ---");
        System.out.println("Device");
        System.out.println("├── Phone");
        System.out.println("│   └── SmartPhone");
        System.out.println("└── Tablet");
    }
}
