package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    ArrayList<Athlete> Data= new ArrayList<Athlete>();
    public void add(Athlete athlete){
        this.Data.add(athlete);
    }
    public void outData(){
        for (int i = 0; i <Data.size() ; i++) {
            System.out.println("Athlete Registration Number:\n"+Data.get(i).AthleteRegistrationNumber+
            "\nname Of The Athlete:\n"+Data.get(i).nameOfTheAthlete+
                    "\nName Of The Country:\n"+Data.get(i).NameOfTheCountry+
                    "\nsport:\n"+Data.get(i).sport+"\nPlace:\n"+Data.get(i).Place);
        }
    }
    public void taskB(){

       Athlete.Country[] countries =Athlete.Country.values();
        ArrayList<CountryVictories> countryVictories=new ArrayList<CountryVictories>();
        for (int i = 0; i <countries.length ; i++) {

            countryVictories.add(new CountryVictories(countries[i].toString()));
            //System.out.println(countryVictories.get(i).name);
        }

        for (int i = 0; i < Data.size(); i++) {
            if(Data.get(i).Place==1){
                for (int j = 0; j <countryVictories.size() ; j++) {
                    if(Data.get(i).getNameOfTheCountry().equals(countryVictories.get(j).getName()))
                        countryVictories.get(j).inrGold();
                }
            }
            else if(Data.get(i).Place==2){
                for (int j = 0; j <countryVictories.size() ; j++) {
                    if(Data.get(i).getNameOfTheCountry().equals(countryVictories.get(j).getName()))
                        countryVictories.get(j).inrSilver();
                }
            }
            else if(Data.get(i).Place==3){
                for (int j = 0; j <countryVictories.size() ; j++) {
                    if(Data.get(i).getNameOfTheCountry().equals(countryVictories.get(j).getName()))
                        countryVictories.get(j).inrBronze();
                }
            }
        }
        

        for (int i = 0; i < countryVictories.size(); i++) {
            if(countryVictories.get(i).gold>0)
                System.out.println(countryVictories.get(i).name+". gold medals:"+countryVictories.get(i).gold);
            if(countryVictories.get(i).silver>0)
                System.out.println(countryVictories.get(i).name+". silver medals:"+countryVictories.get(i).silver);

            if(countryVictories.get(i).bronze >0)
                System.out.println(countryVictories.get(i).name+". bronze medals:"+countryVictories.get(i).bronze);


        }
    }
    public void taskA(){
        Athlete.sports[] sports=Athlete.sports.values();
        boolean flag=false;
        for (int i = 0; i <sports.length ; i++) {
            System.out.println(sports[i]+"\n--------------------------------------");
            for (int j = 0; j <Data.size() ; j++) {
                String s1=Data.get(j).getSport();
                String s =sports[i].toString();

                //System.out.println(sports[i]);
                if((Data.get(j).getPlace()<4))

                if (Data.get(j).getSport().equals(sports[i].toString())){
                    System.out.println("Name "+Data.get(j).getNameOfTheAthlete()+". Place:"+Data.get(j).getPlace());
                    flag=true;
                }
                System.out.println("\n----------------------------------");
            }
            if(!flag){
                System.out.println("not winner.");
            }
        }
    }

    public void taskC(){
        System.out.println("Input country:");
        String c;
        Scanner scanner=new Scanner(System.in);
        c=scanner.next();
        Athlete.Country[] countries =Athlete.Country.values();
        boolean flag=false;
        for (int i = 0; i <countries.length ; i++) {
            if(countries[i].toString().equals(c)){
                flag=true;
                break;
            }
        }
        if(flag){
            for (int i = 0; i < Data.size(); i++) {
                if(Data.get(i).getNameOfTheCountry().equals(c)){
                    Data.get(i).getDataTheAthlete();
                }
            }
            System.out.println();
        }
        else
            System.out.println("not country");


    }
    public void taskD(){
        System.out.println("Input name of the Athlete:");
        Scanner scanner=new Scanner(System.in);
        String deleteName=scanner.nextLine();
        boolean flag=false;
        for (int i = 0; i <Data.size() ; i++) {
            if(Data.get(i).getNameOfTheAthlete().equals(deleteName)){
                System.out.println("Athlete detected!");
                Data.remove(i);
                break;
            }

        }

    }

}
