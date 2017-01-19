package genericChapter14.genericInterface;

/**
 * Created by Abu.
 */
public interface GenInterfaceTwo<T, U>
{
    /* When the subclass inherits T and U, the will forced
     * by the compiler to give it a data-type when using
     * the implements statement.
     * After assigning the data-type, the type-parameters
     * will change to their respective data-types.
     */
    T getTypeForT(); // --> T getTypeForT will become --> String getTypeForT
    U getTypeForU(); // --> U getTypeForU will become --> Integer getTypeForU
}
