package example;

import com.mattamorphic.MavenAssembly;

class Main {
    public static void main(String[] args) {
        System.out.println("Running Example....");
        String data = MavenAssembly.printProp("name");
        System.out.println(data != null ? data : "No field called 'name'");
        System.out.println("Example Complete...");
    }
}