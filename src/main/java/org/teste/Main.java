//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] m1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] m2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int x, z;
        for (x = 0; x < 3; x++) {
            for (z = 0; z < 3; z++) {
                m1[x][z] = x + (2 * z);
            }
        }
        for (x = 0; x < 3; x++) {
            for (z = 0; z < 3; z++) {
                m2[x][z] = m1[z][x];
            }
        }
        System.out.println(m1[1][1] + m2[2][2]);

        /*
        * Questão 7
        *
        int a, b, c;
        a = 0;
        c = 0;
        while (a < 4) {
            b = calc(a);
            c = c + b;
            a = a + 1;
        }
        System.out.println(c);*/

        /*
        * Questao 5
        *
        int[] w = {2,13,11,9,7,0};
        int[] z = {3,10,11,8,0,4};
        int i, x, u, p;
        int[] vet;
        for(i=0; i<6; i++){
            if(w[i] > z[i]){
                x= z[i];
                z[i]=w[i];
                w[i]=x;
            }else {
                w[i]= w[i]*2;
                z[i] = z[i]*3;
            }
        }
        u=0;
        p=0;
        for(i=0; i< 6; i++){
            u=u+w[i];
            p=p+z[i];
        }
        System.out.println(u + " " + p);*/

        /*
        * Questão 4
        *
        int z, b, a;
        int[] veet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        a=0;
        for(z=0; z<14; z++){
            b=z+1;
            veet[z] = b+(3*z);
            if (z>0){
                if(veet[b] < veet[z]){
                    a=a+2;
                }else{
                    a=a-1;
                }
            }
        }
        if(veet[5]>veet[10]){
            for (z=4; z<15; z++){
                veet[z]=veet[z]+1;
            }
        }else {
            for (z=0; z<10; z++){
                veet[z]=veet[z]-2;
            }
        }
        System.out.println(veet[5] + "e" + veet[4]);
        */

        /*
        * Questão 02
        *
        int a = 4;
        System.out.println(qualquer(a, a-1));
        */
    }

    private static int calc(int a) {
        if (a < 1) return 0;
        if (a == 1) return 1;
        return (a + calc(a - 1));
    }

    private static int qualquer(int z, int k) {
        if (z == k || z == 0) {
            return 1;
        } else {
            return qualquer(z - 1, k) + qualquer(z - 1, k - 1);
        }
    }
}

