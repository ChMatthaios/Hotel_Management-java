
public class Luxury_Room extends Room{
    
    public Luxury_Room(boolean thea_jacuzzi) {
        super(thea_jacuzzi);
        super.setType("Luxury");
        super.diathesimothta = true;
    }
    
    @Override
    public double Ypologismos_Timis() {
        double telikh_polytelous = 0;
        if (thea_jacuzzi == true){
            telikh_polytelous = vasiko_kostos * (1.76 * 1.5 + 0.1);
        }
        else{
            telikh_polytelous = vasiko_kostos * 1.76 * 1.5;
        }
        return telikh_polytelous;
    }
    
    @Override
    public String toString() {
        return "Luxury_Room{" + super.toString() + '}';
    }
}