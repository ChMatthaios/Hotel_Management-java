
public class Venue_Room extends Room {
    private double kostos_aithousas_ekdhlwsewn;

    public Venue_Room() {
        this.kostos_aithousas_ekdhlwsewn = 500;
        super.setType("Venue");
        super.diathesimothta = true;
    }
    
    @Override
    public double Ypologismos_Timis() {return kostos_aithousas_ekdhlwsewn;}

    public double getKostos_aithousas_ekdhlwsewn() {return kostos_aithousas_ekdhlwsewn;}

    public void setKostos_aithousas_ekdhlwsewn(double kostos_aithousas_ekdhlwsewn) {this.kostos_aithousas_ekdhlwsewn = kostos_aithousas_ekdhlwsewn;}
    
}
