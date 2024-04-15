
public class ex14 {
    public static void main(String[] args) {
        int P=0;
        int U=1;
        int Nf=0;
        int I=0;
    
        Nf=P+U;
        System.out.println(Nf);

        while(I<500){
            I=Nf;
            System.out.println(Nf);
            P=U;
            U=Nf;
            Nf=P+U;
            
        }
    }
}
