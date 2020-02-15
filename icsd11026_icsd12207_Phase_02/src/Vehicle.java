
public abstract class Vehicle {
    static int k = 1001;
    protected int AK;
    protected boolean diathesimothta;

    public Vehicle() {
        AK = k++;
        diathesimothta = true;
    }
    
    public abstract double Ypologismos_Timis();

    @Override
    public String toString() {
        return "Vehicle{" + "AK=" + AK + ", diathesimothta=" + diathesimothta + '}';
    }
    
}
