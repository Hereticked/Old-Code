public class TestBikes {
  public static void main(String[] args){
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();

  }
}


// Bike is in gear 1 with a cadence of 20 and travelling at a speed of 10. 
//
// Bike is in gear 5 with a cadence of 20 and travelling at a speed of 10. 
// The MountainBike has a Dual suspension.
//
// Bike is in gear 8 with a cadence of 40 and travelling at a speed of 20. 
// The RoadBike has 23 MM tires.