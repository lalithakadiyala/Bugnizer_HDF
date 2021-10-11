package myListener;
   import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class Listener  implements ITestListener{
		
		public void onTestStart(ITestResult Result) {
			System.out.println("Group2 test is passes" +Result); 
			
		}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Group2 test is success" +Result);
	}
		
		public void onTestFailure(ITestResult Result) {
			System.out.println("Group2 test is Failed: " +Result);
		}
		
		public void onTestSkipped(ITestResult Result) {
			System.out.println("Group3 test is Skipped: "  +Result);
		}
		
			
			
}
