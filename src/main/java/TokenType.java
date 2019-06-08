public class TokenType {
    public String Type;
    public String Name;
    public int Number;

    public TokenType(){

    }

    public TokenType(String type, String name, int number) {
        Type = type;
        Name = name;
        Number = number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber(){
        return Number;
    }

    public void setName(int number){
        Number = number;
    }
}
