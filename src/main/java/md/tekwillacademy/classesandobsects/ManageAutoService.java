package md.tekwillacademy.classesandobsects;

import md.tekwillacademy.classesandobsects.autoservicetask.Car;
import md.tekwillacademy.classesandobsects.autoservicetask.Garage;
import md.tekwillacademy.classesandobsects.autoservicetask.Person;
import md.tekwillacademy.classesandobsects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoDocGarage;

        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan Cel Mare, Ihub 64";
        autoDocGarage.surfaceM2 = 450.0F;

                System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
        + "   " + autoDocGarage.surfaceM2 + "   " + autoDocGarage.capacity);

        autoDocGarage.capacity = 50;

                System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
                + "   " + autoDocGarage.surfaceM2 + "   " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();

                System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + garajIaloveni.address
                + "   " + garajIaloveni.surfaceM2 + "   " + garajIaloveni.capacity);

        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;
                System.out.println("Obiectul nostru are numele de " + vasile.name + " si are " + vasile.age + "ani");
        Worker ion = new Worker();
        ion.name = "Ion";
        ion.age = 35;
        System.out.println("Obiectul nostru are numele de " + ion.name + " si are " + ion.age + "ani");

        Person client1 = new Person("+37360621323");

        Car porscheNKK132 = new Car("AWE123456789", "Porsche Cayenne", client1);
        Car mercedesBenzTransit = new Car("RTS900000000", "Mercedes Benz", new Person ("+37360621323"));

        System.out.println("Masina noastra este " + porscheNKK132.mark + " si proprietarul poate fi apelat la: " + porscheNKK132.owner.phoneNumber);
        System.out.println("Masina noastra este " + mercedesBenzTransit.mark + " si proprietarul poate fi apelat la: " + mercedesBenzTransit.owner.phoneNumber);
    }
}
