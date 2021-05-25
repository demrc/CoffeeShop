package MernisApp;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisApp {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		//gonna implement kpssoapproxy
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("8986523"),"SDGSD","QWEQW",1900);
		
		System.out.println("Doðrulama"+ (result ? "Baþarýlý" : "Baþarýsýz") );
	}

}
