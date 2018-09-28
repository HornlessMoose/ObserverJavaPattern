package clean;

import clean.Interface.Observer;

public class User implements Observer {

    private String userName;

    public User(String userName){
        this.userName = userName;
    }

    public void update(Object product){
        if(((Product) product).getState()){
            System.out.println("Olá " + userName +"\nO produto " + ((Product) product).getProductName() + " de seu enteresse chegou.\n");
        }
    }

}
