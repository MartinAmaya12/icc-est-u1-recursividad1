public class Ejercicios{

    public Ejercicios() {

    }

    public int sumaConsecutivos(int num){  // 5
       //CASO BASE
       if(num == 1)
        return num;
       
       //PARTE RECURSIVA
       return num + sumaConsecutivos(num - 1);
       
    }

    public int sumaConsecutivosPasos(int num){  // 5
       //CASO BASE
       if(num == 1)
        return num;
       
       //PARTE RECURSIVA
       int resultadoRecursivo = sumaConsecutivosPasos(num - 1);
       int resultadoOperacion = num + resultadoRecursivo;
       System.out.println("ResultadoOp: " + num + " + " +"SumaRecurivosPasos("  + resultadoRecursivo + ")");
       return resultadoOperacion;
    }


    public int getPotencia(int base, int exponente){
        //Caso Base
        if(exponente == 1)
            return base;  ///base ^1  = base y otro caso base 0 ^ 1  = base

        return  base * getPotencia(base, exponente - 1);
    }

    public int sumaDigitos(int num){
        if(num < 10){
            return num;
        }

        return (num % 10) + sumaDigitos(num /10);
    }
}