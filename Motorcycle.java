package vehicleparking;




public class Motorcycle extends Vehicle
{
    public static String[] IDM = new String[55];
    public static int indx4=0;
    public Motorcycle(String id)
    {
        super(id);
        Length = 2;
        Cost = 5;
        indx4++;
    }
    public Motorcycle(String id , double H)
    {
        super(id , H);
        Length = 2;
        Cost = 5;
    }
    
    public static void setID(String id)
    {
        IDM[indx4] = id;
    }
    public double getPrice(String id)
    {
        for(int i=1;i<=50;i++)
        {
            if(id.equals(IDM[i]))
            {
                IDM[i] = null;
                return this.CalcMoney(Cost , Hours); 
            }         
        }
        return 0.0;
    }
}
