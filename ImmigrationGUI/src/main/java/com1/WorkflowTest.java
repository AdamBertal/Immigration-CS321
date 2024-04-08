package com1;

import com1.FormDataTest;
//import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class WorkflowTest {


    String approvedMessage = "";



    /*
      Updates the data entry
     */
    public FormDataTest updateDataEntry(FormDataTest formData, String name, String DOB, String address, int greenCardNumber){

        return formData;
    }


    /*
      Updates the review entry
     */
    public int updateReviewEntry(FormDataTest formData){


        return 1;
    }


    /*
      Updates the approval entry
     */
    public String updateApprovalEntry(FormDataTest formData){


        return approvedMessage;
    }



}
