package ba.unsa.etf.rpr;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.function.Executable;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    private static Imenik imenik=new Imenik();

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Azra",new FiksniBroj(Grad.SARAJEVO,"265-987"));
    }

    @Test
    public void dajBrojFound(){
        String broj=imenik.dajBroj("Azra");
        assertEquals(broj,"033/265-987");
    }

    @Test
    public void dajBrojNotFound(){
        String broj=imenik.dajBroj("Samra");
        assertNull(broj);
    }

    @Test
    public void dodajFiksniException(){
        assertThrows(BrojException.class,new Executable(){
            @Override
            public void execute() throws Throwable {
                new FiksniBroj(null,"456-456");
            }
        });
    }
}
