package com.appsflyer.adobeair.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.appsflyer.AppsFlyerLib;

@Deprecated
public class SetSharingFilterForAllPartners implements FREFunction {

    @Override
    public FREObject call(FREContext freContext, FREObject[] freObjects) {

        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();

        return null;
    }

}
