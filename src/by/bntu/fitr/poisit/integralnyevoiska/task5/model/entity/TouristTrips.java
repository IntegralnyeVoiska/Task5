package by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity;

public class TouristTrips {

    public static int numberOfTours;

    private String typeOfTour;
    private String place;
    private int cost;
    private int amountOfDays;


    public TouristTrips()
    {
        typeOfTour = "no type";
        place = "no place";
        cost = 0;
        amountOfDays = 0;
    }

    public TouristTrips(String typeOfTour,String place,int amountOfDays,int cost)
    {
        this.place = place;
        this.cost = cost;
        this.amountOfDays = amountOfDays;
        this.typeOfTour = typeOfTour;
    }

    public TouristTrips(TouristTrips touristTrips)
    {
        place = touristTrips.place;
        cost = touristTrips.cost;
        amountOfDays = touristTrips.amountOfDays;
        typeOfTour = touristTrips.typeOfTour;
    }

    public String getPlace() {return place;}

    public String getTypeOfTour() {return typeOfTour;}

    public int getCost() {return cost;}

    public int getAmountOfDays() {return amountOfDays;}

    public void setPlace(String aplace) {place = aplace;}

    public void setCost(int acost) {cost = acost;}

    public void setAmountOfDays(int aamountOfDays){amountOfDays = aamountOfDays;}

    public void setTypeOfTour(String atypeOfTour){typeOfTour = atypeOfTour;}

    @Override
    public String toString()
    {
        return "Type of Tour:" + typeOfTour + "\n" + "Place:" + place + "\n" +
                "Amount of days:" + amountOfDays + "\n" + "Cost:" + cost;
    }
}
