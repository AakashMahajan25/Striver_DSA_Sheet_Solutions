public class Switch_Statements {
    public static double areaSwitchCase(int ch, double []a) {
        
        double pi = Math.PI;
        double x=0, y=0;

        switch (ch) {

            case 1: 
                a[0]=x;
                return pi*x*x;

            case 2:
                a[0]=x;
                a[1]=y;
                return 2*x*y;

        }
    }
}

//Was some unknown error in solving the problem