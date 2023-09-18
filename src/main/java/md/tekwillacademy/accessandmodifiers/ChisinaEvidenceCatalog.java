package md.tekwillacademy.accessandmodifiers;

import md.tekwillacademy.accessandmodifiers.peopleevidence.Person;

public class ChisinaEvidenceCatalog {
    public static void main(String[] args) {
        Person ionPerson = new Person("Ion", "Burlacu", 458774455);
        ionPerson.isRetired = true;
        if(ionPerson.isRetired){
            System.out.println("Ion este la pensie");
        }
        else {
            System.out.println("Ion nu este la pensie");
        }
        Person dariaMecan = new Person("Daria", "Mecan", 46546546, "Chisinau", true);
        if(dariaMecan.isRetired){
            System.out.println("Daria este pensionata");
        }
        else{
            System.out.println("Daria nu este pensionata");
        }
        Person anaToma = new Person("Ana", "Toma", 65324532, "Drochia", false);
        if (anaToma.isRetired){
            System.out.println("Ana este pensionata");
        }
        else{
            System.out.println("Ana nu este pensionata");
        }
        Person vasileBesleu = new Person("Vasile", "Besleu", 54763452, "Orhei", true);
        if (vasileBesleu.isRetired){
            System.out.println("Vasile este pensionat");
        }
        else{
            System.out.println("Vasile nu este pensionat");
        }
        Person mariaApostol = new Person("Maria", "Apostol", 82310923, "Chisinau", false);
        if(mariaApostol.isRetired){
            System.out.println("Maria este pensionata");
        }
        else{
            System.out.println("Maria nu este pensionata");
        }
        }
    }

