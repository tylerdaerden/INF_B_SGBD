package main.DAL.Section;

import java.util.ArrayList;

import main.BL.Section.Section;

public interface ISectionDAO {

    public ArrayList<Section> getSections();

    public int getIDSection(String nom);

    public boolean updateSection(int id, String nom);

    public boolean deleteSection(int id);

    public boolean addSection(String nom);

}