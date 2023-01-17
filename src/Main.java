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
        int[][] arrayDati = {
                {1, 5, 7},
                {8, 9, 10},

        };

        // III forma
        int[][] mioArray = new int[][]{
                //trim   I     II     III   IV
                new int[]{120, 125, 180, 140}, // 2022 incassi  totale riga
                {178, 180, 141, 147}, // 2021 incassi
                {149, 178, 134, 130},
                {149, 178, 134, 130}// 2020 incassi
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
        for (int i = 0; i < mioArray.length; i++) {
            for (int j = 0; j < mioArray[i].length; j++) {
                System.out.print(mioArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("*Itero con forEach***");

        for (int[] righe : mioArray) {
            // righe[0][riga]
            System.out.println();
            for (int colonne : righe) {
                System.out.print(colonne + "\t");

            }

            int[] datiArray = new int[]{1, 5, 7};
            for (int dato : datiArray) {
                System.out.println(dato);
            }

        }
        // usando l'array mioarray sommo  i valori delle singole righe
        System.out.println("\nCalcolo il valore incassi per anno");
        int anno = 2020; //
        int somma = 0;
        for (int riga = 0; riga < mioArray.length; riga++) {
            for (int colonna = 0; colonna < mioArray[riga].length; colonna++) {
                // calclo il totale per ogni singola riga
                somma = somma + mioArray[riga][colonna];
            }
            System.out.println("Anno " + anno + "] = " + somma);
            somma = 0; //rimetto a zero per usarla nei cicli successivi al primo
            anno++; // increm di +1
        }

        // somma per trimestri (sommo i valori delle colonne)
        System.out.println("\nSOMMATORIA COLONNE MATRICE: ");
        // ha creato un array che contiene la somma dei valori delle colonne
        // ha letto la dimensione delle colonne
        int sommaCol[] = new int[mioArray[0].length]; // es 5 colonne

        for (int r = 0; r < mioArray.length; r++) {  // lettura delle righe
            for (int c = 0; c < mioArray[r].length; c++) {
                System.out.println(mioArray[r][c] + "\t");
                // per ogni colonna
                sommaCol[c] = sommaCol[c] + mioArray[r][c];
                 /*
                   c0    c1    c2    c3
             r0 { 120,  125,  180,  140   }, --- va a capo con una println ed entra di nuovo nel primo for
             r1 { 178,  180,  141 , 147   },
             r2 { 149,  178,  134,  130   }
                 */

            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < sommaCol.length; i++) {
            System.out.print(sommaCol[i] + "\t");
        }
        System.out.println("\n***************************************");
        System.out.println("codice di Samuele");
        System.out.println("***************************************");

        // implemento per stampa della matrice;
        for (int[] righe1 : mioArray) {
            System.out.println();
            for (int colonne1 : righe1) {
                System.out.print(colonne1 + "\t");
            }
        }
        System.out.println("\nsomma colonne");
        int sommacolonne = 0 ;
        String totaliProgressivi="";
        for (int ciclo = 0; ciclo<1 ; ciclo++) { // inizio un solo ciclo
            for (int colonne = 0; colonne < mioArray[0].length; colonne++) {
                for (int righe = 0; righe < mioArray.length; righe++) {
                    System.out.print(mioArray[colonne][righe] + " ");
                    sommacolonne = sommacolonne + mioArray[righe][colonne];
                }
                /*
                creo un array con i dati delle somme
                 */
                // in una stringa -  // 596*661*589*547
                // uso split

               // System.out.print(sommacolonne + " ");
                String tmpSomma = sommacolonne+"#";
                totaliProgressivi=totaliProgressivi.concat(tmpSomma);
                sommacolonne = 0;
                System.out.println();
            }
        } // fine
         // operazione di split
        System.out.println("---------------");
        String [] splittati = totaliProgressivi.split("#");
        for ( String elementi : splittati ) {
            System.out.print(elementi+" ");
        }
    }
}

/*
        int sommacolonne = 0;
        for (int colonne = 0; colonne < mioArray[0].length; colonne++) {
            for (int righe = 0; righe < mioArray.length; righe++) {

                sommacolonne = sommacolonne + mioArray[righe][colonne];

                System.out.print(mioArray[righe][colonne] + " ");
            }
            System.out.println();
            System.out.print(+sommacolonne + " ");
            System.out.println();
            sommacolonne = 0;
        }
    }
}
*/
