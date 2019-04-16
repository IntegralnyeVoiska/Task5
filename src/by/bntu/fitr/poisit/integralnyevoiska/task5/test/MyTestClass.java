package by.bntu.fitr.poisit.integralnyevoiska.task5.test;

import by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity.TouristTrips;
import by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity.TourPackage;
import by.bntu.fitr.poisit.integralnyevoiska.task5.model.logic.Manager;
import org.junit.Test;
import org.junit.Assert;

public class MyTestClass {

    @Test
    public void checkTotalPrice()
    {
        TouristTrips tourTrip1 = new TouristTrips("Shopping","Poland",2,50);
        TouristTrips tourTrip2 = new TouristTrips("Crouise","Sweden",4,200);
        TouristTrips tourTrip3 = new TouristTrips("Recreation","Czech Republic",15,800);
        TouristTrips touristTrips[] = {tourTrip1,tourTrip2,tourTrip3};
        TourPackage tourPackage = new TourPackage("De Lux",touristTrips);

        int expected = 1050;
        Assert.assertEquals(expected,Manager.calculateTotalPrice(tourPackage));
    }

    @Test
    public void checkBestTour()
    {
        TouristTrips tourTrip1 = new TouristTrips("Shopping","Poland",2,50);
        TouristTrips tourTrip2 = new TouristTrips("Crouise","Sweden",4,200);
        TouristTrips tourTrip3 = new TouristTrips("Recreation","Czech Republic",15,800);
        TouristTrips touristTrips[] = {tourTrip1,tourTrip2,tourTrip3};
        TourPackage tourPackage = new TourPackage("De Lux",touristTrips);

        String expected = "Type of Tour:Shopping" + "\n" + "Place:Poland" + "\n" +
                "Amount of days:" + 2 + "\n" + "Cost:" + 50;

        Assert.assertEquals(expected,Manager.findTheBestOneTour(tourPackage));
    }
}
