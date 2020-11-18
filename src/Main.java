import java.io.CharArrayReader;

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

        String upper = null;
        String[] lower = null;
        for(int i = 0;i != name.length;i++){
            if(isAllUpperCase(name[i])){
                upper = name[i];
                lower = new String[name.length - 1];
                int lower_index = 0;
                for(int j = 0;j != name.length;j++){
                    if(name[j] != upper){
                        lower[lower_index++] = name[j];
                    }
                }
            }
        }

        if(upper == null){
            lower = name;
        }

        if(lower.length == 2){
            result =  "Hello, " + lower[0] + " and " + lower[1] + ".";
        }else {

            for (int i = 0; i < lower.length - 1; i++) {
                result += ' ' + lower[i] + ',';
            }
            result +=  " and "+ lower[lower.length - 1] + ".";
        }
        if(upper != null){
            result += " AND HELLO " + upper + "!";
        }

        return result;
    }

}