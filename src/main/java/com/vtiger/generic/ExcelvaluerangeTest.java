package com.vtiger.generic;

public class ExcelvaluerangeTest 
{
	public static void main(String[] args) throws Throwable 
	{
		
	ExcelUtility eut=new ExcelUtility();
	for(int i=0; i<=eut.getLastRow("Sheet1"); i++)
		
	{
		int n=eut.readNumericDatafromExcel("Sheet1", i, 1);
		
		if(n>=15000)
	   {
			String value=eut.readStrDatafromExcel("Sheet1", i, 0);
			System.out.println(value);
	   }
	}
}}
