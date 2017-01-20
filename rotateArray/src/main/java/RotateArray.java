/**
 * Created by andykim on 1/18/17.
 */
import java.util.Arrays;

public class RotateArray {

    int[] array = {1, 2, 3, 4, 5};


    void rotateArray(int[] array, int numberOfTimesToRotate) {

        System.out.println(Arrays.toString(array));

        for (int j = 0; j < numberOfTimesToRotate; j++) {
            for (int i = array.length - 1; i > 0; i--) {
                int tempVar = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tempVar;

            }


        }
        System.out.println(Arrays.toString(array));
    }
}




