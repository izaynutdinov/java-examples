package net.iskandar.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.UUID;
import org.apache.logging.log4j.core.net.DatagramOutputStream;

public class UUIDUtil {

	public static String uuidToString(UUID uuid) {
		if (uuid == null)
			throw new IllegalArgumentException("uuid must not be null!");
		StringBuffer result = new StringBuffer();
		String[] parts = uuid.toString().split("-");
		for(String part : parts){
			result.append(part);
		}
		return result.toString();
	}

	public static void main(String[] args) throws IOException{
		HashSet<String> uuids = new HashSet<String>();
		File uuidsFile = getUUIDsFile();
		try {
			FileInputStream fis = new FileInputStream(uuidsFile);
			DataInputStream dis = new DataInputStream(fis);
			while(dis.available() > 0){
				String uuid = dis.readUTF();
				System.out.println("Loaded from uuids.dat: " + uuid);
				uuids.add(uuid);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		for (int i = 0; i < 1000; i++) {
			String uuid = uuidToString(UUID.randomUUID());
			if(uuids.contains(uuid))
				System.out.println("Non unique uuid! - " + uuid);
			uuids.add(uuid);
		}
		uuidsFile = getUUIDsFile();
		FileOutputStream fos = new FileOutputStream(uuidsFile);
		DataOutputStream dos = new DataOutputStream(fos);
		for (String uuid : uuids) {
			dos.writeUTF(uuid);
		}
	}

	private static File getUUIDsFile(){
		String userHome = System.getProperty("user.home");
		File userHomeDir = new File(userHome);
		File uuidsFile = new File(userHomeDir, "uuids.dat");
		return uuidsFile;
	}

}
