package vehicleparking;




public class Truck extends Vehicle 
{
    public static String[] IDT = new String[55];
    public static int indx1 = 0;
    public Truck(String id)
    {
        super(id);
        Length = 7;
        Cost = 15;
        indx1++;
    }
    public Truck(String id , double H)
    {
        super(id , H);
        Length = 7;
        Cost = 15;
    }
    public static void setID(String id)
    {
        IDT[indx1] = id;
    }
    public double getPrice(String id)
    {
        for(int i=1;i<=50;i++)
        {
            if(id.equals(IDT[i]))
            {
                IDT[i] = null;
                return this.CalcMoney(Cost , Hours);
            }
        }
        return 0.0;
    }
    
}
