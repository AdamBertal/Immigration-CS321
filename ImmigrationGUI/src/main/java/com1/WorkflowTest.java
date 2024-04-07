package com;

import com.FormData;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Workflow {


    String approvedMessage = "";



    /*
      Updates the data entry
     */
    public FormData updateDataEntry(FormData formData, String name, String DOB, String address, int greenCardNumber){

        return formData;
    }


    /*
      Updates the review entry
     */
    public int updateReviewEntry(FormData formData){


        return 1;
    }


    /*
      Updates the approval entry
     */
    public String updateApprovalEntry(FormData formData){


        return approvedMessage;
    }



}
