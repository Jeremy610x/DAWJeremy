/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo=100,bola_player, apuesta, ball, dinero_ganado;
        boolean winner;
        String seguir;
        
        do{
        bola_player = pedirNumero();
        apuesta = pedirDineroApuesta(saldo);
        saldo = saldo - apuesta;
        System.out.println("saldo " + saldo);
        ball = caidaBola();
        pintaAsteriscos(ball);
        
        winner = comprobarResultado(ball, bola_player);
        if(winner == true)
        {
            System.out.println("Has ganado");
            dinero_ganado = ganancias(apuesta, bola_player);
            saldo = saldo + dinero_ganado;
        }
        else
        {
            System.out.println("NO HAS ACERTADO!!!");
        }
        seguir = seguirJugando();
        }while(continuarJugando(seguir, saldo));
        

        System.out.println("Tu saldo es " + saldo);
    }
    
    
    
    
    
    /**
     * public static int caidaBola()
    Random entre 0 y 36, es la tirada de la “maquina”.
    Returns:
    bola que saca la maquina 
     */
    public static int caidaBola()
    {
        int maquina;
        Random rd = new Random();
        maquina = rd.nextInt(37);
        return maquina;
    }
    
    /**
     * Pedir el numero que apuesta al usuario, y devolvera el valor introducido 
     * El numero que puede poner el usuario es del 1 al 36, también puede poner el 37 y 38, 
     * que seran impar y par(esta información la debe saber el usuario para decidir que numero introducir)
     * Si es un valor no permitido seguira introduciendo
Returns:
    numero introducido por el usuario (valido) 
     * @return 
     */
    public static int pedirNumero()
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Escribe numero para apostar (1 al 36) (37 impar) (38 par)");
            numero=sc.nextInt();
        }while(numero<=0 || numero>=39);
        //}while(!(numero>=1 && numero <=38))
       return numero;
    }
    
    
    /**
     * public static void pintaAsteriscos​(int num)
Haz una función que reciba por parámetro un número entero y pinte por pantalla tantos asteriscos como el número.
Parameters:
    num - numero de asteriscos a pintar 
     */
    public static void pintaAsteriscos​(int num)
    {
        for (int i = 0; i < num; i++) {
            System.out.print("*");    
        }
        System.out.println("-" + num);
    }
    
    /**
     * public static int pedirDineroApuesta​(int dinero_tienes)
En la función se pedirà al usuario el dinero que se quiera apostar, solo sera valido si el numero es positivo y no supera el dinero_tienes
Parameters:
    dinero_tienes - dinero que tiene el jugador hasta ese momento
Returns:
    valor de la apuesta (cumpliendo condiciones
     */
    public static int pedirDineroApuesta​(int dinero_tienes)
    {
        Scanner sc = new Scanner(System.in);
        int dinero_apuesta;
        do{
            System.out.println("Cuanto dinero quieres apostar. Aun tienes " + dinero_tienes +"." );
            dinero_apuesta= sc.nextInt();
        }while(dinero_apuesta>dinero_tienes || dinero_apuesta<=0);
        return dinero_apuesta;
    }
    
    /**
     * public static int ganancias​(int dinero_apostado, int num_apostado)
Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado por 35, 2) si el numero es 37 o 38 es el doble del dinero_apostado.
Parameters:
    dinero_apostado - euros que ha apostado el jugador
    num_apostado - valor al que ha apostado
Returns:
    ganacias calculadas 
     */
    
    public static int ganancias​(int dinero_apostado, int num_apostado)
    {
        int dinero_ganado=0;
        if(num_apostado>=1 && num_apostado<=36)
        {
            dinero_ganado = dinero_apostado*35;
        }
        else if (num_apostado==37 || num_apostado==38)
        {
            dinero_ganado = dinero_apostado*2;
        }
        return dinero_ganado;
    }
    
    /**
     * public static boolean comprobarResultado​(int bola, int num_apostado)
Devolvera si ha ganado o ha perdido Se gana en tres casos 1) Si los dos numeros son iguales 2) Si la bola es impar y el num_apostado es 37 3) si la bola es par y el num_apostado es 38
Parameters:
    bola - 
    num_apostado - 
Returns:
    true si ha ganado, false en todos los otros casos 
     */
    public static boolean comprobarResultado​(int bola, int num_apostado)
    {
        if(bola==num_apostado)
        {
            return true;
        }
        else if (bola%2==0 && num_apostado==38) //ppar
        {
            return true;
        }
        else if (bola%2==1 && num_apostado==37)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /**
     * public static char seguirJugando()
Dentro se debera preguntar si quiere jugar, el usuario indicara con s/S o n/N si quiere o no Cualquier otro valor la función no serà considerado valido y la función debera preguntar
Returns:
    Contestación usuario si sigue jugando o no 
     */
    public static char seguirJugandoChar()
    {
        Scanner sc = new Scanner(System.in);
        char eleccio=' ';
        do{
            System.out.println("Quieres seguir jugando(s/S o n/N)? ...");
            eleccio = sc.next().charAt(0);
        }while(!(eleccio=='s' || eleccio=='S' || eleccio=='n' || eleccio=='N'));
        return eleccio;
    }
    
    
    public static String seguirJugando()
    {
        Scanner sc = new Scanner(System.in);
        String eleccio;
        do{
            System.out.println("Quieres seguir jugando(SI/NO)? ...");
            eleccio = sc.nextLine();
        }while(!(eleccio.equalsIgnoreCase("Si") || eleccio.equalsIgnoreCase("No")));
        return eleccio;
    }
    
    /**
     * public static boolean continuarJugando​(char respuesta, int dinero)
El programa decide si el jugador puede seguir jugando La función decidirá que continua jugando si 1) la variable respuesta es s/S y el dinero es positivo 2) En cualquier otro caso decidirá que no
Parameters:
    respuesta - valor recibido de respuesta
    dinero - saldo usuario
Returns:
    true si se dan las condiciones para seguir jugando , false en caso contrario 
     */
    public static boolean continuarJugando​(String respuesta, int dinero)
    {
        boolean correcto= false;
        if(respuesta.equalsIgnoreCase("SI") && dinero>0)
        {
            correcto = true;
        }
       
        return correcto;
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
