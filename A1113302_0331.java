import java.util.*;

class animal {
    public String name;
    public double height;
    public int weight;
    public int speed;

    animal (String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("身高:" + height + "公尺");
        System.out.println("體重:" + weight + "公斤");
        System.out.println("速度:" + speed + "公尺/分鐘");
        System.out.println();
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
        System.out.println();
    } 
}

class human extends animal {
    public String sex;
 
    human(String name, double height, int weight, int speed, String sex) {
        super(name, height, weight, speed);
        this.sex = sex;
    }

    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("身高:" + height + "公尺");
        System.out.println("體重:" + weight + "公斤");
        System.out.println("速度:" + speed + "公尺/分鐘");
        System.out.println("性別:" + sex);
        System.out.println();
    }  
}

class snow extends human {
    public String frozenSkill;
    
    snow(String name, double height, int weight, int speed, String sex, String frozenSkill) {
        super(name, height, weight, speed, sex);
        this.frozenSkill = frozenSkill; 
    }

    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("身高:" + height + "公尺");
        System.out.println("體重:" + weight + "公斤");
        System.out.println("速度:" + speed + "公尺/分鐘");
        System.out.println("性別:" + sex);
        System.out.println("冰凍技能:" + frozenSkill);
        System.out.println();
    }

    public double distance(int x, double y) {
        return 2 * x * y * speed;
    }

    public double distance(int x) {
        return 2 * x * speed;
    } 
}
    
public class A1113302_0331 {
    public static void main(String[] argv) {
        animal.showinfo();

        animal[] roleAnimal = new animal[2];
        roleAnimal[0] = new animal("雪寶", 1.1, 52, 100);
        roleAnimal[1] = new animal("驢子", 1.5, 99, 200);

        human[] roleHuman = new human[3];       
        roleHuman[0] = new human("阿克", 1.9, 80, 150, "男");
        roleHuman[1] = new human("漢斯", 1.8, 78, 130, "男");
        roleHuman[2]= new human("安那", 1.7, 48, 120, "女");

        snow roleSnow = new snow("愛沙", 1.7, 50, 120, "女", "YES");

        for(int i = 0 ; i < roleAnimal.length ; i++) {
            roleAnimal[i].show();
        }

        for(int i = 0 ; i < roleHuman.length ; i++) {
            roleHuman[i].show();
        }

        roleSnow.show();

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < roleAnimal.length ; i++) {
            System.out.println("請輸入" + roleAnimal[i].name + "的奔跑時間(分鐘):");
            int x = sc.nextInt();
            System.out.println("請輸入" + roleAnimal[i].name + "的加速度(若無請輸入0):");
            double y = sc.nextDouble();

            double distance;
            if(y == 0) {
                distance = roleAnimal[i].distance(x);
            } else {
                distance = roleAnimal[i].distance(x,y);
            }
            System.out.println(roleAnimal[i].name + "奔跑的距離為" + distance +"公尺");
            System.out.println();
        }

        for(int i = 0; i < roleHuman.length ; i++) {
            System.out.println("請輸入" + roleHuman[i].name + "的時間(分鐘):");
            int x = sc.nextInt();
            System.out.println("請輸入" + roleHuman[i].name + "的加速度(若無請輸入0):");
            double y = sc.nextDouble();

            double distance;
            if(y == 0) {
                distance = roleHuman[i].distance(x);
            } else {
                distance = roleHuman[i].distance(x,y);
            }
            System.out.println(roleHuman[i].name + "奔跑的距離為" + distance +"公尺");
            System.out.println();
        }

        System.out.println("請輸入" + roleSnow.name + "的時間x(分鐘):");
        int x = sc.nextInt();
        System.out.println("請輸入" + roleSnow.name + "的加速度y(若無請輸入0):");
        double y = sc.nextDouble();

        double distance;
        if(y == 0) {
            distance = roleSnow.distance(x);
        } else {
            distance = roleSnow.distance(x,y);
        }
        System.out.println(roleSnow.name + "奔跑的距離為" + distance +"公尺");
        System.out.println();
    }
}