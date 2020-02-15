
public class FourWheel extends Vehicle {
    //to monadiko antikeimeno ths 4wheel me epiloges 1,2
    private int typos_4troxou;

    public FourWheel(int typos_4troxou) {
        this.typos_4troxou = typos_4troxou;
        super.diathesimothta = true;
    }

    public int getTypos_4troxou() {return typos_4troxou;}

    public void setTypos_4troxou(int typos_4troxou) {this.typos_4troxou = typos_4troxou;}
    
    
    @Override
    public double Ypologismos_Timis() {
        double telikh_4troxou = 0;
        if (typos_4troxou == 1) {
            telikh_4troxou = 50.0;
        } else if (typos_4troxou == 2) {
            telikh_4troxou = 30.0;
        }
        return telikh_4troxou;
    }
}
