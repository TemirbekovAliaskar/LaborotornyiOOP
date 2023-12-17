package numberFirstLab.phone;

public class Phone {
    public String number;
    public String model;
    public String weight;

    public void receiveCall(String name){
        System.out.println("Call "+ name);
    }
    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone() {
    }

    public void receiveCall(String name, String number){
        System.out.println("Call to :"+ name);
        System.out.println("Number phone  :"+ number);
    }

    public void SendMessage(String... number){
        for(String i : number){
            System.out.println(i);
        }
    }
}
