package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanTenureCalculator extends basePage{

	public LoanTenureCalculator(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="loan-tenure-calc")
	WebElement loantenurecalculator;
	
	@FindBy(id="loanamount")
	WebElement loanamount;
	
	@FindBy(id="loanamountslider")
	WebElement loanamountslider;

	@FindBy(id="loanemi")
	WebElement loanemi;
	
	@FindBy(id="loanemislider")
	WebElement loanemislider;

	@FindBy(id="loaninterest")
	WebElement loaninterest;
	
	@FindBy(id="loaninterestslider")
	WebElement loaninterestslider;

	@FindBy(id="loanfees")
	WebElement loanfees;
	
	@FindBy(id="loanfeesslider")
	WebElement loanfeesslider;
	
	//clicks on loan tenure
	public void clickloantenurecalculator() {
		loantenurecalculator.click();
	}

	//checks the UI for Loan Amount 
	public boolean checkLoanAmountTextBox() {
		boolean loanamountTextbox=loanamount.isEnabled();
		return loanamountTextbox;
	}
	
	public boolean checkLoanAmountSlider() {
		boolean loanamountSlider=loanamountslider.isEnabled();
		return loanamountSlider;
	}
	
	//checks the UI for EMI
	public boolean checkLoanEmiTextBox() {
		boolean loanemiTextbox=loanemi.isEnabled();
		return loanemiTextbox;
	}
	
	public boolean checkLoanEmiSlider() {
		boolean loanemiSlider=loanemislider.isEnabled();
		return loanemiSlider;
	}
	
	//checks the UI for Interest rate
	public boolean checkLoanInterestTextBox() {
		boolean loaninterestTextbox=loaninterest.isEnabled();
		return loaninterestTextbox;
	}
	
	public boolean checkLoanInterestSlider() {
		boolean loaninterestSlider=loaninterestslider.isEnabled();
		return loaninterestSlider;
	}
	
	//checks the UI for Fees and charges
	public boolean checkLoanFeesTextBox() {
		boolean loanfeesTextbox=loanfees.isEnabled();
		return loanfeesTextbox;
	}
	
	public boolean checkLoanFeesSlider() {
		boolean loanfeesSlider=loanfeesslider.isEnabled();
		return loanfeesSlider;
	}
	
}
