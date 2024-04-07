import com.Workflow;
import org.junit.jupiter.api.Test;

import com.Immigration;

import com.FormData;

import java.io.File;
import java.util.LinkedList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {



    @Test
    void TestNewWFCount () {

        Immigration wfobj = new Immigration();
        int totalwf = wfobj.CountWFItems("null");
        assertEquals(totalwf, 0);

    }


    /*
    testing add dependent by adding one person
     */
    @Test
    void TestAddDependent(){

        LinkedList<FormData> dependentList = new LinkedList<>();

        Immigration addDepObj = new Immigration();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        int addDep = addDepObj.addDependent(person, dependentList);

        assertTrue(dependentList.size() == 1);
    }

    /*
    testing add dependent that fails by adding one person
     */
    @Test
    void TestAddDependentFail(){

        LinkedList<FormData> dependentList = new LinkedList<>();

        Immigration addDepObj = new Immigration();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        int addDep = addDepObj.addDependent(person, dependentList);

        assertTrue(dependentList.size() != 1);
    }

    /*
    testing remove dependent by adding one person
     */
    @Test
    void TestRemoveDependent(){

        LinkedList<FormData> dependentList = new LinkedList<>();
        FormData person = new FormData("Gus","10/24/2102","OakRoad531");
        dependentList.add(person);

        Immigration addDepObj = new Immigration();
        int addDep = addDepObj.addDependent(person, dependentList);

        assertTrue(dependentList.isEmpty());

    }

    /*
    testing remove dependent fails by adding one person
     */
    @Test
    void TestRemoveDependentFail(){

        LinkedList<FormData> dependentList = new LinkedList<>();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        dependentList.add(person);

        Immigration addDepObj = new Immigration();
        int addDep = addDepObj.addDependent(person, dependentList);

        assertTrue(dependentList.isEmpty());

    }


    /*
    Tests reviewData to ensure correct data retrieval from a file.
     */
    @Test
    void TestReviewData(){

        Immigration revObj = new Immigration();
        File file = null; //link up to file for real tester
        FormData revData = revObj.reviewData(file);

        assertEquals(revData.getName(), "jack");
        assertEquals(revData.getAddress(), "1092 oak tree road");
        assertEquals(revData.getDOB(), "10/20/2024");

    }


    /*
    Test approveData method to ensure correct handling of data approval.
     */
    @Test
    void TestApproveData(){
        Immigration appObj = new Immigration();
        FormData person =  new FormData(null,null,null);
        int data = appObj.approveData(person);
        assertEquals(data, 0);

    }

    /*
   Test approveData method to ensure correct handling of data approval.
    */
    @Test
    void TestApproveDataFail(){
        Immigration appObj = new Immigration();
        FormData person =  new FormData("jack",null,"5324 Ryan road");
        int data = appObj.approveData(person);
        assertEquals(data, 0);

    }


    /*
    Test validateForm method to ensure correct validation of FormData.
     */
    @Test
    void TestValidateForm(){
        Immigration valObj = new Immigration();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        int val = valObj.validateForm(person);
        assertEquals(val, 0);
    }

    /*
    Test requestAlienFianceChildren to validate that they have been requested
     */
    @Test
    void TestRequestAlienFianceChildren(){
        Immigration valObj = new Immigration();
        boolean request = valObj.requestAlienFianceChildren("1");
        assertTrue(request);
    }



    //workFLow/////////////////////////////////////////////////////////////////////////////

    /*
    Test updateDataEntry method to ensure correct update of FormData.
     */
    @Test
    void TestUpdateDataEntry(){
        Workflow valObj = new Workflow();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        FormData val = valObj.updateDataEntry(person, "ryan", null, null, 0);
        if(Objects.equals(val.getName(), "ryan")){
            assertTrue(true);
        }else{
            fail();
        }
    }



    /*
    Test updateReviewEntry method to review data
     */

    @Test
    void TestUpdateReviewEntry(){
        Workflow valObj = new Workflow();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        int val = valObj.updateReviewEntry(person);
        assertEquals(val, 0);
    }



     /*
    Test updateApprovalEntry method to review data
     */

    @Test
    void TestUpdateApprovalEntry(){
        Workflow valObj = new Workflow();
        FormData person = new FormData("Adam","10/24/2102","OakRoad531");
        String val = valObj.updateApprovalEntry(person);
        assertEquals(val, "approvedMessage");
    }



}
