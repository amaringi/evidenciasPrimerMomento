package EvideciProducto;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;


public class ClassProducto {
    static String registroUsuario[] = new String[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        while (opc!=3){
            System.out.println("  ");
            System.out.println("SELECCIONE:\n"+
                    "1. Registrarse\n"+
                    "2. Iniciar sesion\n"+
                    "3. Salir\n");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    rejistrarse();
                    break;
                case 2:
                    iniciarSesion();

                    break;
                case 3:
                    System.out.println("saliste del sistema");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
        }
    }
    public static void rejistrarse(){
        Scanner sc = new Scanner(System.in);
        String datos[] = {"Nombre","Correo","Contraseña"};
        System.out.println("REGISTRO DE UNSUARIOS");
        System.out.println("_____________________________");

        for (int i = 0; i <registroUsuario.length; i++) {
            System.out.println("ingrese el " +datos[i]);
            registroUsuario[i] = sc.nextLine();
        }
    }
    public static void iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INICIO DE SESION");
        System.out.println("Ingrese El Correo Registrado");
        String correo = sc.nextLine();
        System.out.println("Ingrse La Contraseña Registrada");
        String contraseña = sc.nextLine();

        if (correo.equals(registroUsuario[1])&&contraseña.equals(registroUsuario[2])){
            System.out.println("INICIO DE SESION EXITOSO");
            System.out.println("BIENVENIDO "+registroUsuario[0]);
            int seleccion = 1;
            while (seleccion != 0) {
                System.out.println("VAMOS A JUGAR PIEDRA PAPEL O TIJERA.");
                System.out.println("SELECCIONE:\n" +
                        "1. Piedra\n" +
                        "2. Papal\n" +
                        "3. Tijera\n");

                //seleccion jugador
                String vectorJugador[] = {"Piedra", "Papel", "Tijera"};
                int i = sc.nextInt();
                int i2 = i-1;
                System.out.println("Seleccionaste " + vectorJugador[i2]);

                //seleccion pc
                String vectorPc[] = {"Piedra", "Papel", "Tijera"};
                int opPc = (int) (Math.random() *3);
                int opPc2 = opPc+1;
                System.out.println("El Ordenador Selecciono "+ vectorPc[opPc]);

                if (i == opPc2) {
                    System.out.println("EMPATE");
                } else if ((i == 1 && opPc2 == 3) || (i == 2 && opPc2 == 1) || (i == 3 && opPc2 == 2)) {
                    System.out.println("GANASTE");
                } else {
                    System.out.println("PERDISTE");
                }
                System.out.println("PULSA '0' PARA SALIR O CUALQUIER NUMERO PARA SEGUIR JUGANDO ");
                seleccion = sc.nextInt();
            }
        }else{
            System.out.println("ERROR\nPORFAVOR VERIFIQUE SUS DATOS\nUSUARIO NO REJISTRADO");
        }
    }
}
