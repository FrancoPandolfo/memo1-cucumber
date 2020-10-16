package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	
	//belly
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
 
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
     
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        
    }
    
    //calculator
    @Given("I have a calculator")
    public void i_have_a_calculator() {
    	this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer num1, Integer num2) {
    	this.result = this.calculator.add(num1, num2);
    }
    
    @Then("I get {int}")
    public void i_get(Integer result) throws Exception {
    	if (this.result != result) {
    		throw new Exception();
    	}
    }
    
    private Calculator calculator;
    private int result;


}
