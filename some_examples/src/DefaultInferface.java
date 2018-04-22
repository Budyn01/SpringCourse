/**
 * Created by Budyn on 21.04.2018.
 */
public interface DefaultInferface {

    default int method() {
        System.out.println("Siema");
        return 1;
    }

    default int met() {
        return 2;
    }


}
