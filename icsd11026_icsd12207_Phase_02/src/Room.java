
public abstract class Room {
    protected String type = null;
    static int c = 101;
    protected int onoma_dwmatiou;
    protected int arithmos_klinwn;
    protected boolean thea_jacuzzi, diathesimothta;
    protected double vasiko_kostos;

    public Room() {}
    
    public Room(int arithmos_klinwn, boolean thea_jacuzzi) {
        this.arithmos_klinwn = arithmos_klinwn;
        this.thea_jacuzzi = thea_jacuzzi;
        onoma_dwmatiou = c++;
        diathesimothta=true;
        vasiko_kostos = 15.0;
    }
    
    public Room(boolean thea_jacuzzi) {
        this.thea_jacuzzi = thea_jacuzzi;
        onoma_dwmatiou = c++;
        diathesimothta=true;
        vasiko_kostos = 15.0;
    }
    
    public String getType(){return type;}
    public static int getC() {return c;}
    public int getOnoma_dwmatiou() {return onoma_dwmatiou;}
    public int getArithmos_klinwn() {return arithmos_klinwn;}
    public boolean isThea_jacuzzi() {return thea_jacuzzi;}
    public boolean isDiathesimothta() {return diathesimothta;}
    public double getVasiko_kostos() {return vasiko_kostos;}
    
    public void setType(String type){this.type = type;}
    public static void setC(int c) {Room.c = c;}
    public void setOnoma_dwmatiou(int onoma_dwmatiou) {this.onoma_dwmatiou = onoma_dwmatiou;}
    public void setArithmos_klinwn(int arithmos_klinwn) {this.arithmos_klinwn = arithmos_klinwn;}
    public void setThea_jacuzzi(boolean thea_jacuzzi) {this.thea_jacuzzi = thea_jacuzzi;}
    public void setDiathesimothta(boolean diathesimothta) {this.diathesimothta = diathesimothta;}
    public void setVasiko_kostos(double vasiko_kostos) {this.vasiko_kostos = vasiko_kostos;}
    
    public abstract double Ypologismos_Timis();

    @Override
    public String toString() {
        return "Room{" + "onoma_dwmatiou=" + onoma_dwmatiou + ", arithmos_klinwn=" + arithmos_klinwn + ", thea_jacuzzi=" + thea_jacuzzi + ", diathesimothta=" + diathesimothta + ", vasiko_kostos=" + vasiko_kostos + '}';
    }
    
}
