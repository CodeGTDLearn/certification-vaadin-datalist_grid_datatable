package com.certification.datalistgridtable.practice_project;

import com.certification.datalistgridtable.practice_project.modules.breeds.BreedView;
import com.certification.datalistgridtable.practice_project.modules.cats.CatView;
import com.certification.datalistgridtable.practice_project.modules.dogs.DogView;
import com.certification.datalistgridtable.practice_project.modules.fosters.FosterView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.*;
import org.vaadin.lineawesome.LineAwesomeIcon;

import java.util.Arrays;

import static com.certification.datalistgridtable.practice_project.config.AppTitles.*;

public class MainTabMenu extends AppLayout {

  public MainTabMenu() {

    var header = createHeader();

    header.add(createTabMenu());

    addToNavbar(header);
  }

  private Header createHeader() {

    var header = new Header();
    H1 headerTitle = new H1(MAIN_TAB_TITLE);
    Div divHeader = new Div();

    header
         .addClassNames(
              BoxSizing.BORDER,
              Display.FLEX,
              FlexDirection.COLUMN,
              Width.FULL
         );

    headerTitle
         .addClassNames(
              Margin.Vertical.MEDIUM,
              Margin.End.AUTO,
              FontSize.LARGE
         );

    divHeader
         .addClassNames(
              Display.FLEX,
              AlignItems.CENTER,
              Padding.Horizontal.LARGE
         );

    divHeader.add(headerTitle);

    header.add(divHeader);

    return header;
  }

  private Nav createTabMenu() {

    Nav tabNavBarMenu = new Nav();
    var tabList = new UnorderedList();

    tabNavBarMenu
         .addClassNames(
              Display.FLEX,
              Overflow.AUTO,
              Padding.Horizontal.MEDIUM,
              Padding.Vertical.XSMALL
         );

    tabList.addClassNames(
         Display.FLEX,
         Gap.XLARGE,
         ListStyleType.NONE,
         Margin.NONE, Padding.NONE
    );

    Arrays.stream(createTabs()).forEach(tabList::add);

    tabNavBarMenu.add(tabList);

    return tabNavBarMenu;
  }

  private MenuTabItem[] createTabs() {

    return
         new MenuTabItem[]{
              new MenuTabItem(
                   FOSTERS_TAB_TITLE,
                   LineAwesomeIcon.USER_ALT_SOLID.create(),
                   FosterView.class
              ),
              new MenuTabItem(
                   DOGS_TAB_TITLE,
                   LineAwesomeIcon.DOG_SOLID.create(),
                   DogView.class
              ),
              new MenuTabItem(
                   BREEDS_TAB_TITLE,
                   LineAwesomeIcon.HOTDOG_SOLID.create(),
                   BreedView.class
              ),
              new MenuTabItem(
                   CATS_TAB_TITLE,
                   LineAwesomeIcon.CAT_SOLID.create(),
                   CatView.class
              )
         };
  }

  public static class MenuTabItem extends ListItem {

    private final Class<? extends Component> view;

    public MenuTabItem(
         String title,
         Component icon,
         Class<? extends Component> targetView) {

      this.view = targetView;
      var link = new RouterLink();

      // Use Lumo classnames for various styling
      link
           .addClassNames(
                Display.FLEX,
                Gap.XSMALL,
                Height.MEDIUM,
                AlignItems.CENTER,
                Padding.Horizontal.SMALL,
                TextColor.BODY
           );
      link.setRoute(targetView);

      // Use Lumo classnames for various styling
      Span textTitle = new Span(title);
      textTitle
           .addClassNames(
                FontWeight.MEDIUM,
                FontSize.MEDIUM,
                Whitespace.NOWRAP
           );

      if (icon != null) link.add(icon);
      link.add(textTitle);

      add(link);
    }

    public Class<?> getView() {

      return view;
    }

  }
}