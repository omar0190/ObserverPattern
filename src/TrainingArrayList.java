// En statisk metode tilhører klassen, og ikke et objekt.
// Du skal instatiere d
///Hahahhaahah

import java.util.ArrayList;

public class TrainingArrayList {
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("boo");
    arr.add("baz");
    arr.add("foo");

        String str;
        System.out.println(arrayListReturn(arr, str: "boo"));
    }

    public static boolean arrayListReturn(ArrayList list, String str){
        if(str.equals(null)){
            return false;
        }


        if (list.contains(str)){
            return false;
        }
        else{
            list.add(str);
            return true;
        }

        return true;
    }
}
