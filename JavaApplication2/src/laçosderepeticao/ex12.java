package laçosderepeticao;
public class ex12 {
    public static void main(String[] args) {
        float A=80000;
        double B=200000;
        float Pa=0;
        double Pb=0;
        Pa=(A*3)/100;
        Pb=(B*1.5)/100;
        while(A>=B){
            A=A+Pa;
            System.out.println("População pais A:"+A);
            B=B+Pb;
            System.out.println("População pais B:"+B);
        }
    }
}
