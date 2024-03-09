package com.example.kttkht_wk4;

import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("T:\\KTTKPM_Wk4\\report.xml"));
        depend.addDirectory("T:\\KTTKPM_Wk4\\LibraryAssistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
