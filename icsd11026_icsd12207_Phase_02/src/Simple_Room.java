
public class Simple_Room extends Room {

    public Simple_Room(int arithmos_klinwn, boolean thea_jacuzzi) {
        super(arithmos_klinwn, thea_jacuzzi);
        super.setType("Simple");
        super.diathesimothta = true;
    }

    @Override
    public double Ypologismos_Timis() {
        double telikh_aplou = vasiko_kostos;
        if (arithmos_klinwn == 2) {
            telikh_aplou = vasiko_kostos * 1.6;
        } else if (arithmos_klinwn == 3) {
            telikh_aplou = vasiko_kostos * 2.1;
        }
        if (thea_jacuzzi == true) {
            telikh_aplou *= 1.1;
        }

        return telikh_aplou;
    }

    @Override
    public String toString() {
        return "Simple_Room{" + super.toString() + '}';
    }
    
}
