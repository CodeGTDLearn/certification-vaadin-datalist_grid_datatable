package com.certification.datalistgridtable.practice_project.tabViews.dogs;

import com.certification.datalistgridtable.practice_project.TabMainMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Dogs")
@Route(value = "dogs", layout = TabMainMenu.class)
public class DogsView extends VerticalLayout {

    public DogsView() {
        setSpacing(false);
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");

        Grid<Dog> grid = new Grid<>(Dog.class);

    }

}