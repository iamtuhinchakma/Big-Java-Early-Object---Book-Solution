package FileHandling.e9;
//public class Java22_9 {
//    public static void main(String[] args) {
//        try{
//            int i = 0;
//            Scanner find = new Scanner(System.in);
//            String findWord = find.next();
//            File[] file = {new File("C:\\Users\\iyasi\\IdeaProjects\\Practice\\src\\input.txt"), new File("C:\\Users\\iyasi\\IdeaProjects\\Practice\\src\\input2.txt")};
//            PrintWriter out = new PrintWriter("C:\\Users\\iyasi\\IdeaProjects\\Practice\\output.txt");
//            Scanner in;
//            while(i < 2){
//                in = new Scanner(file[i]);
//                while(in.hasNextLine()){
//                    String x = in.nextLine();
//                    Scanner line = new Scanner(x);
//                    while (line.hasNext()){
//                        String temp = line.next();
//                        if(temp.equals(findWord)){
//                            out.println(file[i].getName() + " " + x);
//                        }
//                    }
//                }
//                i++;
//                in.close();
//            }
//            out.close();
//        }
//        catch (FileNotFoundException exception){
//
//        }
//    }
//}
