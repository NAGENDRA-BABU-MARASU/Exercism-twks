import java.io.File;
import java.io.FileNotFoundException;

class CustomCheckedException extends Exception {

    CustomCheckedException() {
        super();
    }

    CustomCheckedException(String message) {
        super(message);
    }

}
