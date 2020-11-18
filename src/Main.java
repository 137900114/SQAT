import java.io.CharArrayReader;
import java.util.ArrayList;

class Greeting{

    private boolean isAllUpperCase(String str){
        for(int i = 0;i != str.length();i++){
            if(!Character.isUpperCase(str.charAt(i))){
                return false;
            }
        }
        return true;
    }



    public String greeting(String name){
        if(name == null){
            name = "my friend";
        }

        if(isAllUpperCase(name)){
            return "HELLO " + name + "!";
        }

        return "Hello," +  name + ".";
    }

    public String greeting_A(String[] name){
        String result = "Hello,";

        ArrayList<String> lower = new ArrayList<>();
        for(int i = 0;i != name.length;i++){
            if(name[i].charAt(0) == '\"' && name[i].charAt(name[i].length() - 1) == '\"'){
                lower.add(name[i].replaceAll("\"",""));
            }else if(name[i].contains(",")){
                String[] arr = name[i].split(",");
                for(int j = 0;j != arr.length;j++){
                    lower.add(arr[j].trim());
                }
            }else{
                lower.add(name[i]);
            }
        }


        String upper = null;
        for(int i = 0;i != lower.size();i++) {
            if (isAllUpperCase(lower.get(i))) {
                upper = lower.get(i);
                lower.remove(i);
                break;
            }
        }

        if(lower.size() == 2){
            result =  "Hello, " + lower.get(0) + " and " + lower.get(1) + ".";
        }else {

            for (int i = 0; i < lower.size() - 1; i++) {
                result += ' ' + lower.get(i) + ',';
            }
            result +=  " and "+ lower.get(lower.size() - 1) + ".";
        }
        if(upper != null){
            result += " AND HELLO " + upper + "!";
        }

        return result;
    }

}