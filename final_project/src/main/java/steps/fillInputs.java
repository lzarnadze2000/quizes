package steps;


import pages.Inputs;
import data.RegisterData;
public class fillInputs {
    Inputs inputs =new Inputs();
    RegisterData registerData = new RegisterData();


public fillInputs setFirstname(){
    inputs.firstName.setValue(registerData.firstname);
    return this;

}
    public fillInputs setLastname(){
        inputs.lastname.setValue(registerData.lastname);
        return this;

    }
    public fillInputs setUsername(){
        inputs.userName.setValue(registerData.username);
        return this;

    }
    public fillInputs setPassword(){
        inputs.password.setValue(registerData.password);
        return this;

    }
    public fillInputs setlogUserName(){
        inputs.userName.setValue(registerData.logUserName);
        return this;

    }
    public fillInputs setlogPassword(){
        inputs.Password.setValue(registerData.logPassword);
        return this;

    }

}
