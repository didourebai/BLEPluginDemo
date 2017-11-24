package md5b7e30128ed87a33f83469becf7b7eef6;


public class Adapter_Api21BleScanCallback
	extends android.bluetooth.le.ScanCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScanFailed:(I)V:GetOnScanFailed_IHandler\n" +
			"n_onScanResult:(ILandroid/bluetooth/le/ScanResult;)V:GetOnScanResult_ILandroid_bluetooth_le_ScanResult_Handler\n" +
			"";
		mono.android.Runtime.register ("Plugin.BLE.Android.Adapter+Api21BleScanCallback, Plugin.BLE, Version=1.3.0.0, Culture=neutral, PublicKeyToken=null", Adapter_Api21BleScanCallback.class, __md_methods);
	}


	public Adapter_Api21BleScanCallback ()
	{
		super ();
		if (getClass () == Adapter_Api21BleScanCallback.class)
			mono.android.TypeManager.Activate ("Plugin.BLE.Android.Adapter+Api21BleScanCallback, Plugin.BLE, Version=1.3.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onScanFailed (int p0)
	{
		n_onScanFailed (p0);
	}

	private native void n_onScanFailed (int p0);


	public void onScanResult (int p0, android.bluetooth.le.ScanResult p1)
	{
		n_onScanResult (p0, p1);
	}

	private native void n_onScanResult (int p0, android.bluetooth.le.ScanResult p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
