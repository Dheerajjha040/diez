
public class DafzaOperations implements ServicesInterface, ServiceSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServicesInterface si = new DafzaOperations();
		DafzaOperations DO = new DafzaOperations();
		si.cancelRequest();
		si.createRequest();
		DO.WithdrawlDAFZARequest();
		ServiceSteps ss = new DafzaOperations();
		ss.ApplicationReview();
		ss.UBOInitial();
		ss.SSDApproval();
		
		
	}

	@Override
	public void createRequest() {
		// TODO Auto-generated method stub
		
		System.out.println("Create dafza request");
		
	}
	
	public void WithdrawlDAFZARequest()
	{
		System.out.println("Withdraw dafza request");

	}


	@Override
	public void cancelRequest() {
		// TODO Auto-generated method stub
		
		System.out.println("Cancel dafza request");
	}

	@Override
	public void ApplicationReview() {
		// TODO Auto-generated method stub
		
		System.out.println("Complete Application Review");

	}

	@Override
	public void UBOInitial() {
		// TODO Auto-generated method stub
		System.out.println("Complete UBO Initaial");
	}

	@Override
	public void SSDApproval() {
		// TODO Auto-generated method stub
		System.out.println("Complete SSD Approval");

		
	}
	

}
