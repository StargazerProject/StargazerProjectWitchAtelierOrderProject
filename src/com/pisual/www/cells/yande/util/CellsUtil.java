package com.pisual.www.cells.yande.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.pisual.witchatelier.model.YandeCG;

public class CellsUtil {
	
	/**执行系统命令**/
	public static void systemCMD(String CMD)
	{
		Runtime run = Runtime.getRuntime(); 
		try {
			run.exec(CMD);
            System.out.println("指令执行完毕");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**计算文件下载进度**/
	public static String filePercent(float filesize,float downsize)
	{
		float percent = (downsize/filesize)*100;
		return percent+"%";
	}
	
	/**计算文件下载统计**/
	public String fileDownLoadSuccessPercent(List<YandeCG> yandeCGList)
	{
		float totalNum = yandeCGList.size();
		float downloadSuccessNum = 0f;
		for(int i=0;i<totalNum;i++)
		{
			if(yandeCGList.get(i).isDownComplete()==Boolean.TRUE)
			{
				++downloadSuccessNum;
			}
		}
		float result = (downloadSuccessNum/totalNum)*100;
		return result+"%";
	}
	
	/**计算文件下载进度 表示为图形**/
	public static int downLoadFileProgressBar(float oldDownLoadSize,float filesize,float downsize,int oldnum)
	{
		float newPercent = downsize/filesize;
		float oldPercent = oldDownLoadSize/filesize;
		int barNum = (int) ((newPercent-oldPercent)*10);
		if(barNum<0)
		{
			return 0;
		}
		if((barNum-oldnum)<0)
		{
			return 0;
		}
		int plusNum = (barNum-oldnum);
		for(int i=0;i<plusNum;i++)
		{
			System.out.print("#");			
		}
		return(barNum);
	}
}
