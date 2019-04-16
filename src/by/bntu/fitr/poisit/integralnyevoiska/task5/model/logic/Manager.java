package by.bntu.fitr.poisit.integralnyevoiska.task5.model.logic;

import by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity.TourPackage;
import by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity.TouristTrips;
public class Manager {

    public static final int DEFAULT_SUM = 0;

    public static int calculateTotalPrice(TourPackage tourPackage)
    {
        int sum = DEFAULT_SUM;
        for(int i = 0 ; i < tourPackage.touristTrips.length; i++)
        {
            sum += tourPackage.touristTrips[i].getCost();
        }
        return sum;
    }

    public static String findTheBestOneTour(TourPackage tourPackage)
    {
        String bestTrip = "";
        double pricesPerDay = tourPackage.touristTrips[0].getCost() / tourPackage.touristTrips[0].getAmountOfDays();

        for(int i = 0; i < tourPackage.touristTrips.length; i++)
        {
            if(tourPackage.touristTrips[i].getCost() / tourPackage.touristTrips[i].getAmountOfDays() <= pricesPerDay)
            {
                bestTrip = tourPackage.touristTrips[i].toString();
            }
        }
        return bestTrip;
    }
}
