import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

InputStream in1 =new URL("https://qag.crmnext.com/iosenterprise/Manifest/Apple_Enterprise_Files/manifest_6_18_0.plist").openStream();
Files.copy(in1, Paths.get("/Users/katalon/Documents/iOSCRMNExt.ipa"), StandardCopyOption.REPLACE_EXISTING);
