
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import said.itszn.edu.mx.calculadorabasica.Calculos;

public class TestCalculos {
    
    public TestCalculos() {
    }
    
    Calculos instancia=new Calculos();
    
    @Test
    public void pruebaSuma1(){
            int x=4;
            int y=2;
            int esperado=6;
            int obtenido=instancia.suma(x, y);
            assertEquals(esperado, obtenido);
    }
    
     @Test
    public void pruebaSuma2(){
            int x=6;
            int y=8;
            int esperado=140;  //Aqui hay un error
            int obtenido=instancia.suma(x, y);
            assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaResta1(){
            int x=4;
            int y=2;
            int esperado=2;
            int obtenido=instancia.resta(x, y);
            assertEquals(esperado, obtenido);
    }
    
     @Test
    public void pruebaResta2(){
            int x=6;
            int y=8;
            int esperado=1;  //Aqui hay un error
            int obtenido=instancia.suma(x, y);
            assertEquals(esperado, obtenido);
    }
}
