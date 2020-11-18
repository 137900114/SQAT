class Greeting{

    public String greeting(String name){
        if(name == null){
            name = "my friend";
        }

        return "Hello," +  name + ".";
    }
}