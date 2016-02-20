package genericChapter14.genericInterface;

/**
 * Created by Abu on 20/02/2016.
 */
public interface GenInterface<T, U>
{
    T getValue(U value);
    void valueTo(T value);
}
