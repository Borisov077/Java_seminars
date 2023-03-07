import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = randomInt(0, 2000);
        System.out.println(i);

//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        System.out.println(Integer.toBinaryString(i));
        int n = OrderBit(i);
        System.out.println(n);

//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = multiplesNumberN(n,i,Short.MAX_VALUE);

//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    }

    //    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(min,max);
    }

    //    2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    static int OrderBit(int number) {
        return Integer.toBinaryString(number).length();

        //    3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        static int[] multiplesNumberN(int num, int min, int max){
            int size = 0;
            for (int i = min; i < max; i++) {
                if (i % num == 0) size++;
        }
        int[] multiples = new int[size];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (i % num == 0) multiples[index++] = i;
        }
        return multiplesNumberN;
    }


//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
}
}
