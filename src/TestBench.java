import java.io.IOException;

import mongo.Connection;
import parse.CSVParser;
import read.ReadFile;
import errors.FieldException;

/**
 * Author: Sawan J. Kapai Harpalani
 * Email: sawankapai@gmail.com
 * File name: TestBench.java
 * Version: 1.0
 * Date: 03/12/2015
 * Description:
 * Copyright: Copyright 200X Sawan J. Kapai Harpalani
 *			 
 *			 This file is part of Math Attack.
 *
 *			 MicroBlogging is free software: you can redistribute it 
 *			 and/or modify it under the terms of the GNU General	
 *   		 Public License as published by the Free Software 
 *		     Foundation, either version 3 of the License,
 *			 or (at your option) any later version.
 *
 *
 *			 MicroBlogging is distributed in the hope that it will 
 *			 be useful, but WITHOUT ANY WARRANTY; without even 
 *			 the implied warranty of MERCHANTABILITY or FITNESS
 *			 FOR A PARTICULAR PURPOSE. See the GNU General Public
 *			 License for more details.
 *			
 *			 You should have received a copy of the GNU General
 *			 Public License along with MicroBlogging. If not, see
 *			 http://www.gnu.org/licenses/.
 */

/**
 * @author Sawan J. Kapai Harpalani
 *
 */
public class TestBench {
	
	public static void main(String[] args) throws IOException, FieldException {
		ReadFile readFile = new ReadFile("data/microblogDataset_COMP6235_CW2.csv");
		//ReadFile readFile = new ReadFile("data/test.csv");
		readFile.extractContent();
		
		Connection connection = Connection.getInstance();
		CSVParser.parse(readFile.getContent(), connection);
		System.out.println("Success");
	}
}