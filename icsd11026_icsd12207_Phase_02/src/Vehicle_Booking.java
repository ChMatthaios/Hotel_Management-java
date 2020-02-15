
import java.util.Calendar;

public class Vehicle_Booking extends Booking implements Rental_Interface {
    private Vehicle oxhma;

    public Vehicle_Booking(Vehicle oxhma, int id_krathshs, String onomatepwnymo, Calendar check_in, Calendar check_out) {
        super(id_krathshs, onomatepwnymo, check_in, check_out);
        this.oxhma = oxhma;
    }

    @Override
    public double Ypologismos_Timhs(int days) {
        double b = oxhma.Ypologismos_Timis();
        return b*days;
    }

    @Override
    public boolean Diathesimothta(Calendar d1, Calendar d2, Calendar d3, Calendar d4) {
        if(d1.before(d3) && d2.before(d4))
            return true;
        return false; 
    }

    @Override
    public String toString() {
        return "Vehicle_Booking{" + "oxhma=" + oxhma + '}';
    }
    
}
