package StepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.HRPosition;
import cucumber.api.java.en.Given;


    public class PositionSteps extends AbstractClass {
        HRPosition hrp = new HRPosition();

        public PositionSteps() {
        }

        @Given("^Click on positions$")
        public void click_on_positions() throws Throwable {
            this.hrp.clickOnPositions();
        }

        @Given("^Type in new positions names \"([^\"]*)\"$")
        public void type_in_new_postions_names(String arg1) throws Throwable {
            this.hrp.typeInputpositionName(arg1);
        }

        @Given("^Type in shortnames\"([^\"]*)\"$")
        public void type_in_shortnames(String arg1) throws Throwable {
            this.hrp.typeInputpositionShortName(arg1);
        }
    }


