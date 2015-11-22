package com.pisual.witchatelier.start;

import com.pisual.liliaui.ui.LiliaUIStart;
import com.stargazer.witchatelier.summusdensitatesegmentation.SummusDensitateSegmentationService;
import com.stargazer.witchatelier.util.system.PropertiesUtil;

public class SummusDensitateSegmentationServiceStart {
	public static void main(String[] args) {
		LiliaUIStart liliaUIStart = new LiliaUIStart();
		SummusDensitateSegmentationService s = new SummusDensitateSegmentationService(10741);
		s.startMessageService();
	}
}
