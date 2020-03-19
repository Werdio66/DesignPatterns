package com._520.composite;

public class Client {

    public static void main(String[] args) {
        OrgenizitionComponent school = new School("西安工业大学");

        OrgenizitionComponent computerCollege = new College("计算机学院");
        OrgenizitionComponent infoCollege = new College("电信学院");

        school.add(computerCollege);
        school.add(infoCollege);

        computerCollege.add(new Profession("软件工程"));
        computerCollege.add(new Profession("计算机科学与技术"));

        infoCollege.add(new Profession("自动化"));

        school.print();
    }
}
