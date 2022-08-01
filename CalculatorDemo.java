import java.util.Scanner;

class CalculateAlarm {
    String alarm;
    String dbaddress;
 
     
 public CalculateAlarm(String alarm){
     this.alarm = alarm;
    dbaddress = "nn";

    String chars12 = alarm.substring(0, 2);
    String chars34s = alarm.substring(2, 4);
    int digs34 = Integer.parseInt(chars34s);
    String chars56s = alarm.substring(4, 6);
    int digs56 = Integer.parseInt(chars56s);


     if (new String(chars12).equals("70"))
     {
         dbaddress = group70(digs34, digs56);
     }
     else if (new String(chars12).equals("60"))
     {
        dbaddress="TODO group 60";
     }
    else if (new String(chars12).equals("50"))
    {
        dbaddress="TODO group 50";
    }   
    else { dbaddress="not found";}
 }
 

    public String getDbAddress(){
     return dbaddress;
    }
 
    public String group70(int digs34loc, int digs56loc)
    {
        int byte70 = 180 + (8 * digs34loc);
        byte70 += digs56loc/8;        //truncate (to int) (i.e. drop everything after the decimal dot)
        int bit70 = digs56loc%8;
        String bb = String.format("byte %3d bit %2d", byte70, bit70);
        return bb;
    }

    public void group60(int digs34, int digs567)
    {

    }

    public void group50(int digs34, int digs567)
    {

    }
}

public class CalculatorDemo{

    public static void main(String[] args){
        System.out.println("Write six digit alarm no.: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        CalculateAlarm calculateInstance = new CalculateAlarm(input);
        System.out.println("For alarm " + input + " adress in DB2 is " + calculateInstance.getDbAddress());
        in.close();
  
    }
}

