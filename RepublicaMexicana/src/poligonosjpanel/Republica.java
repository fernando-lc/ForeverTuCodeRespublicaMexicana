/*
 * Fernando Lucena Calixto
 */
//package poligonosjpanel;
import javax.swing.JFrame;

public class Republica
{
// ejecuta la aplicación
public static void main( String args[] )
{
// crea marco para objeto Mapa
JFrame marco = new JFrame( "Republica Mexicana" );
marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );OB
Mapa poligonosJPanel = new Mapa();
marco.add( poligonosJPanel ); // agrega poligonosJPanel al marco
marco.setSize( 1250, 800 ); // establece el tamaño del marco
marco.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase Republica
