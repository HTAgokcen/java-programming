package day48_consructors_static;

import java.util.Arrays;

public class CyberGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");//dependency injection. Group object depends on String name
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maris");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());
        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephan", "Waksum", "Akrem", "Bulent", "Andrea", "Andrei"));

        //print all members.not to.String()
        System.out.println("group2 members " + group2.getMembers());
        //use if statement to check if Akrem is in group2


        }





    }
