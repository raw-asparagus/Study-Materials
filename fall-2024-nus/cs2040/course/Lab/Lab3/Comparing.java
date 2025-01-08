import java.util.*;

public class Comparing {
    public static void main(String[] args) {
        // base array used for populating all examples in this program
        int[] baseArr = {3, 7, 4, 3, 5, 6};
        
        
        // examples for MyInteger1 (implemented Comparable)
        MyInteger1[] arrA1 = new MyInteger1[6];
        MyInteger1[] arrA2 = new MyInteger1[6];
        MyInteger1[] arrA3 = new MyInteger1[6];
        MyInteger1[] arrA4 = new MyInteger1[6];
        MyInteger1[] arrA5 = new MyInteger1[6];
        
        ArrayList<MyInteger1> listA1 = new ArrayList<MyInteger1>();
        ArrayList<MyInteger1> listA2 = new ArrayList<MyInteger1>();
        ArrayList<MyInteger1> listA3 = new ArrayList<MyInteger1>();
        ArrayList<MyInteger1> listA4 = new ArrayList<MyInteger1>();
        ArrayList<MyInteger1> listA5 = new ArrayList<MyInteger1>();
        
        for (int i = 0; i < 6; i++) {
            arrA1[i] = new MyInteger1(baseArr[i]);
            arrA2[i] = new MyInteger1(baseArr[i]);
            arrA3[i] = new MyInteger1(baseArr[i]);
            arrA4[i] = new MyInteger1(baseArr[i]);
            arrA5[i] = new MyInteger1(baseArr[i]);
            
            listA1.add(new MyInteger1(baseArr[i]));
            listA2.add(new MyInteger1(baseArr[i]));
            listA3.add(new MyInteger1(baseArr[i]));
            listA4.add(new MyInteger1(baseArr[i]));
            listA5.add(new MyInteger1(baseArr[i]));
        }
        
        // sort by default ordering (ascending order)
        Arrays.sort(arrA1);
        System.out.println("Array A1: " + Arrays.toString(arrA1));
        Collections.sort(listA1);
        System.out.println("List A1: " + listA1);
        
        // sort by reverse ordering
        Arrays.sort(arrA2, Comparator.reverseOrder());
        System.out.println("Array A2: " + Arrays.toString(arrA2));
        Collections.sort(listA2, Comparator.reverseOrder());
        System.out.println("List A2: " + listA2);
        
        // sort by comparator (comparator uses ascending order)
        Arrays.sort(arrA3, new MyInteger1Comparator());
        System.out.println("Array A3: " + Arrays.toString(arrA3));
        Collections.sort(listA3, new MyInteger1Comparator());
        System.out.println("List A3: " + listA3);
        
        // sort by comparator (comparator uses ascending order)
        Arrays.sort(arrA4, new Comparator<MyInteger1>() {
            public int compare(MyInteger1 first, MyInteger1 second) {
                return first.value - second.value;
            }
        });
        System.out.println("Array A4: " + Arrays.toString(arrA4));
        Collections.sort(listA4, new Comparator<MyInteger1>() {
            public int compare(MyInteger1 first, MyInteger1 second) {
                return first.value - second.value;
            }
        });
        System.out.println("List A4: " + listA4);
        
        // sort by comparator (comparator uses ascending order, lambda method)
        Arrays.sort(arrA5, (first, second) -> {
            return first.value - second.value;
        });
        System.out.println("Array A5: " + Arrays.toString(arrA5));
        Collections.sort(listA5, (first, second) -> {
            return first.value - second.value;
        });
        System.out.println("List A5: " + listA5);
        
        System.out.println();
        
        // examples for MyInteger2 (Comparable not implemented)
        MyInteger2[] arrB1 = new MyInteger2[6];
        MyInteger2[] arrB2 = new MyInteger2[6];
        MyInteger2[] arrB3 = new MyInteger2[6];
        MyInteger2[] arrB4 = new MyInteger2[6];
        MyInteger2[] arrB5 = new MyInteger2[6];
        
        ArrayList<MyInteger2> listB1 = new ArrayList<MyInteger2>();
        ArrayList<MyInteger2> listB2 = new ArrayList<MyInteger2>();
        ArrayList<MyInteger2> listB3 = new ArrayList<MyInteger2>();
        ArrayList<MyInteger2> listB4 = new ArrayList<MyInteger2>();
        ArrayList<MyInteger2> listB5 = new ArrayList<MyInteger2>();
        
        for (int i = 0; i < 6; i++) {
            arrB1[i] = new MyInteger2(baseArr[i]);
            arrB2[i] = new MyInteger2(baseArr[i]);
            arrB3[i] = new MyInteger2(baseArr[i]);
            arrB4[i] = new MyInteger2(baseArr[i]);
            arrB5[i] = new MyInteger2(baseArr[i]);
            
            listB1.add(new MyInteger2(baseArr[i]));
            listB2.add(new MyInteger2(baseArr[i]));
            listB3.add(new MyInteger2(baseArr[i]));
            listB4.add(new MyInteger2(baseArr[i]));
            listB5.add(new MyInteger2(baseArr[i]));
        }
        
        // lines below commented out: will not even be able to compile
        // due to not implementing Comparable
        /*
        // sort by default ordering (ascending order)
        Arrays.sort(arrB1);
        System.out.println("Array B1: " + Arrays.toString(arrB1));
        Collections.sort(listB1);
        System.out.println("List B1: " + listB1);
        
        // sort by reverse ordering
        Arrays.sort(arrB2, Comparator.reverseOrder());
        System.out.println("Array B2: " + Arrays.toString(arrB2));
        Collections.sort(listB2, Comparator.reverseOrder());
        System.out.println("List B2: " + listB2);
        */
        
        // sort by comparator (comparator uses descending order)
        Arrays.sort(arrB3, new MyInteger2Comparator());
        System.out.println("Array B3: " + Arrays.toString(arrB3));
        Collections.sort(listB3, new MyInteger2Comparator());
        System.out.println("List B3: " + listB3);
        
        // sort by comparator (comparator uses descending order)
        Arrays.sort(arrB4, new Comparator<MyInteger2>() {
            public int compare(MyInteger2 first, MyInteger2 second) {
                return second.value - first.value;
            }
        });
        System.out.println("Array B4: " + Arrays.toString(arrB4));
        Collections.sort(listB4, new Comparator<MyInteger2>() {
            public int compare(MyInteger2 first, MyInteger2 second) {
                return second.value - first.value;
            }
        });
        System.out.println("List B4: " + listB4);
        
        // sort by comparator (comparator uses descending order, lambda method)
        Arrays.sort(arrB5, (first, second) -> {
            return second.value - first.value;
        });
        System.out.println("Array B5: " + Arrays.toString(arrB5));
        Collections.sort(listB5, (first, second) -> {
            return second.value - first.value;
        });
        System.out.println("List B5: " + listB5);
    }
}

// MyInteger1 implements the Comparable interface, so
// it can be directly used for sorting without using
// a Comparator
// The class definition generally follows the format of:
// class A implements Comparable<A>
class MyInteger1 implements Comparable<MyInteger1> {
    int value;
    
    public MyInteger1(int value) {
        this.value = value;
    }
    
    // a negative result means this < other,
    // a positive result means this > other,
    // a result of zero means this == other
    // as the result of the comparison
    // the method signature generally follows the format of:
    // public int compareTo(A other)
    public int compareTo(MyInteger1 other) {
        // easy trick for comparing integers
        return value - other.value;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
}

// MyInteger2 does not implement the Comparable interface,
// so it requires a Comparator to sort
class MyInteger2 {
    int value;
    
    public MyInteger2(int value) {
        this.value = value;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
}

// Comparator for MyInteger1 class
// The class definition generally follows the format of:
// class B implements Comparator<A>
// The class A which this comparator compares must be written here,
//              in between the < and > brackets ____________
class MyInteger1Comparator implements Comparator<MyInteger1> {
    
    // note this compare method is written to order from largest to smallest
    // the method signature generally follows the format of:
    // public int compare(A first, A second)
    public int compare(MyInteger1 first, MyInteger1 second) {
        return first.value - second.value;
    }
}

// Comparator for MyInteger2 class
// The class which this comparator compares must be written here,
//              in between the < and > brackets ____________
class MyInteger2Comparator implements Comparator<MyInteger2> {
    
    public int compare(MyInteger2 first, MyInteger2 second) {
        return second.value - first.value;
    }
}