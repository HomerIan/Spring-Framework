package UI;

import java.io.FileNotFoundException;

import TechServ.BlockSectionDA;

public class COMReport {
	//constructor
	public COMReport() throws FileNotFoundException {
		BlockSectionDA  BlockSectionDA = new BlockSectionDA();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		new COMReport();//call
	}
}
