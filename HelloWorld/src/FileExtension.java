public class FileExtension {
    public static void main(String[] args) {
        String archive = "credentials.officemax.v2.xml";

        System.out.println("Length: " + archive.length());

        String extension = archive.substring(archive.lastIndexOf(".") + 1);

        System.out.println("extension:" + extension);
    }
}