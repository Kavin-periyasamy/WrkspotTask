package com.example.wrkspot.wrkspottask.mvc;

public class Controller {
    private Model mvcModel;
    private View mvcView;

    public Controller(Model mvcModel,View mvcView)
    {
        this.mvcModel=mvcModel;
        this.mvcView=mvcView;
    }
    public void setStudentName(String studentName)
    {
        mvcModel.setStudentName(studentName);
    }
    public String getStudentName()
    {
        return mvcModel.getStudentName();
    }
    public void setRegisterNumber(int registerNumber)
    {
        mvcModel.setRegisterNumber(registerNumber);
    }
    public int getRegisterNumber()
    {
        return mvcModel.getRegisterNumber();
    }
    public  void setBatch(int batch)
    {
        mvcModel.setBatch(batch);
    }
    public int getBatch()
    {
        return mvcModel.getBatch();
    }
    public void details()
    {
        View.studentDetails(mvcModel.getStudentName(),mvcModel.getRegisterNumber(),mvcModel.getBatch());
    }

}
