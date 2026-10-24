abstract class EnergySource {
    String name;
    double energy;

    EnergySource(String n, double e) {
        name = n;
        energy = e;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source: " + name);
        System.out.println("Energy Generated: " + energy + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println();
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(String n, double e) {
        super(n, e);
    }

    double calculateEfficiency() {
        return (energy / 8000) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(String n, double e) {
        super(n, e);
    }

    double calculateEfficiency() {
        return (energy / 5000) * 100;
    }
}

public class EnergySources {
    public static void main(String[] args) {
        EnergySource s = new SolarEnergy("Solar", 6000);
        EnergySource w = new WindEnergy("Wind", 4000);

        s.display();
        w.display();
    }
}