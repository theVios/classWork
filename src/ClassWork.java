public class ClassWork{
        public static void main(String[] args) {

            int A_x_coor = 5;
            int A_y_coor = 4;
            int B_x_coor = 3;
            int B_y_coor = 2;
            int C_x_coor = -1;
            int C_y_coor = -1;
            int otr1 = (B_x_coor - A_x_coor);
            int otr2 = (C_y_coor - A_y_coor);
            int otr3 = (C_x_coor - A_x_coor);
            int otr4 = (B_y_coor - A_y_coor);
            int S1 = otr1 * otr2;
            int S2 = otr3 * otr4;
            int S = S1 - S2;
            S = Math.abs(S);
            S = S / 2;
            System.out.println("ploshad' = " + S);

            // kak indusi zaveshali

        }

}
