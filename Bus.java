package vehicleparking;




public class Bus extends Vehicle 
{
    public static String[] IDB = new String[55];
    public static int indx2 = 0;
    public Bus(String id)
    {
        super(id);
        Length = 10;
        Cost = 15;
        indx2++;
    }
    public Bus(String id , double H)
    {
        super(id , H);
        Length = 10;
        Cost = 15;
    }
    
    public static void setID(String id)
    {
        IDB[indx2] = id;
    }
    public double getPrice(String id)
    {
        for(int i=1;i<=50;i++)
        {
            if(id.equals(IDB[i]))
            {
                IDB[i] = null;
                return this.CalcMoney(Cost , Hours);  
            }
        }
        return 0.0;
    }
}
