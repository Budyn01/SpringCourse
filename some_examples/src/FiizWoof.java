/**
 * Created by Budyn on 21.04.2018.
 */
public class FiizWoof {

    public
    void
    solution
            (
                    int
                     N)
    {
        for (int i = 1; i <= N; i++) {

            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0) {
                sb.append("Fizz");
            }

            if (i % 5 == 0) {
                sb.append("Buzz");
            }

            if (i % 7 == 0) {
                sb.append("Woof");
            }

            if (sb.length() > 0) {
                System.out.println(sb.toString());
            } else {
                System.out.println(i);
            }

        }
    }
}
