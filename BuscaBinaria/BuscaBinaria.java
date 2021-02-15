//import javax.print.attribute.standard.MediaSize.NA;

public class BuscaBinaria {

  public int busca(int[] array, int chave) {
    int i = -1;
    int a = 0;
    int b = array.length;
    if (array.length == 0) {
      return i;
    } else {
      while (a <= b) {
        int meio = (a + b) / 2;
        if (array[meio] < chave) {
          a = meio + 1;
        } else if (array[meio] > chave) {
          b = meio - 1;
        } else if (array[meio] == chave) {
          i = meio;
          break;
        }
      }
      return i;
    }
  }
}