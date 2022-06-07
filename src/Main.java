    public class Main {
      public static void main(String[] args) {
        // if, else if y else
        int numeroIf = 0;

        if (numeroIf<0){
          System.out.println("e numeroIf " + numeroIf + " es negativo");
        }
        else if(numeroIf>0){
          System.out.println(" numeroIf " + numeroIf + " es positivo");
        } else {
          System.out.println("numeroIf es 0");
        }

        //while
        int numeroWhile = 1;

        while(numeroWhile < 3){
          numeroWhile++;
          System.out.println( + numeroWhile);
        }

        int numeroDoWhile = 0;
        do{
          numeroDoWhile++;
          System.out.println("nro = " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        //for
        for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
          System.out.println("nro = " + numeroFor);
        }

        //switch
        String estacion = "otoño";
        switch(estacion) {
          case "verano":
            System.out.println("Estamos en verano");
            break;
          case "invierno":
            System.out.println("Estamos en invierno");
            break;
          case "primavera":
            System.out.println("Estamos en primavera");
            break;
          case "otoño":
            System.out.println("Estamos en otoño");
            break;
          default:
            System.out.println("No es una estación");
        }
      }
    }