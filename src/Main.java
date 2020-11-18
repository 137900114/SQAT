class Greeting{

    public String greeting(String name){
        if(name == null){
            name = "my friend";
        }

        boolean isAllUpperCase = true;
        for(int i = 0;i != name.length();i++){
            if(!Character.isUpperCase(name.charAt(i))){
                isAllUpperCase = false;
                break;
            }
        }

        if(isAllUpperCase){
            return "HELLO " + name + "!";
        }

        return "Hello," +  name + ".";
    }
}