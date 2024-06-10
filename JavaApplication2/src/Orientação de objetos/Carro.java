package Orientacao_Objetos;


public class Carro {
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;
    boolean sensor;
    
    public int getano(){
        return ano;
    }
    public String getnome(){
        return nome;
    }
    public String getmarca(){
        return marca;
    }
    public int getvel(){
        return vel;
    }
    public boolean getsensor(){
        return sensor;
    }
    public void setano(){
        this.ano= 2000;
    }
    public void setnome(){
        this.nome = Tiida;
    }
    public void  setmarca(){
        this.marca = Nissan;
    }
    public void setvel(){
        this.vel = 100;
    }                   
    
    //métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }
    
    void freiar(int reduzir) {
        vel -= reduzir;
    }
    
    void buzinar() {
        System.out.println("BiBi Bibi");
    } 

    void ACC() {
        // Enquanto o sensor estiver ligado, freia o carro
        while (this.sensor == true) {
            freiar(5); // Supondo que o carro reduza 5 km/h quando o sensor está ligado
            System.out.print("a velocidade do carro é "+vel);      
        }
        
        // Enquanto o sensor estiver desligado, acelera o carro
        while (this.sensor == false) {
            acelerar(5); // Supondo que o carro aumente 5 km/h quando o sensor está desligado
            System.out.print("a velocidade do carro é "+vel);      
        }

    }
}  
