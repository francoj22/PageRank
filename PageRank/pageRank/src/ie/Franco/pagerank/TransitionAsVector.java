package ie.Franco.pagerank;

import java.util.ArrayList;

/**
 * @Description: Transition Vector is a Vector Class that will help to set up the elements.
 *
 */
public class TransitionAsVector extends ArrayList<Double> {
    /**
     * @Description: Constructor: creating a new Vector and setting the values to zero
     * @param size the length of the vector.
     */
    public TransitionAsVector(int size) {
        super(size);
        // setting values
        for (int i = 0; i < size; ++i)
            add(0.0);
    }

    /**
     * @Description: Constructor: creating a new Vector and setting the values given one
     * @param size  the length of the Vector
     * @param value the value to be set up
     */
    public TransitionAsVector(int size, double value) {
        super(size);

        for (int i = 0; i < size; ++i)
            add(value);
    }


    /**
     * Copies the content of vector `a` to the vector
     * @param a the vector to be copied
     */
    public void setAllElementsFromVector(TransitionAsVector a) {
        for (int i = 0; i < size(); ++i)
            set(i, a.get(i));
    }

    @Override
    public String toString() {
        String result = "[";

        if (size() > 0)
            result += get(0) + "";

        for (int i = 1; i < size(); ++i)
            result += " " + get(i);

        result += "]";

        return result;
    }
}
