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

        if(name.length == 2){
            return "Hello," + name[0] + " and " + name[1] + ".";
        }

        for(int i = 0;i < name.length - 1;i++){
            result += ' '+ name[i] + ',';
        }

        result +=  " and "+ name[name.length - 1] + ".";

        return result;
    }

}