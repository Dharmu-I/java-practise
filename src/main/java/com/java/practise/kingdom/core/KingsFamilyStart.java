package com.java.practise.kingdom.core;

import com.java.practise.kingdom.enums.Gender;
import com.java.practise.kingdom.enums.RelationOfKing;

import java.io.*;
import java.util.List;

public class KingsFamilyStart {

    private KingsFamilyPerson buildFamilyPerson(String fatherName, String motherName, RelationOfKing relationOfKing) {
        Person father = new Person(fatherName, Gender.Male);
        Person mother = new Person(motherName, Gender.Female);
        return new KingsFamilyPerson(father, mother, relationOfKing);
    }

    private void loadFamilyMemberDetails(KingsFamilyManager kingsFamilyManager) {
        kingsFamilyManager.addChildToFamily("Anga", "Chit", Gender.Male);
        kingsFamilyManager.addSpouseDetails("Chit", "Amba", Gender.Female);
        kingsFamilyManager.addChildToFamily("Anga", "Ish", Gender.Male);
        kingsFamilyManager.addChildToFamily("Anga", "Vich", Gender.Male);
        kingsFamilyManager.addSpouseDetails("Vich", "Lika", Gender.Female);
        kingsFamilyManager.addChildToFamily("Anga", "Aras", Gender.Male);
        kingsFamilyManager.addSpouseDetails("Aras", "Chitra", Gender.Female);
        kingsFamilyManager.addChildToFamily("Anga", "Satya", Gender.Female);
        kingsFamilyManager.addSpouseDetails("Satya", "Vyan", Gender.Male);
        kingsFamilyManager.addChildToFamily("Amba", "Dritha", Gender.Female);
        kingsFamilyManager.addSpouseDetails("Dritha", "Jaya", Gender.Male);
        kingsFamilyManager.addChildToFamily("Dritha", "Yodhan", Gender.Male);
        kingsFamilyManager.addChildToFamily("Amba", "Tritha", Gender.Female);
        kingsFamilyManager.addChildToFamily("Amba", "Vritha", Gender.Male);
        kingsFamilyManager.addChildToFamily("Lika", "Vila", Gender.Female);
        kingsFamilyManager.addChildToFamily("Lika", "Chika", Gender.Female);
        kingsFamilyManager.addChildToFamily("Chitra", "Jnki", Gender.Female);
        kingsFamilyManager.addSpouseDetails("Jnki", "Arit", Gender.Male);
        kingsFamilyManager.addChildToFamily("Jnki", "Laki", Gender.Male);
        kingsFamilyManager.addChildToFamily("Jnki", "Lavnya", Gender.Female);
        kingsFamilyManager.addChildToFamily("Chitra", "Ahit", Gender.Male);
        kingsFamilyManager.addChildToFamily("Satya", "Asva", Gender.Male);
        kingsFamilyManager.addSpouseDetails("Asva", "Satvy", Gender.Female);
        kingsFamilyManager.addChildToFamily("Satvy", "Vasa", Gender.Male);
        kingsFamilyManager.addChildToFamily("Satya", "Vyas", Gender.Male);
        kingsFamilyManager.addSpouseDetails("Vyas", "Krpi", Gender.Female);
        kingsFamilyManager.addChildToFamily("Krpi", "Kriya", Gender.Male);
        kingsFamilyManager.addChildToFamily("Krpi", "Krithi", Gender.Female);
        kingsFamilyManager.addChildToFamily("Satya", "Atya", Gender.Female);
    }

    private void displayDetails(List<String> names) {

        if (names.isEmpty()) {
            System.out.println("NONE");
            return;
        }

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    private void makeDecision(String[] input, KingsFamilyManager kingsFamilyManager){
        if (input[0].equalsIgnoreCase("ADD_CHILD") && input.length == 4){
            System.out.println(kingsFamilyManager.addChildToFamily(input[1].replace("\"",""),
                    input[2].replace("\"",""),
                    Gender.valueOf(input[3])));
        }else if (input[0].equalsIgnoreCase("GET_RELATIONSHIP") && input.length == 3){
            displayDetails(kingsFamilyManager.getRelation(input[1].replace("\"",""), input[2]));
        }else {
            System.out.println("Invalid line input or given input don't have valid line of argument");
        }
    }

    private void start(String fileName, KingsFamilyManager kingsFamilyManager) {
        File file = new File(fileName);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String eachLine;
            while ((eachLine = bufferedReader.readLine()) != null) {
                String[] input = eachLine.split(" ");
                makeDecision(input,kingsFamilyManager);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Given file not found");
        } catch (IOException ex) {
            System.out.println("file read failed");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("File closing has problem");
                }
            }
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("No file input");
        }
        String fileName = args[0];
        KingsFamilyStart kingsFamilyStart = new KingsFamilyStart();
        KingsFamilyPerson kingsFamilyPerson =
                kingsFamilyStart.buildFamilyPerson("Shan", "Anga", RelationOfKing.Father);
        KingsFamilyTree.getKingsFamilyTreeInstance(kingsFamilyPerson);
        KingsFamilyManager kingsFamilyManager = new KingsFamilyManagerImpl();
        kingsFamilyStart.loadFamilyMemberDetails(kingsFamilyManager);
        kingsFamilyStart.start(fileName, kingsFamilyManager);
    }
}
