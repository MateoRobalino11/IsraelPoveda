package poveda.uta.israelpoveda;

public class Metodos {
    public int factorial(int num){
        int i=1;
        int f=1;
        while(num>=i){
            f*=i;
            i++;
        }
        return f;
    }
    public int potencia(int num, int exp){
        int i=1;
        int p=1;
        while(exp>=i){
            p*=num;
            i++;
        }
        return p;
    }
}
