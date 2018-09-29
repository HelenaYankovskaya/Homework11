package task1;

public class Time {
    static int h = 10; //часы экзамена
    static int m = 20;   //минуты экзамена
    static int hs = 10;  //часы прибытия
    static int ms = 10;   // минуты прибытия
    static int p;
    static int z;
    public static void main(String[] args) {
     if (h == hs){
         if (ms  > m){
             z = ms - m;
             System.out.println("Студент опоздал на " + z + " минут");}
         else
             System.out.println("Студент пришел вовремя");}
             else {
        if (h > hs) {
         p = (m + (h - hs) * 60 - ms);
         {
             if (p > 30) {
                 p = p - 30;
                 System.out.println("Студент пришел зарано на " + p + " минут");
             } else {
                 System.out.println("Студент пришел вовремя");
             }
         }
     }
        else
                if (hs > h){
                    z = (ms + (hs - h) * 60 - m);
                 System.out.println("Студент опоздал на " + z + " минут");}
                else
        { System.out.println("Студент пришел вовремя"); }
            } } }
