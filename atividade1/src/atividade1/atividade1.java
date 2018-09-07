package atividade1;
import java.util.Scanner;

public class ValoresArray {

    private int[] dados;
    private int max = 0;
    private int min = Integer.MAX_VALUE;
    private int pos = 0;
    private double total = 0;

    public ValoresArray(int[] A) {
        this.dados = A;
    }

    public boolean cadastraValor(int v) {
        if (pos == dados.length) {
            return false;
        } else {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
            dados[pos] = v;
            total += v;
            pos++;
            return true;
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        if (pos == 0) return 0;
        return min;
    }

    public double media() {
        if (pos == 0) return 0;
        return total / pos;
    }

}
