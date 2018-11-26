package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Athlete athlete=new Athlete();
        athlete.setDataTheAthlete(5555,"Taison Li","USA","boxing", (short) 2);
        Athlete athlete1=new Athlete();
        athlete1.setDataTheAthlete(5545,"Mac Li","USA","biathlon", (short) 1);

       // athlete.getDataTheAthlete();
        Data data=new Data();
        data.add(athlete);
        data.add(athlete1);
        data.outData();
        System.out.println("-----------------------------------");
        data.taskD();
        System.out.println("-----------------------------------");
        data.outData();


    }
}
