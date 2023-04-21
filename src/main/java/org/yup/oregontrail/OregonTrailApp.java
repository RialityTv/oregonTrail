package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String[] args){

        Traveler dwene = new Traveler("dwene", 100,100 );


        System.out.println("before hunting food: " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println("After hunting " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.getFood());

        Traveler rial = new Traveler("rial", 100,100 );

        Wagon ourWagon = new Wagon(5);

        //asking the wagon to give us the passenger list and we are checking the size(number of passengers)
        System.out.println("number of people on the wagon: " + ourWagon.getPassengers().size());
        //this line attempts to put dwene (or any traveler) into the wagon if there is room
        System.out.println(ourWagon.join(dwene));
        //asking the wagon to give us the passenger list and we are checking the size(number of passengers)
        System.out.println("number of people on the wagon: " + ourWagon.getPassengers().size());

        //this line attempts to put dwene (or any traveler) into the wagon if there is room
        System.out.println(ourWagon.join(rial));

        System.out.println(ourWagon.getTotalFood());
    }


}
