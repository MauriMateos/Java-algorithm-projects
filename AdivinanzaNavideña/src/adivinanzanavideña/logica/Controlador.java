package adivinanzanavideña.logica;

import java.util.Random;

public class Controlador {
public int determinarCantidadEmoji(String emoji,int cant,String matriz[][]){
    int cantidadEncontrada = 0;
    
    for (int f = 0; f < 4; f++) {
        for (int c = 0; c < 4; c++) {
            
            if(matriz[f][c].equals(emoji)){
                cantidadEncontrada++;
                
            }
        }
        
    }
    return cantidadEncontrada;
}

public String[][] generarMatriz(){
    Random random = new Random();
    String[] emojis = {"😂","😎","😍","🤩"}; // risa, lentes, corazon, estrella
    
    String[][] matriz = new String[4][4];
    
    for (int f = 0; f < 4; f++) {
        for (int c = 0; c < 4; c++) {
            matriz[f][c] = emojis[random.nextInt(emojis.length)];
            
            }
        }
        return matriz;
    }
    
}


