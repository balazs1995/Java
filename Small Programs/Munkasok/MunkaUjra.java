import java.util.*;
import java.io.*;

public class MunkaUjra{

public static void main(String[] args){

String[] nevek = readArray("munkasok.txt"); //létrehozunk egy nevek nevű tömbböt és beadjuk neki a fájl elérési útját ha ugyanabban a mappában elég a fájl neve

int kor[] = new int[10]; // létrehpzzuk a koroknaka tömböt itt pl 10 elemű a tömb ha a beolvasott fájlba több név szerepel akkor változttani kell az értékét
int ber[] = new int[10]; // ugyanez vonatkozik a fizetésre is

int i;

int kereset = 0 , kereset2 = 0 , kor1 = 0 , kor2 = 0 , osszeg1 = 0 , osszeg2 = 0;
double koratlag = 0.0 ;
double fizetesatlag = 0.0;

String nev = " ";
String nev2 =" ";
String nev3 = " ";
String nev4 = " ";

int fiatal = Integer.MAX_VALUE;
int idos = Integer.MIN_VALUE;
int legkevesebbpenz = Integer.MAX_VALUE;
int legtobbpenz = Integer.MIN_VALUE;

for(i=0 ; i < nevek.length ; i++)
{
kor[i] = (int) ((Math.random()*43)+18);
ber[i] = (int) ((Math.random()*401)+100);
}

System.out.println("Nevek\t"+"Életkor\t"+"Fizetés");
System.out.println();

for (i = 0; i < nevek.length;i++)
{
System.out.println(nevek[i]+ "\t" + kor[i] +"\t" + ber[i] );
}
System.out.println();
for(i = 0 ; i < kor.length ; i++)
{
osszeg1+=kor[i]; // kor átlag
fiatal = Math.min(kor[i], fiatal); // megnézi ki a legfiatalabb és eltárolja a fiatal változóba
if (kor[i]==fiatal) // ha a fiatal változóban lévő adata megegyezik a korban tárolt valmeiyk adattal
{ // akkor a nevek tömből belerakja a nev változóba és a ber tömbből a kereset változóba
nev = nevek[i];
kereset = ber[i];
}

idos = Math.max(kor[i], idos);
if (kor[i]==idos)
{
nev2 = nevek[i];
kereset2 = ber[i];
}
}

System.out.println("\t\t\t\t"+ "Neve\t\t" + "Életkora\t" + "Fizetése ");
System.out.println();
System.out.println("A legfiatalabb dolgozó:\t\t"+ nev + "\t\t"+ fiatal + "\t\t"+kereset);
System.out.println("A legidősebb:\t\t" + "\t" + nev2 + "\t\t" + idos + "\t\t" + kereset2);

for(i = 0 ; i < ber.length ; i++)
{
osszeg2+=ber[i]; // ber átlag
legkevesebbpenz = Math.min(ber[i], legkevesebbpenz);
if(ber[i]==legkevesebbpenz)
{
nev3 = nevek[i];
kor1 = kor[i];
}
legtobbpenz = Math.max(ber[i], legtobbpenz);
if(ber[i]==legtobbpenz)
{
nev4 = nevek[i];
kor2 = kor[i];
}
}

koratlag = (double)osszeg1 / kor.length;
fizetesatlag = (double)osszeg2 / ber.length;
System.out.println("A legkevesebb pénzt keresi: " + nev3 +"\t\t" + kor1+"\t\t" + legkevesebbpenz);
System.out.println("A legtöbb pénzt keresi: " + nev4 + "\t\t" + kor2 +"\t\t" + legtobbpenz);
System.out.println();
System.out.println("A dolgozók korának átlaga: " + koratlag);
System.out.println("A fizetések átlaga: " + fizetesatlag);

}

// itt van a lényeg a többi ugyanaz mint az első ilyen munkásokat felsoroló programban

public static String[] readArray(String file){
int ctr = 0; // egy szamlalo változó ami majd később lesz érdekes mikor létrehozza nevek nevű tömbünket így akkora lesz a nevek tömb amenyi adat a beolvasott fájlból van
int i ;
try{

Scanner s1 = new Scanner(new File(file)); //létrehozunk egy scannert ami a filból fog beolvasni ami a mainben deklaráltunk a while ciklus addig tart míg van következő sor
while(s1.hasNextLine()){
ctr++;
s1.next(); // itt derül ki mennnyi sor van a fájlban
}

String[] nevek = new String[ctr]; // itt lesz a nevek tömben akkora amenyi adat a fájlban van

Scanner s2 = new Scanner(new File(file)); // itt létrehozuk az s2 nevú scannert és ismét a fájl a lesz amit bekér majd a for ciklusal belerakjuk a nevek-be a benne lévú adatokat
for (i = 0; i < ctr;i++){
nevek[i] = s2.next();
}
return nevek; // viszatérési értélnek a nevek

}
catch(FileNotFoundException e) // hiba kiírása ha fájl nem található
{
System.out.println("file not found");
}

return null; // egyébként nem ad visza semmit

}
}
