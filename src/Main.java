public class Main {
    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = 0;
        var estacion = "primavera";

        if (numeroIf > 0){
            System.out.println("El numero: "+numeroIf+" es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero: "+numeroIf+" es negativo");
        } else {
            System.out.println("El 0 no es + ni -...");
        }

        while (numeroWhile < 3){
            System.out.println("numeroWhile: "+numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do{
            System.out.println("numeroWhile con doWhile: "+numeroWhile);
            numeroWhile = numeroWhile + 3;
        }while (numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor: "+numeroFor);
        }

        switch(estacion){
            case "primavera":
                System.out.println("Es Primavera");
                break;
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
