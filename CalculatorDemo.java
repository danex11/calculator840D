import java.util.Scanner;

class CalculateAlarm {
    String alarm;
    int dbbyte;
    int dbbit;
 
     
 public CalculateAlarm(String alarm){
     this.alarm = alarm;
     dbbyte = 0; //= Integer.parseInt(alarm);

    String chars12 = alarm.substring(0, 2);
    String chars34 = alarm.substring(2, 4);
    String chars567 = alarm.substring(4, 7);
 
     if (new String(chars12).equals("70"))
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
 
 
 
public void group70(String chars34, String chars567)
{

}

public void group60(String chars34, String chars567)
{

}

public void group50(String chars34, String chars567)
{

}


public class CalculatorDemo{

    public void main(String[] args){
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
}