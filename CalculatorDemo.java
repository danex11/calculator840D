import java.util.Scanner;

class CalculateAlarm {
    String alarm;
    int dbbyte;
    int dbbit;
 
     
 public CalculateAlarm(String alarm){
     this.alarm = alarm;
     dbbyte = 0; //= Integer.parseInt(alarm);

     String chars1and2 = alarm.substring(0, 2);
 
     if (new String(chars1and2).equals("70"))
     {
         dbbyte = 100;
     }
     else{
        dbbyte=999;
     }
 }
 

 
 public int getDbByte(){
    return dbbyte;
 }
 
 }
 




public class CalculatorDemo{

    public static void main(String[] args){
        System.out.println("Write six digit alarm no.: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        CalculateAlarm calculateInstance = new CalculateAlarm(input);
        System.out.println("For alarm " + input + " adress in DB2 is " + calculateInstance.getDbByte());
        in.close();
  



    }



    // public int calculate(String alarmNo){
    //     String alarmNo;
    //     this.alarmNo = alarmNo;
    //     int byte;



    //     return byte
    // }

}