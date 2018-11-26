package com.company;

public class Athlete {
    int AthleteRegistrationNumber;
    String nameOfTheAthlete;
    String NameOfTheCountry;
    String sport;
    short Place;
    public void setDataTheAthlete(int AthleteRegistrationNumber,String nameOfTheAthlete,String NameOfTheCountry,
            String sport,short Place){
        setAthleteRegistrationNumber(AthleteRegistrationNumber);
        setNameOfTheAthlete(nameOfTheAthlete);
        setNameOfTheCountry(NameOfTheCountry);
        setSport(sport);
        setPlace(Place);
    }
    public void getDataTheAthlete(){
        System.out.print("Спортсмен под номером "+this.getAthleteRegistrationNumber());
        System.out.print(" "+getNameOfTheAthlete());
        System.out.print(",представляющий страну "+this.getNameOfTheCountry());
        System.out.print(" в виде спорта "+this.getSport());
        System.out.print(" занял "+this.getPlace()+" место.");
    }

    public void setAthleteRegistrationNumber(int temp){
        //предположим, номер спотртсена может иметь только 4 знака
        if(temp>999&&temp<10000)
        this.AthleteRegistrationNumber=temp;
        else
            System.out.println("Ошибка при записи номера! Номер должен содержать 4 знака!");
    }
    public int getAthleteRegistrationNumber(){
        return this.AthleteRegistrationNumber;
    }
    public void setNameOfTheAthlete(String temp){
        if(temp.length()>3)
        this.nameOfTheAthlete=temp;
        else
            System.out.println("Слишком короткое имя спортсмена!");
    }
    public String getNameOfTheAthlete(){
        return this.nameOfTheAthlete;
    }
    public void setNameOfTheCountry(String temp){
        boolean flag=false;
        for (Country c:Country.values()) {
            if(c.toString().equals(temp)){
                this.NameOfTheCountry=temp;
                flag=true;
                break;
            }
        }
        if (flag==false)
            System.out.println("Введена не существующая страна!");
    }
    public String getNameOfTheCountry(){
        return this.NameOfTheCountry;
    }
    public void setSport(String temp){
        boolean flag = false;
        for (sports s:sports.values()) {
            if (s.toString().equals(temp)){
                this.sport=temp;
                flag=true;
                break;
            }
        }
        if (flag==false)
            System.out.println("Введенный вид спорта не зарегестрирован!");
    }
    public String getSport(){
        return this.sport;
    }
    public void setPlace(short temp){
       //если в номере спортсмена лишь четыре знака, то таких спортсменов,как и мест - 9 998
        if (temp>0&&temp<9999)
            this.Place=temp;
        else
            System.out.println("Введённое место не существует!");
    }
    public short getPlace(){
        return this.Place;
    }

    enum Country{
        USA,
        Ukraine,
        Russia,
        Bulgaria,
        Belarus,
        Germany,
        Great ,
        Britain,
        Japan,
        Monaco
    }
    enum sports{
        boxing,
        freestyle,
        wrestling,
        skiing,
        basketball,
        biathlon,
        swimming,
        fencing
    }
}
