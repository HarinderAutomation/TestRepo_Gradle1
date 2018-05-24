package mytest;


import org.junit.experimental.runners.Enclosed;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import haripackage.LibraryTest;

@RunWith(Enclosed.class)
@SuiteClasses({LibraryTest.class,Hari.class})
public class TestRunner {
	/* public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(Hari.class, LibraryTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result=="+result.wasSuccessful());
	   }*/
	}
