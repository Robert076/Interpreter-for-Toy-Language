package model.dataStructures.myHeap;

import MyException.MyException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.values.Value;

public interface MyIHeap<K, V> {
    V lookup(K key) throws MyException;

    void put(K key, V value);

    void remove(K key);

    boolean contains(K key);

    @Override
    String toString();

    Map<K, V> getHeap();

    List<V> getValues();

    void setHeap(Map<K, V> newHeap);

    Map<Integer, Value> safeGarbageCollector(Set<Integer> usedAddresses, Map<Integer, Value> heap);

    Integer allocate();
}