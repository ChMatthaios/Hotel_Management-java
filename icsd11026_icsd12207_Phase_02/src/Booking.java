
import java.util.Calendar;

public class Booking {
    protected int id_krathshs;
    protected String onomatepwnymo;
    protected Calendar check_in, check_out;

    public Booking(int id_krathshs, String onomatepwnymo, Calendar check_in, Calendar check_out) {
        this.id_krathshs = id_krathshs;
        this.onomatepwnymo = onomatepwnymo;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public int getId_krathshs() {return id_krathshs;}
    public String getOnomatepwnymo() {return onomatepwnymo;}
    public Calendar getCheck_in() {return check_in;}
    public Calendar getCheck_out() {return check_out;}

    public void setId_krathshs(int id_krathshs) {this.id_krathshs = id_krathshs;}
    public void setOnomatepwnymo(String onomatepwnymo) {this.onomatepwnymo = onomatepwnymo;}
    public void setCheck_in(Calendar check_in) {this.check_in = check_in;}
    public void setCheck_out(Calendar check_out) {this.check_out = check_out;}

    @Override
    public String toString() {
        return "Booking{" + "id_krathshs=" + id_krathshs + ", onomatepwnymo=" + onomatepwnymo + ", check_in=" + check_in + ", check_out=" + check_out + '}';
    }
}
