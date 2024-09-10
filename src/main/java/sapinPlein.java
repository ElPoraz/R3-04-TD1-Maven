
/**
 * TP4
 *
 * Marquet Pablo
 */

import java.util.Scanner;
public class sapinPlein
{
    public static void main(String[] args)
    {
        affichageSapin();
    }

    /**
     * Génère une ligne de nb caractères *
     * @param nb
     * @param car
     * @return un string de nb caractères *
     */
    public static String genererLigne(int nb, String car){
        String ligne="";
        int cptC=1;
        while (cptC<=nb){
            ligne+=car;
            cptC+=1;
        }
        return ligne;
    }

    /**
     * Génère un sapin de hauteur x
     * @param hauteur
     * @return un string représentant un sapin de hauteur x
     */
    public static String genererSapin(int hauteur){
        String sapin="";
        int nbEsp=hauteur-1;
        int nbEt=1;
        int cptL=1;
        while (cptL<=hauteur){
            sapin+=genererLigne(nbEsp," ")+genererLigne(nbEt,"*")+"\n";
            nbEsp+=-1;
            nbEt+=2;
            cptL+=1;
        }
        return sapin;
    }

    /**
     * Affiche un sapin de hauteur x
     */
    public static void affichageSapin(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la hauteur souhaitée");
        int hauteur= clavier.nextInt();
        while (hauteur<0 || hauteur>40){
            System.out.println("La hauteur doit être comprise entre 0 et 40");
            hauteur= clavier.nextInt();
        }
        String sapin=genererSapin(hauteur);
        System.out.println(sapin);
    }
}

