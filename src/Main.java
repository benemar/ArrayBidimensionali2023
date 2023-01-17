import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        /*
           c0   c1  c2
        r0  1   5   7    println
        r1  8   9   10
                 */

        // I forma
        int[][] dati = new int[][]{
                new int[]{1, 5, 7},
                new int[]{8, 9, 10}
        };

        // II forma
        int [][] arrayDati = {
                {1,5,7},
                {8,9,10},

        };

       // III forma
       int [][] mioArray = new int [][] {
                    //trim   I     II     III   IV
               new int []  { 120,  125,  180,  140   }, // 2022 incassi  totale riga
                           { 178,  180,  141 , 147  }, // 2021 incassi
                           { 149,  178,  134,  130   }  // 2020 incassi
       };

       // per iterare un array bidimensionale usiamo (normalmente )
        // un doppio for: uno interno e uno esterno
        // esterno ---> itera righe
        // interno----> itera colonne
        /*
           c0   c1  c2
        r0  1   5   7
        r1  8   9
                 */
        for (int i = 0; i< mioArray.length; i++ ){
            for (int j =0; j< mioArray[i].length; j++ ){
                System.out.print(mioArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("*Itero con forEach***");

        for (  int [] righe: mioArray   )   {
            // righe[0][riga]
            System.out.println();
            for ( int colonne : righe) {
            System.out.print( colonne + "\t");

            }

            int[] datiArray = new int[]{ 1, 5, 7};
            for ( int dato   : datiArray  ) {
                System.out.println(dato);
            }

        }
       // usando l'array mioarray sommo  i valori delle singole righe
        System.out.println("\nCalcolo il valore incassi per anno");
        int anno = 2020; //
        int somma = 0;
        for (int riga = 0; riga< mioArray.length;riga++){
            for (int colonna = 0; colonna<mioArray[riga].length; colonna++){
                // calclo il totale per ogni singola riga
             somma =  somma +   mioArray[riga][colonna];
             }
            System.out.println("Anno " + anno +"] = " + somma );
            somma = 0; //rimetto a zero per usarla nei cicli successivi al primo
            anno++; // increm di +1
        }

       // somma per trimestri (sommo i valori delle colonne)
        System.out.println("Totale per trimestri");
         for (int righe = 0; righe< mioArray[0].length;righe++){ // ciclo sulle righe
             for (int colonne = 0 ; colonne<mioArray[righe].length;colonne++){ //



             }
         }

        };

    }
