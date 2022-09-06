package JavaHomeworks;

// 2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
// Если общего префикса нет, то возвращать пустую строку. Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

//public class Sem1 {
//    public static void main(String[] args) {
//        String [] text = {"aabb", "aabbb", "aaabb"};
//        System.out.printf(FindMaxPrefix(text));
//    }
//
//    public static String FindMaxPrefix(String [] words) {
//        String prefix = words[0];
//        for (int i = 1; i < words.length; i++) {
//            while (words[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length()-1);
//            }
//        if (prefix.isEmpty()) return "";
//        }
//        return prefix;
//    }
//}

// 1. Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива такой,
// что сумма элементов с индексами < i равна сумме элементов с индексами > i.
public class Sem1 {
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        System.out.print(FindIndex(nums));

    }
    public static int FindIndex(int [] arr) {
        int index = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < arr.length; i++) {
            leftSum+=arr[i-1];
            for (int j = arr.length-1; j > i; j--) {
                rightSum+= arr[j];
            }

            if (leftSum==rightSum) {
                index = i;
                break;
            }
            else {
                rightSum = 0;
            }

        }
        return index;
    }
}
