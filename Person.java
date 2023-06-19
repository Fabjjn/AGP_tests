package package_PP;

import java.util.Arrays;

public class Person {
    // implementujte 3 atributy: RČ, Jméno, Bydliště (město stačí), Věk
    private long[] RodneCislo = new long[10];
    private String Name;
    private String City;
    private int Age;

    // implementujte konstruktor s parametry: RČ, Jméno, Bydliště. Věk vypočtěte z rodného čísla.
    public Person(long[] RC, String name, String city){
        this.RodneCislo = RC;
        this.City = city;
        this.Name = name;
        if(this.City == null){
            this.City = "Uprchlík z Mexika";
        }
        else{
            this.City = city;
        }


        // warcrime
        if (Integer.parseInt(ejg()) < 23){
            if (Integer.parseInt(month()) > 6) {
                Age = 23 - Integer.parseInt(ejg()) - 1;
            }
            else{
                Age = 23 - Integer.parseInt(ejg());
            }
        }
        else {
            if (Integer.parseInt(month()) > 6) {
                Age = 123 - Integer.parseInt(ejg()) - 1;
            } else {
                Age = 123 - Integer.parseInt(ejg());
            }
        }



    }
    private String ejg(){
        String RCStr = "";

        for(int i = 0; i < 2; i++){
            RCStr += RodneCislo[i];
        }
        return RCStr;
    }
    private String month(){
        String RCMnthStr = "";

        for(int i = 2; i < 4; i++){
            RCMnthStr += RodneCislo[i];
        }
        return RCMnthStr;
    }
    //TODO: see a psychiatrist

    // implementujte get a set pro atributy, uvědomte si které lze měnit

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public int getAge() {
        return Age;
    }

    // implementujte metodu toString, ta bude vracet řetězec ve formátu: "Jméno: attr_name; Bydliště: attr_homeTown; Věk: attr_age"

    @Override
    public String toString() {
        return  "Jméno: " + Name +
                "; Bydliště: " + City +
                "; Věk: " + Age ;
    }


    // implementujte metodu sayHi, která jako vstupní parametr dostane objekt třídy Person (člověka).
    // Daného člověka následně osloví a popřeje mu hezký den. Například:
    // "Jan: Aá, František. Dlouho jsme se neviděli, doufám, že se máš ve věku 32 dobře.
    // Přeji ti hezký den a užívej si sluníčko."
    //By slanja
    public String sayHi(Person kaja){
        return this.getName() + ": Aá, " + kaja.getName() + ". Dlouho jsme se neviděli, doufám, že se máš ve věku " + kaja.getAge() + " dobře. Přeji ti hezký den a užívej si sluníčko";
    }
}
