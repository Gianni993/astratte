public abstract class Forma {
    int base;
    int altezza;

    Forma(int base, int altezza){
        this.base = base;
        this.altezza = altezza;}


abstract void calcolaArea(int base,int altezza);
}
