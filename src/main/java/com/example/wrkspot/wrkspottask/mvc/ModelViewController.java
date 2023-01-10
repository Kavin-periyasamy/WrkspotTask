package com.example.wrkspot.wrkspottask.mvc;

public class ModelViewController {
    private static Model detailsFromDatabase()
    {
        Model newModel = new Model();
        newModel.setStudentName("praveen");
        newModel.setRegisterNumber(123);
        newModel.setBatch(1);
        return newModel;
    }
    public static void main(String[] args)
    {
        Model mvcModel=detailsFromDatabase();
        View mvcView=new View();
        Controller mvcControl=new Controller(mvcModel,mvcView);
        mvcControl.details();
        mvcControl.setBatch(7);
        mvcControl.details();
    }
}
