package com.idCarso.AR;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 * 
 * @author miguel
 * 
 */
public class Main {

	public static void main(String[] args) throws Exception {
		// load data
		Instances data = DataSource.read(args[0]);
		data.setClassIndex(data.numAttributes() - 1);

		// build associator
		Apriori apriori = new Apriori();
		apriori.setClassIndex(data.classIndex());
		apriori.buildAssociations(data);

		// output associator
		System.out.println(apriori);
	}

}
