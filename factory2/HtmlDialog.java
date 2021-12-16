package com.company.factory2;

public class HtmlDialog  extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
