
package Procesos.Seguridad;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author iCarlos & JSolorzano
 */
public class Validar {

    public boolean entero( KeyEvent key ) {
        
        if ( !Character.isDigit( key.getKeyChar() ) && !Character.isISOControl ( key.getKeyChar()) ) {
            
            Toolkit.getDefaultToolkit().beep();//Envia un sonido beep
            key.consume();//Elimina el caracter
            
            return false;
        
        } else return true;
        
    }
    
    public boolean decimal( KeyEvent key,  JTextField txt ){
        
        if( !Character.isDigit( key.getKeyChar() ) && !Character.isISOControl( key.getKeyChar() ) && txt.getText().contains( "." ) ){
            
            key.consume();
            return false;
            
        } else if( !Character.isDigit( key.getKeyChar() ) && !Character.isISOControl( key.getKeyChar() )  && ( key.getKeyChar() != '.' ) ){
        
            key.consume();
            return false;
        
        } else return true;
        
    }
    
    public boolean letras( KeyEvent key ){
        
        if( !Character.isLetter( key.getKeyChar() ) && !Character.isAlphabetic( key.getKeyChar() ) ){
            
            Toolkit.getDefaultToolkit().beep();
            key.consume();
            return false;
        
        } else return true;
        
    }
    
    public boolean letraEspacio( KeyEvent key ){
        
        if( !Character.isLetter (key.getKeyChar() ) && !Character.isAlphabetic( key.getKeyChar() ) && !Character.isSpace( key.getKeyChar() ) ){
            
            Toolkit.getDefaultToolkit().beep();
            key.consume();
            return false;
            
        } else return true;
        
    }
    
    public boolean limite( JTextField txt, int limite, KeyEvent key ){
        
        if( StringUtils.stripAll( txt.getText() ).length > limite ){
            
            key.consume();
            return false;
            
        } else return true;
            
    }
    
    public boolean vacio( String txt ) {
        
        return txt.trim().isEmpty();
    
    }
    
    public boolean email ( String txt ){
        
        return EmailValidator.getInstance().isValid( txt );
    
    }
    
    public boolean DUI(String cadena) {
        //StringBuilder inversor =new StringBuilder(cadena);
        //String orden = inversor.reverse().toString(); //Damos Vuelta a la cadena
        int suma = 0;
        int p = 0;//Inicializamos variables de control
        boolean resultado;//Inicializamos variable de control
        
        for ( int posicion = 10; posicion > 1; posicion-- ) {//Ciclo para ir multiplicando por la posicion del digito (se cuenta de atras hacia adelante)
            
            if ( posicion > 2 ) {
                
                suma += ( ( Character.getNumericValue( cadena.charAt( p ) ) )  *  ( posicion - 1 ) );//Sumamos la multiplicacion del digito por su pocision
            
            }
            p++;//Variable de control para avanzar en la cadena del DUI
        
        }//Si ya multiplicamos todo comparamos si 10 menos el modular de la suma entre 10 es igual al ultimo digito del dui son iguales
        
        resultado = ( 10 - (int) Math.floor( suma % 10 ) ) == ( Character.getNumericValue( cadena.charAt( 9 ) ) ); //Son iguales es valido el DUI
        //Son diferentes es invalido el dui
        return resultado;
    }
    
    //Metodo para validar nit de el salvador
    public static boolean NITESA( String cadena ){//Creamos metodo estatico para poderlo llamar en cualquier parte; pedimos como datos una cadena string donde se aloja el nit
        
        int calculo = 0;//Variable para llevar el control de la suma del algoritmo
        int digitos = Integer.parseInt(cadena.substring(12, 15));//Tomamos los digitos que estan entre la posicion 12 y 15
        boolean resultado;
        
        if ( digitos <= 100 ) {//Verificamos que estos digitos sean menores o iguales a 100
            
            for ( int posicion = 0; posicion <= 14; posicion++ ) {//Ciclo que nos ayuda a ir aumentando la posicion que se utiliza posteriormente en el algoritmo
                
                if ( !( posicion == 4 || posicion == 11 ) ){
                    
                    calculo += ( 14 * (int) ( Character.getNumericValue( cadena.charAt( posicion ) ) ) );
                
                }//Si la posicion no es 4 ni 11 (que son los guiones) se ejecuta esta operacion
                
                calculo = calculo % 11;//Al calculo se le va sacando el modular de 11
            
            }
            
        } else {
            
            int n = 1;//Variable contadora
            
            for ( int posicion = 0; posicion <= 14; posicion++ ){//Ciclo que nos ayuda a ir aumentando la posicion que se utiliza posteriormente en el algoritmo
                
                if ( !( posicion == 4 || posicion == 11 ) ){
                    
                    calculo = (int) ( calculo + ( ( (int) Character.getNumericValue( cadena.charAt( posicion ) ) ) * ( ( 3 + 6 * Math.floor( Math.abs( ( n + 4) / 6 ) ) ) - n ) ) );
                    n++;
                
                }//Si la posicion no es 4 ni 11 (que son los guiones) se ejecuta esta operacion
            
            }
            
            calculo = calculo % 11;//sacamos el modular 11 de calculo
            
            if ( calculo > 1 ){
            
                calculo = 11 - calculo;//Si el resultado nos da mayor a uno se le resta a 11 esta respuesta
            
            } else {
                
                calculo = 0;//Sino el calculo lo hacemos 0
            
            }
        }
        
        resultado = (calculo == (int) ( Character.getNumericValue( cadena.charAt( 16 ) ) ) ); //Verificamos si el calculo es direfente del resultado de nuestro algoritmo, si lo es entonces es falso

        return resultado;//enviamos el resultado
    }
    
//    public static boolean NITGUA(String cadena){
//        suma=0;p=0;//Inicializamos Variable de control
//        resultado = false;//Inicializamos Variable para resultado
//        for(int posicion =9;posicion>2;posicion--){//Ciclo para ir multiplicando por la posicion del digito (se cuenta de atras hacia adelante)
//            if(posicion>2)suma= suma + ((Character.getNumericValue(cadena.charAt(p)))*(posicion-1));//Sumamos la multiplicacion del digito por su pocision
//            p++;//Variable de control para avanzar en la cadena del NIT
//        }//Si ya multiplicamos todo comparamos si el algoritmo nos resulta verdadero
//        if((11-(6-((int)Math.floor(((int)Math.floor(149-(11*(int)Math.floor(suma/11))))/11))*11))==(Character.getNumericValue(cadena.charAt(8))))resultado=true;//Son iguales es valido el NIT
//        else resultado=false;//Son diferentes es invalido el dui
//        return resultado;//Envia Resultado
//    }

}
