package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRPosition extends AbstractClass {
        WebDriver driver = Driver.getDriver();
        @FindBy(
                xpath = "//span[text()='Positions']"
        )
        private WebElement positions;
        @FindBy(
                xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input"
        )
        private WebElement inputpositionName;
        @FindBy(
                xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input"
        )
        private WebElement getInputPositionShortName;

        public HRPosition() {
            PageFactory.initElements(this.driver, this);
        }

        public void clickOnPositions() {
            this.clickFunction(this.positions);
        }

        public void typeInputpositionName(String citizenName) {
            this.sendkeysFunction(this.inputpositionName, citizenName);
        }

        public void typeInputpositionShortName(String shortName) {
            this.sendkeysFunction(this.getInputPositionShortName, shortName);
        }
}
