//THIS PROGRAM PREPARED BY PRACHI GAJERA 21CE030
// 11) Create a Triplet class that encapsulates three objects of the same data type in a given
// instance of Triplet.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

// Triplet class
class Triplet<U, V, T> {
    public final U first; // the first field of a triplet
    public final V second; // the second field of a triplet
    public final T third; // the third field of a triplet

    // Constructs a new triplet with the given values
    private Triplet(U first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Object o) {
        /* Checks specified object is "equal to" the current object or not */

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triplet triplet = (Triplet) o;

        // call `equals()` method of the underlying objects
        if (!first.equals(triplet.first) ||
                !second.equals(triplet.second) ||
                !third.equals(triplet.third)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
    public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c) {
        return new Triplet<>(a, b, c);
    }
}
class Main {
    public static void main(String[] args) throws ExecutionException {
        Triplet<String, Integer, Character> p1 = Triplet.of("PRACHI", 13, 'F');
        Triplet<String, Integer, Character> p2 = Triplet.of("RAM", 20, 'M');
        Triplet<String, Integer, Character> p3 = Triplet.of("SITA", 13, 'F');

        List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);

        System.out.println(pairs);

        Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
        System.out.println(distinctTriplets);
    }
}