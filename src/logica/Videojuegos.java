
package logica;

import java.util.ArrayList;
import java.util.List;


public class Videojuegos {

    public static void main(String[] args){
        
        //Creo mi lista vacia
        List<Videojuego> lista = new ArrayList<Videojuego>();
        
        //Creo mis objetos juegos, y le asigno sus valores..
        Videojuego juego1 = new Videojuego(1,"GTA V","PC, PS3, PS4, PS5",13000,"Accion");
        Videojuego juego2 = new Videojuego(2,"CSGO","PC only",24000,"Disparos");
        Videojuego juego3 = new Videojuego(3,"World OF Tanks","PC, XBOX",2200,"Estrategia");
        Videojuego juego4 = new Videojuego(4,"League of Legends","PC only",18000,"MOBA");
        Videojuego juego5 = new Videojuego(5,"Mario","Nintendo 64",2700,"Aventura");
        
        //Luego de asignar los datos de cada uno de mis juegos, Cargo los juegos en mi lista
        lista.add(juego1);
        lista.add(juego2);
        lista.add(juego3);
        lista.add(juego4);
        lista.add(juego5);
        
        //Recorrido de mi lista
        System.out.println("========Recorrido de la lista cargada=========");
        for (Videojuego videojuego:lista){
            System.out.println("Titulo del juego: "+ videojuego.getTitulo()+" - Plataforma: "+videojuego.getConsola()+" - Cantidad de jugadores:"
                    + " "+ videojuego.getCantidadJugadores());
            
        }
        System.out.print("\n");
        
        
        //Cambio de nombre y cant jugadores a 2 juegos como me pide la consigna
        juego1.setTitulo("CAMUSHACKER");
        juego1.setCantidadJugadores(18);
        
        juego4.setTitulo("StarTrek");
        juego4.setCantidadJugadores(0);
        
        
        //Mostrar lista modificada
        System.out.println("========Recorrido de la lista MODIFICADA=========");
        for (Videojuego videojuego:lista){
            System.out.println("Titulo del juego: "+ videojuego.getTitulo()+" - Plataforma: "+videojuego.getConsola()+" - Cantidad de jugadores:"
                    + " "+ videojuego.getCantidadJugadores());
            
        }
        System.out.print("\n");
        System.out.print("\n");
        
        //Mostrar por pantalla los juegos que son compatibles con Nintendo 64
        System.out.println("========Juego COMPATIBLE con Nintendo 64=========");
        for (Videojuego videojuego:lista){
            if(videojuego.getConsola() == "Nintendo 64"){
            System.out.println("Titulo del juego: "+ videojuego.getTitulo()+" - Plataforma: "+videojuego.getConsola()+" - Cantidad de jugadores:"
                    + " "+ videojuego.getCantidadJugadores());
            }
            
        }
        
        
    }
    
}
