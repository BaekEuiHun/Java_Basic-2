package music;

public class music2 {
    public static void main(String[] args) {
        music1 music = new music1();


        music.isOn = true;

        System.out.println("음악이 켜졌습니다. ");

        up(music);
        up(music);
        down(music);

        if (music.isOn) {
            System.out.println("현재 볼륨은 " + music.volume + "입니다");
        } else {
            System.out.println("음악을 종료합니다!!");
        }
        music.isOn = false;
        System.out.println("음악을 종료합니다");
    }

    static void up(music1 music) {
        music.volume++;
        System.out.println("볼륨을 증가합니다");
    }

    static void down(music1 music) {
        music.volume--;
        System.out.println("볼륨을 감소합니다");
    }
}
