import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        LinkedHashMap<String,Integer> items=new LinkedHashMap<>();
        items.put("vadai",20);
        items.put("tea",20);
        items.put("coffee",25);
        items.put("juice",20);
        items.put("milkshake",50);
        items.put("breadomlet",40);
        items.put("dosa",30);
        items.put("parotta",30);
        items.put("chapathi",30);
        items.put("idly",20);
        items.put("poori",30);
        items.put("omlet",25);
        items.put("frenchfries",60);
        System.out.println("FOOD COURT BILLING SOFTWARE");
        int BILLNO=567;
        System.out.println("MENU:");
        for(Map.Entry<String,Integer> e:items.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        while (true)
        {
            System.out.println("Enter 1 to start/continue & 0 to end!");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            sc.nextLine();
            if(x==1)
            {
                BILLNO++;
                StringBuilder sb=new StringBuilder();
                int sum=0;
                while (true)
                {
                    System.out.println("Enter the items name!");
                    String itemName=sc.nextLine();
                    if(itemName.equals("x"))
                    {
                        break;
                    }
                    if (items.containsKey(itemName)) {
                        int itemCost = items.get(itemName);
                        sb.append(itemName).append(": ₹").append(itemCost).append("\n");
                        sum += itemCost;
                    } else {
                        System.out.println("Item not found in the menu. Please try again.");
                    }
                }
                LocalTime myObj1 = LocalTime.now();
                System.out.println("....LAKSHMI CATERING SERVICES....");
                System.out.println("TIME:"+myObj1);
                LocalDate myObj = LocalDate.now();
                System.out.println("DATE:"+myObj);
                System.out.println("BILL NO. "+BILLNO);
                System.out.println("BILL");
                System.out.println("item  cost");
                System.out.println(sb.toString());
                System.out.println("GST: ₹"+(sum*0.02));
                System.out.println("AMOUNT:  ₹"+(sum+(sum*0.02)));
                System.out.println("................................");
            }
            else {
                break;
            }
        }
    }
}