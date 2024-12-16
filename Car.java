package vehicleparking;




public class Car extends Vehicle
{
    public static String[] IDC = new String[55];
    public static int indx3 = 0;
    public Car(String id)
    {
        super(id);
        Length = 5;
        Cost = 10;
        indx3++;
    }
    public Car(String id , double H)
    {
        super(id , H);
        Length = 5;
        Cost = 10;
    }
    
    public static void setID(String id)
    {
        IDC[indx3] = id;
    }
    public double getPrice(String id)
    {
        for(int i=1;i<=50;i++)
        {
            if(id.equals(IDC[i]))
            {
                IDC[i] = null;
                return this.CalcMoney(Cost , Hours);
            }         
        }
        return 0.0;
    }
}
