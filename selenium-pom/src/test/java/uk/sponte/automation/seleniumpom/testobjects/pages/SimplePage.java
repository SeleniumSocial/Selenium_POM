package uk.sponte.automation.seleniumpom.testobjects.pages;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.annotations.Frame;
import uk.sponte.automation.seleniumpom.annotations.Section;
import uk.sponte.automation.seleniumpom.testobjects.sections.*;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class SimplePage {
    @FindBy(tagName = "h1")
    public PageElement headline;

//    @FindBy(tagName = "h1")
//    private PageElement privateHeadline;
//
//    @FindBy(tagName = "h2")
//    public PageElement subtitle;
//
//    public PageElement someInput;
//
//    @FindBy(id = "dblClick")
//    public PageElement doubleClick;
//
//    public PageElement drag;
//    public PageElement drop;
//
//    public PageElement createElementAfterDelay;
//    public PageElement removeElementAfterDelay;
//    public PageElement hideElementAfterDelay;
//    public PageElement showElementAfterDelay;
//
//    public PageElement newElement;
//
//    @FindBy(className = "item")
//    public List<PageElement> listPageElements;
//
//    /**
//     * Describes a section on the page, group of elements and other
//     * sections.
//     */
//    @Section public ParentSection parent;
//
//    public TestSection section;
//
//    @FindBy(id = "plainSection")
//    public PlainSection basedOnFindByAnnotation;
//
//    @FindBy(className = "sectionListItem")
//    @Section public List<SectionListItem> sectionList;
//    @Section public PlainSection plainClassSection;
//
//
//    @FindBy(className = "sectionListItem")
//    public List<SectionListItem> sectionListWithoutAnnotation;
//
//    @FindBy(className = "listItem")
//    @Section public List<ListItem> listItems;
//
//    public PageElement hidden;
//
//    @Frame()
//    @FindBy(tagName = "iframe")
//    public FrameSection iframe;
//
//    public String getPrivateHeadlineContents() {
//        return this.privateHeadline.getText();
//    }
}
