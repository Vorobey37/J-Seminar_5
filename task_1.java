import java.util.HashMap;

public class task_1 {
    public static void main(String[] args) {
        /*
         * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foof", t = "baau"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
         */
        System.out.println(isIzomorf);
        private static Boolean isIzomorf()
        {
            String s1 = "add";
            String s2 = "egg";
            if (s1.length() != s2.length())
            {
                return false;
            }
            if (s1.equals(s2))
            {
               return true;
            }
            HashMap<Character, Character> text = new HashMap<>();

            for (int i = 0; i < s1.length; i++) {
                Character c1 = s1.charAt(i);
                Character c2 = s2.charAt(i);
                if (!text.containsKey(c1)) {
                    text.put(c1, c2);
                } else if (text.get(c1) != c2) {
                    return false;
                }

            }
            return true;
        }

    }
}
