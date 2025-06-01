public class Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    
    public Figure() {
    }

    public Figure(double sideA, double sideB, double sideC) {

        if((sideA + sideB > sideC) || (sideA + sideC > sideB) || (sideC + sideB > sideA)){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        }else{
            System.out.println("Incorrect parameters given");
        }
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double areaOfTriangle(){
        
        double a = this.sideA;
        double b = this.sideB;
        double c = this.sideC;

        double s = (a + c + b) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        return area;
    }

    @Override
    public String toString() {
        return "Figure [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
