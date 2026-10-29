package com.pichincha.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class TituloDeLaPagina {

    private TituloDeLaPagina() {
    }

    public static Question<String> actual() {
        return TheWebPage.title();
    }
}
