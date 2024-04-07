package com;
import java.io.File;
import java.util.LinkedList;

public class Immigration {

    String immigrandId = "";


    /*
       Set immigrantId
     */
    public void setImmigrandId(String immigrandId) {
        this.immigrandId = immigrandId;
    }


    /*
      Get immigrantId
     */
    public String getImmigrandId() {
        return immigrandId;
    }


    public int CountWFItems (String StepName){
        return 0;
    }

    /*
      this will add a dependent to the person
      return 0 for good 1 for fail
     */
    public int addDependent(FormData data, LinkedList<FormData> dependentList){
        return 0;
    }

    /*
     this will remove a dependent from the person
     return 0 for good 1 for fail
    */
    public int removeDependent(FormData data, LinkedList<FormData> dependentList){
        return 0;
    }


    /*
    reads form data and populates the data
    return NULL if failed or obj of populated form data
     */
    public FormData reviewData(File form){
        return null;
    }


    /*
    linked up with database and checks if info is valid
    return 0 if approved 1 if not
     */
    public int approveData(FormData data){
        return 0;
    }

    /*
    checks form to make sure everything in the form is the correct type of input
    return 0 for valid input otherwise 1
     */
    public int validateForm(FormData data){
        return 0;
    }


    /*
    requests the children for the alien Fiance
     */
    public boolean requestAlienFianceChildren(String immigrantId){
        return true;
    }


}