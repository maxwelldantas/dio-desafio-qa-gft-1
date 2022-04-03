package dio.desafio.qa.gft1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {

    /**
     * Desafio
     * <p>
     * Crie um programa onde você receberá valores inteiros não negativos como entrada.
     * <p>
     * Ordene estes valores de acordo com o seguinte critério:
     * <p>
     * - Primeiro os Pares <br>
     * - Depois os Ímpares <p>
     * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
     *
     * <p>
     * Entrada
     * <p>
     * A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
     * Este é o número de linhas de entrada que vem logo a seguir.
     * As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.
     * <p>
     * <p>
     * 10
     * 4
     * 32
     * 34
     * 543
     * 3456
     * 654
     * 567
     * 87
     * 6789
     * 98
     *
     * <p>
     * Saída
     * <p>
     * Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
     * Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
     * <p>
     * 4
     * 32
     * 34
     * 98
     * 654
     * 3456
     * 6789
     * 567
     * 543
     * 87
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeNumeros = entrada.nextInt();

        if (quantidadeNumeros > 0 && quantidadeNumeros < 10000) {
            int contador = 0;

            List<Integer> listaNumerosInteirosPares = new ArrayList<>();
            List<Integer> listaNumerosInteirosImpares = new ArrayList<>();
            List<Integer> listaNumerosInteirosOrdenada = new ArrayList<>();

            while (contador < quantidadeNumeros) {
                int numero = entrada.nextInt();

                if (numero % 2 == 0) {
                    listaNumerosInteirosPares.add(numero);
                } else {
                    listaNumerosInteirosImpares.add(numero);
                }
                contador++;
            }

            listaNumerosInteirosPares.sort(Comparator.comparing(n -> n));
            listaNumerosInteirosImpares.sort(Comparator.comparingInt(Integer.class::cast).reversed());

            listaNumerosInteirosOrdenada.addAll(listaNumerosInteirosPares);
            listaNumerosInteirosOrdenada.addAll(listaNumerosInteirosImpares);

            listaNumerosInteirosOrdenada.forEach(System.out::println);
        }

    }
}
