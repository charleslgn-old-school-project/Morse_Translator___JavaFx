package metier;

import interfaces.List;

public class ArbreBinaire<T> implements List<T> {

    private T donne ;
    private ArbreBinaire<T> brancheGauche;
    private ArbreBinaire<T> brancheDroite;


    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean estVide() {
        return false;
    }

    @Override
    public boolean contient(Object obj) {
        return false;
    }

    @Override
    public int indexDe(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexDe(Object obj) {
        return 0;
    }

    @Override
    public T get(int index) {
        throw new NullPointerException("can't be get");
    }

    @Override
    public void add(T t, int position) {

    }

    @Override
    public void set(int index, Object nouveauElement) throws IndexOutOfBoundsException {

    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void retirer(int index) {

    }

    @Override
    public void vider() {

    }
}
