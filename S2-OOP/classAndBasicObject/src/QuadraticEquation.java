public class QuadraticEquation {
    double a,b,c;
    double delta,r1,r2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return delta = this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1(){
        return r1= (-this.b+ Math.pow(this.delta,0.5))/(2*this.a);
    }

    public double getRoot2(){
        return r2= (-this.b-Math.pow(this.delta,0.5))/(2*this.a);
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation=new QuadraticEquation(1,2,3);
        double delta= quadraticEquation.getDiscriminant();

        if(delta>0){
            System.out.println("Root1= "+quadraticEquation.getRoot1()+"\nRoot2= "+quadraticEquation.getRoot2());
        } else if(delta==0){
            System.out.println("Root= "+ quadraticEquation.getRoot1());
        } else {
            System.out.println("Empty Root");
        }
    }
}
