package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.BlockSection;

public class BlockSectionDA {
	static ArrayList<BlockSection> blockSectionList;

	// constructor
	public BlockSectionDA() throws FileNotFoundException {
		Scanner blockSectionFile = new Scanner(new FileReader("../OOP2/src/Domain/blockSection.csv"));

		while (blockSectionFile.hasNext()) {
			blockSectionList = new ArrayList<BlockSection>();
			// calling BlockSection Domain object
			BlockSection blockSection = new BlockSection();
			// read input file
			String rowBlockSection = new String();
			rowBlockSection = blockSectionFile.nextLine();

			// split data
			String[] rowBlockSectionSpecific = new String[3];
			rowBlockSectionSpecific = rowBlockSection.split(",");

			// put data in BlockSection Object
			blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
			blockSection.setDescription(rowBlockSectionSpecific[1].trim());
			blockSection.setAdviser(rowBlockSectionSpecific[2].trim());
			// fetching data from Student objects
			StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
			blockSection.setTotalStudents(StudentDA.getTotalNumberOfStudent());
			blockSection.setStudentList(StudentDA.getStudentList());
			blockSectionList.add(blockSection);

			for (BlockSection BlockSection : blockSectionList) {
				System.out.println(BlockSection);
			}

		} // end loop

	}
}
