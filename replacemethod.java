public class replacemethod {
    public static String myReplace(String given, String old, String newStr) {
        String[] givenArr = given.split(" ");
        String result = ""; 

        for (int a = 0; a < givenArr.length; a++) {
            if (givenArr[a].equals(old)) {
                givenArr[a] = newStr; 
            }
            result += givenArr[a] + " "; 
        }

        return result;
    }

    public static void main(String[] args) {
        String given = "This is my cat and I love my cat";
        String replaced = myReplace(given, "cat", "dog"); 
        System.out.println(replaced);     
  }
}
