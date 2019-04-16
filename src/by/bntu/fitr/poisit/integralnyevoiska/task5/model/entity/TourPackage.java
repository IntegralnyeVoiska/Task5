package by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity;
import by.bntu.fitr.poisit.integralnyevoiska.task5.model.entity.TouristTrips;

public class TourPackage {

   public String nameOfPackage;
   public TouristTrips[] touristTrips;

   public TourPackage()
   {
        nameOfPackage = "no name";
        touristTrips = null;
   }

   public TourPackage(String name,TouristTrips[] tourTrips)
   {
       this.nameOfPackage = name;
       touristTrips = tourTrips;
   }

   public TourPackage(TourPackage tourPackage)
   {
       nameOfPackage = tourPackage.nameOfPackage;
       touristTrips = tourPackage.touristTrips;
   }
}
