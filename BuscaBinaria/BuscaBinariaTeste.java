import static org.junit.Assert.assertEquals;
import org.junit.Test;
// Niellyton  Marques

public class BuscaBinariaTeste {

    @Test
    public void inicioDoArray(){
        int[] inicio = {0, 1, 3, 4, 10, 20, 44};
        int chave = 0;
        BuscaBinaria buscar = new BuscaBinaria();
        assertEquals(0, buscar.busca(inicio, chave));
    }

    @Test
    public void meioArray(){
        int[] meio = {0, 25, 27, 33, 40};
        int chave = 27;
        BuscaBinaria buscar = new BuscaBinaria();
        assertEquals(2, buscar.busca(meio, chave));
    }

    @Test
    public void fimArray(){
        int[] fim = {200, 1500, 2000, 2021};
        int chave = 2021;
        BuscaBinaria buscar = new BuscaBinaria();
        assertEquals(3, buscar.busca(fim, chave));
    }

    @Test
    public void arrayVazio(){
        int[] teste = {};
        int chave = 33333333;
        BuscaBinaria buscar = new BuscaBinaria();
        assertEquals(-1, buscar.busca(teste, chave));
    }

    @Test
    public void chaveForaDoArray(){
        int[] array = {2, 3, 33, 555, 3033};
        int chave = 0;
        BuscaBinaria buscar = new BuscaBinaria();
        assertEquals(-1, buscar.busca(array, chave));
    }
}