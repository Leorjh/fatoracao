package src;

public class Fatoracao {
    public static int fatoracao(int num, int fat) {
        //Método 1
        // int result = 1;
        // if(fat==0){
        //     return result;
        // }
        // for(int i=0;i<fat;i++){
        //     result = result*num;
        // }
        // return result;

        //Método 2 recursivo
        if (fat == 0) {
            return 1;
        } 
        return num * fatoracao(num, fat - 1); 
    }
}