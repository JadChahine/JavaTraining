package com.training.misc;

/*
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;*/


/**
 * Camera Importer.
 */
public class App 
{


	/*public static void main(String[] args ) throws IOException {

			App.CSV_SEPARATOR = ",";

		// Read all CSV files
		String[][] file1 = null;
		try {
			file1 = readFile("src/main/resources/" + "cameras" + "." + "csv");
		} catch(Exception e) {
			System.err.print("Unable to read file1: cameras.csv");
		}

		updateCameraCount(file1);

		// Create the json result string
		String json = makeJSON(file1);

		try {
				System.out.println(json);
				ObjectMapper mapper = new ObjectMapper();
				Object jsonObj = mapper.readValue(json, Object.class);
				// Save the json string to a file
				String indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObj);
				System.out.println(indented);
				saveFile(indented);
		} catch(Exception e) {
			System.err.print(e.getMessage());
		}
    }

	public static String CSV_SEPARATOR = null;

	public static Map<String, Integer> cameraCount = new HashMap<>();

	//Count camera by site.
	public static void updateCameraCount(String[][] file1) {
	    for(String[] cam : file1) {
		    if(cam != null && cam.length > 0){
			    String siteName = cam[3];
			    if(!cameraCount.containsKey(siteName)) {
				    cameraCount.put(siteName, 0);
			    }
			    cameraCount.put(siteName, cameraCount.get(siteName) + 1);
		    }
	    }
    }

	 //Read a file CSV.
	public static String[][] readFile(String url) throws IOException {
		//read file
        FileInputStream fis = new FileInputStream(url);
        String buffer = "";
        while(fis.available()>0){
            buffer += new String(new byte[]{(byte)fis.read()});
        }
        System.out.println("File read "+url);

		//split to csv
		String[] lines = buffer.split(System.getProperties().getProperty("line.separator"));
		String[][] r = new String[1024][];
		int index = 0;
		do{
			r[index] = lines[index].split(CSV_SEPARATOR);
			index = index+1;
		}while(index<lines.length-1);

		return r;
    }

    public static void saveFile(String jsonFile) {
	    try {
		    FileUtils.writeStringToFile(new File("target/cameras.json"), jsonFile);
	    } catch (IOException e) {
		    e.printStackTrace();
	    }
    }

	//Sorting by site.
	public static String[][] sortBySite(String[][] file1) {
		Arrays.asList(file1).subList(1, file1.length).sort(new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				if(s1 == null || s1.length < 4) {
					return -1;
				}
				if(s2 == null || s2.length < 4) {
					return 1;
				}

				return s1[3].compareTo(s2[3]);
			}
		});
		return file1;
    }

	//Make a json from a CSV file.
	public static String makeJSON(String[][] file1) {
		String buffer = "{ \"cameras\":[";
		boolean first = true;
		for(Object[] cam : sortBySite(file1)){
			if(cam==null){
				continue;
			}
			if(first){
				// We skip the header of CSV files
				first=false;
			}else{
				buffer += "{";
				buffer += "\"name\":\""+cam[0]+"\",";//name of camera
				buffer += "\"serial\":\""+cam[1]+"\",";//serial of camera
				buffer += "\"firmware-version\":\""+cam[2]+"\",";//firmware of camera
				String site = getSite(cam[3].toString());
				buffer += "\"site\":"+site;//site of camera
				buffer += "},";
			}
		}
		buffer = buffer.substring(0, buffer.length()-1);//remove last comma
		buffer += "]}";

		return new StringBuffer(buffer).toString(); // Improve performance by using a buffer
	}

	//Get the right site from the sites.csv file.
	public static String getSite(final String siteName){
		try {
			String[] site = Arrays.stream(readFile("src/main/resources/" + "sites" + "." + "csv"))
					.filter(l -> l!=null)
					.filter(l -> l[1]!=null)
					.filter(l -> l[1].trim().equals(siteName.trim()))
					.findAny()
						.orElseGet(() -> new String[5]);
			return "{ \"name\":\"" + site[1] + "\","
					+ "\"city\":\"" + site[2] + "\","
					+ "\"npa\":\"" + site[3] + "\","
					+ "\"camera-count\":\"" + cameraCount.get(site[1]) + "\"}";
		} catch(Exception e) {
			System.err.print("" + e.getMessage());
			return new String(" null");
		}
	}*/
}
