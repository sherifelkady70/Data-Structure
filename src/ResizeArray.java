import java.lang.reflect.Array;

public class ResizeArray {


    public <T> T[] resize(int newSizeOfArray,T[] givenArray , Class<T> newTypeClass) {
        T[] newSizeArray = (T[])  Array.newInstance(newTypeClass,newSizeOfArray);

        //validation
        if (newSizeOfArray <= 0 || givenArray == null) return givenArray;

        //System.arraycopy(newArray, 0, newSizeArray, 0, newSizeOfArray);

        System.arraycopy(givenArray, 0, newSizeArray, 0, givenArray.length);
        return newSizeArray;
    }

}
