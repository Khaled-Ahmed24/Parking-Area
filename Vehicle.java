package vehicleparking;




public class Vehicle 
{
    int Length;
    String ID;
    double Hours;
    int Cost;
    public Vehicle(String id)
    {
        ID = id;
    }
    public Vehicle(String id , double H)
    {
        ID = id;
        Hours = H;
    }
    public Boolean Adding()
    {
        int count = 0;
        for(int i=1;i<=100;i++)
        {
            if(VehicleParking.Spaces[i] == null)
                count++;
            else
                count = 0;
            if(count == Length)
            {
                for(int S = i - Length + 1;S <= i;S++)
                {
                    VehicleParking.Spaces[S] = ID;
                }
                return true;
            }
        }
        return false;
    }
    public double CalcMoney(int C , double H)
    {
        return Cost * Hours;
    }
}
