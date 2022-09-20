import java.util.*;

public class Translator {

    private Map<Integer, String> numberToAlfabetic = new HashMap<>();
//    private String placeholderString; //Is needed for the complicated method

    public Translator(List numberList, String[] alfabeticNumber) {

        for (int i = 0; i < numberList.size(); i++) {

            numberToAlfabetic.put((Integer) numberList.get(i), alfabeticNumber[i]);
        }
    }

    public String translate(Integer userNumber) {

        //very complicated method to get the result. This was my first try.
//        Iterator<Map.Entry<Integer, String>> iterator = numberToAlfabetic.entrySet().iterator();
//
//
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> result = (Map.Entry<Integer, String>) iterator.next();
//            if (result.getKey().equals(userNumber)) {
//                placeholderString = result.getValue();
//                break;
//            }
//
//        }

        return numberToAlfabetic.get(userNumber);
    }
}
