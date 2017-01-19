package genericChapter14.genericInterface;

/**
 * Created by Abu.
 */
public interface GenInterface<T, U>
{
    T getValue(U value);
    void valueTo(T value);
}
