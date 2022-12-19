package steps;

import data.RegisterData2;
import pages.Inputs;

public class fillInputs2 {

    Inputs inputs =new Inputs();
    RegisterData2 registerData = new RegisterData2();


    public fillInputs2 setFirstname(){
        inputs.firstName.setValue(registerData.firstname);
        return this;

    }
    public fillInputs2 setLastname(){
        inputs.lastname.setValue(registerData.lastname);
        return this;

    }
    public fillInputs2 setUsername(){
        inputs.userName.setValue(registerData.username);
        return this;

    }
    public fillInputs2 setPassword(){
        inputs.password.setValue(registerData.password);
        return this;

    }

}
