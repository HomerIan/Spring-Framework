package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.BlockSection;

public class BlockSectionDA {
	
	static ArrayList<BlockSection> blockSectionList;
	public BlockSectionDA() throws FileNotFoundException {
		
		Scanner blockSectionFile = new Scanner(new FileReader("../Aggregation-COMReportVer.2/src/Domain/blockSection.csv"));
		
		blockSectionList = new ArrayList<BlockSection>();
		
		while(blockSectionFile.hasNext()) {
			
			String rowBlockSection = new String();
			rowBlockSection = blockSectionFile.nextLine();
			
			String[] rowBlockSectionSpecific = new String[3];
			rowBlockSectionSpecific = rowBlockSection.split(",");
			
			BlockSection blockSection = new BlockSection();
			blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
			blockSection.setDescription(rowBlockSectionSpecific[1].trim());
			blockSection.setAdviser(rowBlockSectionSpecific[2].trim());
			
			StudentDA studenDA = new StudentDA(rowBlockSectionSpecific[0].trim());
			blockSection.setStudentList(StudentDA.getStudentList());
			blockSection.setTotalStudents(StudentDA.getTotalNumberOfStudent());
			blockSectionList.add(blockSection);
			
			for (BlockSection BlockSection : blockSectionList) {
				System.out.println(BlockSection);
			}
		}
	}
}
