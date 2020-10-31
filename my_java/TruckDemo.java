// Try This 7-1
// Build a subclass of Vehicle for trucks

class Vehicle {
  private int passengers; // number of passengers
  private int fuelcap;    // fuel capacity in gallons
  private int mpg;        // fuel consumtion in miles per gallon
  
//This class declares an object of type Vehicle
  Vehicle(int p, int f, int m) {
      passengers = p;
      fuelcap = f;
      mpg = m;
  }
  // return the range
  int range() {
      return mpg * fuelcap;
  }
  // compute fuel needed for a given distance.
  double fuelneeded(int miles) {
      return (double) miles / mpg;
  }
  
  // access methods for instance variables.
  int getPassengers() { return passengers; }
  void setPassengers(int p) { passengers = p; }
  int getFuelcap() { return fuelcap; }
  void setFuelcap(int f) { fuelcap = f; }
  int getMpg() { return mpg; }
  void setMpg(int m) { mpg = m;}
  
}

// extend vehicle to create a truck specialization.
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds
    
    // this is a constructor for truck.
    Truck(int p, int f, int m, int c) {
        /*
         * Initialize Vehicle members using
         * Vehicle's constructor.
         */
        super(p, f, m);
        
        cargocap = c;
    }
    
    // Accessor methods for cargocap
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
    public static void main(String args[]) {
        
        // contruct some trucks
        Truck semi   = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        
        gallons = semi.fuelneeded(dist);
        
        System.out.println("semi can carry " + semi.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");
        
        gallons = pickup.fuelneeded(dist);
        
        System.out.println("pickup can carry " + pickup.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.\n");
    }
}