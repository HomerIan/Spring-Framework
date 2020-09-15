package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import Domain.BlockSection;
public class BlockSectionDA {
	//constructor
	public BlockSectionDA() throws FileNotFoundException {
		Scanner blockSectionFile = new Scanner(new FileReader("../OOP/src/Domain/blockSectionInfo.csv"));
		
		//calling BlockSection Domain object
		BlockSection BlockSection = new BlockSection();
		
		//read input file
		String rowBlockSection = new String();
		rowBlockSection = blockSectionFile.nextLine();
		
		//split the data
		String[] rowBlockSectionSpecific = new String[3];
		rowBlockSectionSpecific = rowBlockSection.split(",");
		
		//put data in BlockSection Object
		BlockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
		BlockSection.setDescription(rowBlockSectionSpecific[1].trim());
		BlockSection.setAdviser(rowBlockSectionSpecific[2].trim());
		
		
		//test
		System.out.println(BlockSection.getBlockCode());
		System.out.println(BlockSection.getDescription());
		System.out.println(BlockSection.getAdviser());
		
		//fetching data from Student objects
		StudentDA StudentDA = new StudentDA();
	}
}
