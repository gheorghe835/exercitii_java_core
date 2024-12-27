package taskuri;

public class Printer {
    public static void main(String[] args) {
        System.out.println("1.\tBucla for:\n\tScrie un program care afișează tabla înmulțirii pentru un număr dat de utilizator.\n" +
                "2.\tBucla while:\n\tScrie un program care citește numere de la utilizator până când este introdus numărul 0," +
                " apoi afișează suma tuturor numerelor introduse.\n" +
                "3.\tBucla do-while:\n\tScrie un program care cere utilizatorului să introducă un număr între 1 și 10. " +
                "Continuă să ceri un număr până când acesta se încadrează în interval.\n" +
                "4.\tCombinare bucle:\n\tScrie un program care generează toate combinațiile de două cifre distincte utilizând două bucle for.\n" +
                "5.\tMetodă pentru calculul sumei a două numere\n" +
                "Scrie o metodă numită calculeazaSuma care primește doi parametri de tip int și returnează suma lor. " +
                "Apelează metoda din metoda main și afișează rezultatul.\n " +
                "6.\tMetodă pentru verificarea unui număr par\n" +
                "Creează o metodă numită estePar care primește un număr întreg ca parametru și returnează true dacă numărul " +
                "este par și false dacă este impar. Apelează metoda din main pentru a verifica mai multe numere.\n" +
                "7.\tMetodă pentru calculul factorialului\n" +
                "Scrie o metodă numită factorial care primește un număr întreg pozitiv ca parametru și returnează factorialul acestuia." +
                " Apelează metoda din main și afișează rezultatul.\n" +
                "8.\tMetodă pentru salut personalizat\n" +
                "Creează o metodă numită salut care primește un nume (string) ca parametru și afișează un mesaj de salut " +
                "personalizat, cum ar fi: \"Salut, Ana!\". Apelează metoda din main cu diferite nume.\n" +
                "9.Exercițiul: Clasa \"Persoana\"\n" +
                "Creează o clasă Persoana cu următoarele atribute:\n" +
                "•\tnume (String)\n" +
                "•\tvarsta (int)\n" +
                "•\tadresa (String)\n" +
                "Aplica modificatorii de acces astfel încât:\n" +
                "•\tnume să fie public\n" +
                "•\tvarsta să fie private\n" +
                "•\tadresa să fie protected\n" +
                "Definește un constructor pentru a inițializa aceste atribute. Creează metode pentru a obține și seta valorile " +
                "pentru varsta și adresa, deoarece acestea sunt private și protejate. În metoda main, creează un obiect Persoana " +
                "și demonstrează accesul la fiecare atribut folosind metodele de acces.\n" +
                "10.Exercițiul: Clasa \"ContBancar\"\n" +
                "Creează o clasă ContBancar cu următoarele atribute:\n" +
                "•\tnumeClient (String)\n" +
                "•\tsold (double)\n" +
                "Aplica modificatorii de acces astfel încât:\n" +
                "•\tnumeClient să fie public\n" +
                "•\tsold să fie private\n" +
                "Creează o metodă depunere(double suma) care să adauge o sumă la sold și o metodă afisareSold() care " +
                "să returneze valoarea actuală a soldului. În metoda main, creează un obiect ContBancar, depune o sumă și afișează soldul.\n" +
                "11.Exercițiul: Ierarhie de vehicule\n" +
                "Creează o ierarhie de clase pentru vehicule, având următoarele cerințe:\n" +
                "•\tClasa Vehicul trebuie să conțină atribute precum marca și vitezaMaxima.\n" +
                "•\tCreează o subclasă Masina care adaugă un atribut numarLocuri.\n" +
                "•\tCreează o subclasă Motocicleta care adaugă un atribut tipScaun (de exemplu: sport sau touring).\n" +
                "•\tAmbele subclase trebuie să aibă metode care afișează detaliile vehiculului specific " +
                "(de exemplu, detaliiMasina() și detaliiMotocicleta()).\n" +
                "În metoda main, creează instanțe ale fiecărei clase și afișează detaliile fiecărei vehicul.\n" +
                "12.Exercițiul: Ierarhie de animale\n" +
                "Creează o ierarhie de clase pentru animale:\n" +
                "•\tClasa părinte Animal trebuie să conțină atributele nume și varsta.\n" +
                "•\tCreează o subclasă Caine cu un atribut rasă și o metodă latra().\n" +
                "•\tCreează o subclasă Pisica cu un atribut culoareBlana și o metodă miauna().\n" +
                "•\tFiecare subclasă trebuie să aibă metode specifice pentru afișarea comportamentului animalului.\n" +
                "În metoda main, creează instanțe ale fiecărei clase și apelează metodele specifice fiecărui animal.\n" +
                "13.Exercitiul:Ierarhie de angajați\n" +
                "Creează o aplicație care modelează angajați într-o companie:\n" +
                "•\tClasa părinte Angajat trebuie să conțină atributele nume și salariu.\n" +
                "•\tCreează o subclasă Manager care adaugă un atribut departament și o metodă afiseazaDepartament().\n" +
                "•\tCreează o subclasă Programator care adaugă un atribut limbajProgramare și o metodă afiseazaLimbajProgramare().\n" +
                "•\tFiecare subclasă trebuie să aibă o metodă afiseazaDetalii() care afișează informațiile complete despre angajat.\n" +
                "În metoda main, creează instanțe ale fiecărei clase și afișează detaliile angajaților.\n");
    }
}
