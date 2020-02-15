
import java.util.Calendar;

public class Room_Booking extends Booking implements Rental_Interface {
    private Room dwmatio;

    public Room_Booking(Room dwmatio, int id_krathshs, String onomatepwnymo, Calendar check_in, Calendar check_out) {
        super(id_krathshs, onomatepwnymo, check_in, check_out);
        this.dwmatio = dwmatio;
    }

    @Override
    public double Ypologismos_Timhs(int days) {
        double a = dwmatio.Ypologismos_Timis();
        return a*days;
    }

    @Override
    public boolean Diathesimothta(Calendar d1, Calendar d2, Calendar d3, Calendar d4) {
        if(d1.before(d3) && d2.before(d4))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Room_Booking{" + "dwmatio=" + dwmatio + '}';
    }
    
}
