package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import Domain.BlockSection;

public class BlockSectionDA {
	
	public BlockSectionDA() throws FileNotFoundException {
		Scanner blockSectionFile = new Scanner(new FileReader("../Aggregation-COMReport/src/Domain/blockSectionInfo.csv"));
		
		BlockSection blockSection = new BlockSection();
		
		String rowBlockSection = new String();
		rowBlockSection = blockSectionFile.nextLine();
		
		String[] rowBlockSectionSpecific = new String[3];
		rowBlockSectionSpecific = rowBlockSection.split(",");
		
		blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
		blockSection.setDescription(rowBlockSectionSpecific[1].trim());
		blockSection.setAdviser(rowBlockSectionSpecific[2].trim());
		
		//fetching data from Student objects
		StudentDA studentDA = new StudentDA();
		
		blockSection.setStudentList(StudentDA.getStudentList());
		
		System.out.println(blockSection);
	}
}
