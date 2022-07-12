package com.translator;

import com.translator.VietnameseTarget ;
import com.translator.JapanAdaptee ;

public class TranslatorAdapter implements VietnameseTarget{
    private JapanAdaptee adaptee ;

    public TranslatorAdapter(JapanAdaptee adaptee){
        this.adaptee = adaptee ;
    }

    public void send(String words){
        System.out.println("Reading words ... ");
        System.out.println(words);
        String vietnamesewords = this.translate(words) ;
        System.out.println("Receiving words ... ") ;
        adaptee.receive(vietnamesewords) ;
    }

    public String translate(String vietnameseWords){
        System.out.println("Translated !!!") ;
        return "こんにちは" ;
    }
}
