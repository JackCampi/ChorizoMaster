package es.nacho.redeem.data;

import java.util.ArrayList;

public class SortedList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T o) {

        if(this.isEmpty()) return super.add(o);

        int length = this.size();

        for(int i=0; i<length+1;i++){
            T prevObject = this.get(i);

            if( i == length+1) return super.add(o);


            if(o.compareTo(prevObject) <=0) {
                this.add(i, o);
                return true;
            }
        }
        throw new RuntimeException("The SortedList cannont add the element");
    }
}
