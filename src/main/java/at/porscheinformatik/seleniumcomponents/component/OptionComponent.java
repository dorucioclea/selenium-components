package at.porscheinformatik.seleniumcomponents.component;

import at.porscheinformatik.seleniumcomponents.AbstractSeleniumComponent;
import at.porscheinformatik.seleniumcomponents.ClickableSeleniumComponent;
import at.porscheinformatik.seleniumcomponents.SeleniumComponent;
import at.porscheinformatik.seleniumcomponents.WebElementSelector;

/**
 * @author cet
 */
public class OptionComponent extends AbstractSeleniumComponent implements ClickableSeleniumComponent
{

    public OptionComponent(SeleniumComponent parent, WebElementSelector selector)
    {
        super(parent, selector);
    }

    public String getValue()
    {
        return getAttribute("value");
    }

    public String getNgSelectValue()
    {
        return getAttribute("ng-reflect-ng-value");
    }

    public String getLabel()
    {
        return getText();
    }

}
