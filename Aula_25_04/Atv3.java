public class Atv3 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {1,3,8,9,4,6};

        for (int i = 0; i < num1.length;i++){
            num1[i] = Integer.parseInt(args[i]);
            }
        for (int i = 0; i < num2.length;i++){
            num2[i] = Integer.parseInt(args[i]);
        }

        int iguais = 0;
        for(int i = 0; i < num1.length;i++){
            for(int j = 0; j < num2.length;i++){
                if (num1[i] == num2[i]) {
                    iguais++;
                    break;
                }
            }
        }
        System.out.println("Os números iguais são :" + iguais);
        }
    } 