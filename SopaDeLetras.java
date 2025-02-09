import java.util.ArrayList;
import java.util.Scanner;

public class SopaDeLetras{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion1, opcion2, opcion3;
        String palabraString, palabraNueva2, palabraNueva3, palabraNueva, usuario;
        ArrayList<String> listaPalabras = new ArrayList<>();
        ArrayList<String> listarJugadores = new ArrayList<>();
        do{
            System.out.println("Bienvenido, Juega y crea tu propia sopa de letras");
            System.out.println("1) Nueva partida");
            System.out.println("2) Historial de partidas");
            System.out.println("3) Mostrar puntuaciones mas altas");
            System.out.println("4) Informacion del estudiante");
            System.out.println("5) Salir");
            opcion1 = sc.nextInt();
            sc.nextLine();
             
            switch(opcion1){
                case 1:
                    do {
                        System.out.println("Ingrese su nombre su usuario");
                        usuario = sc.nextLine();
                        listarJugadores.add(usuario);
                        System.out.println("Ingrese a donde quiere ir");
                        System.out.println("1) Menú palabras");
                        System.out.println("2) Jugar");
                        System.out.println("3) Terminar partida");
                        opcion2 = sc.nextInt();
                        sc.nextLine();
                        switch (opcion2) {
                            case 1:
                            do{ 
                                System.out.println("Bienvenido al menú de palabras");
                                System.out.println("1) Insertar palabra");
                                System.out.println("2) Modificar palabra");
                                System.out.println("3) Eliminar palabra");
                                System.out.println("4) Listar palabras");
                                System.out.println("5) Volver a menú principal");
                                opcion3 = sc.nextInt();
                                sc.nextLine();
                                switch (opcion3) {
                                    case 1:
                                        System.out.println("Ingrese el numero de palabras deseadas.");
                                        int palabras = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Ingrese palabras de 5 a 10 caracteres");
                                        for(int i = 1; i <= palabras; i++ ){
                                            do {
                                                System.out.print("Palabra " + i + ": ");
                                                palabraString = sc.nextLine();
                                                int longitud = palabraString.length();
                                                if(longitud < 5 || longitud > 10){
                                                    System.out.println("Error, debe ingresar una palabra de 5 a 10 caracteres");
                                                
                                                }
                                            } while (palabraString.length() < 5 || palabraString.length() > 10);
                                            listaPalabras.add(palabraString);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }
                                        
                                        System.out.println("Ingrese que palabra desea modificar");
                                        palabraNueva = sc.nextLine();
                                            if(listaPalabras.contains(palabraNueva)){
                                                do {
                                                    System.out.println("Ingrese la nueva palabra");
                                                    palabraNueva2 = sc.nextLine();
                                                    int longitud = palabraNueva2.length();
                                                    if(longitud < 5 || longitud > 10){
                                                        System.out.println("Error, debe ingresar una palabra de 5 a 10 caracteres");
                                                    }
                                                }while (palabraNueva2.length() < 5 || palabraNueva2.length() > 10);
                                                int index = listaPalabras.indexOf(palabraNueva);
                                                listaPalabras.set(index, palabraNueva2);
                                            } 
                                        break;
                                    case 3:
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }
                                        System.out.println("Ingrese la palabra que desea eliminar");
                                        palabraNueva3 = sc.nextLine();
                                        if(listaPalabras.contains(palabraNueva3)){
                                            listaPalabras.remove(palabraNueva3);
                                        }else{
                                            System.out.println("Esa palabra no existe, eliga otra");
                                        }
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }

                                        break;
                                    case 4:
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Regresando al menu principal");
                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                }
                            }while(opcion3 != 5);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("Volviendo al menu principal");
                            break;
                        default:
                            break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 2:
                    System.out.println("Historial de partidas");
                    break;
                case 3:
                    System.out.println("Las puntuaciones mas altas");
                    for (String usuarios : listarJugadores) {
                        System.out.println("- " + usuarios);
                    }
                    break;
                case 4:
                    System.out.println("-/-/-/- Informacion del estudiante /-/-/-/-/-/");
                    System.out.println("------ Bany Alejandro Quiñonez Zepeda --------");
                    System.out.println("------ 20222 ");
                    System.out.println("--------------- Seccion 'E' ------------------");
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion valida.");
                    
            }
        }while(opcion1 != 5);
    }
}