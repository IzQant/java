package 시월오일;
import java.util.Scanner;

public class rpg {
	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money, deca;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("영웅의 이름을 입력하세요. :");
		hero_name = in.nextLine();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");

		hero_level = 1;
		hero_power = 15;
		hero_defense = 25;
		hero_hp = 80;
		hero_mp = 0;
		hero_experience = 0;
		hero_money = 0;

		information();

		while (true) {
			if (hero_level < 2) {
				System.out.println("1. 사냥터");
				System.out.print("입장할 장소를 선택하세요 :");
				int y = in.nextInt();
				if (y == 1)
					monsterhouse();
			} else {
				System.out.println("1. 사냥터");
				System.out.println("2. 상점");
				System.out.print("입장할 장소를 선택하세요 :");
				int y = in.nextInt();
				if (y == 1)
					monsterhouse();
				else if (y == 2)
					store();
			}

			while (monster_hp > 0) {
				int damageDealt = hero_attack();
				monster_attacked(damageDealt);
				if (monster_hp <= 0)
					break;
				int damagedealt = monster_attack();
				hero_attacked(damagedealt);
				if (deca == 3)
					System.out.println("기회를 모두 소모했습니다. 탈출의 노래를 부릅니다.");
				break;
			}
		}

	}

	static void information() {
		System.out.println("*********************");
		System.out.printf("현재 %s의 이름 : %s\n", hero_name, hero_name);
		System.out.printf("현재 %s의 레벨 : %d\n", hero_name, hero_level);
		System.out.printf("현재 %s의 힘 : %d\n", hero_name, hero_power);
		System.out.printf("현재 %s의 방어력 : %d\n", hero_name, hero_defense);
		System.out.printf("현재 %s의 HP : %d\n", hero_name, hero_hp);
		System.out.printf("현재 %s의 MP : %d\n", hero_name, hero_mp);
		System.out.printf("현재 %s의 경험치 : %d\n", hero_name, hero_experience);
		System.out.printf("현재 %s의 돈 : %d\n", hero_name, hero_money);
		System.out.println("*********************");
	}

	static void monsterhouse() {
		System.out.println("사냥터에 입장하였습니다.");
		if (hero_level < 2)
			System.out.println("1. 너구리");
		else {
			System.out.println("1. 너구리");
			System.out.println("2. 살쾡이");
		}
		System.out.print("전투할 상대를 입력하세요 :");
		int x = in.nextInt();
		if (x == 1) {
			monster_name = "너구리";
			monster_hp = 100;
			monster_mp = 0;
			monster_level = 1;
			monster_power = 20;
			monster_defense = 5;
			monster_money = 10;
			monster_experience = 10;
		}

		if (x == 2) {
			monster_name = "살쾡이";
			monster_hp = 2000;
			monster_mp = 0;
			monster_level = 5;
			monster_power = 100;
			monster_defense = 20;
			monster_money = 30;
			monster_experience = 50;
		}
		System.out.printf("%s와 전투를 시작합니다.\n", monster_name);

	}

	static void store() {
		System.out.println("상점에 입장하였습니다.");
		System.out.println("1. 힘 증강 포션 (30원)");
		System.out.println("2. 방어력 증강 포션 (30원)");
		System.out.println("3. 경험치 증강 포션 (100원)");
		System.out.println("4. HP 증강 포션 (10원)");
		System.out.println("5. MP 증강 포션 (10원)");
		System.out.print("원하시는 상품의 번호를 입력하세요. :");
		int n = in.nextInt();
		System.out.println("상점에서 상품을 구매하는 중입니다.");
		System.out.println("구입이 완료되었습니다.");

		if (n == 1) {
			hero_power += 3;
			hero_money -= 30;
			System.out.printf("%s의 힘이 %d이(가) 되었습니다.\n", hero_name, hero_power);
		} else if (n == 2) {
			hero_defense += 3;
			hero_money -= 30;
			System.out.printf("%s의 방어력이 %d이(가) 되었습니다.\n", hero_name, hero_defense);
		} else if (n == 3) {
			hero_experience += 50;
			hero_money -= 100;
			System.out.printf("%s의 경험치가 %d이(가) 되었습니다\n", hero_name, hero_experience);
		} else if (n == 4) {
			hero_hp += 50;
			hero_money -= 10;
			System.out.printf("%s의 HP가 %d이(가) 되었습니다.\n", hero_name, hero_hp);
		} else if (n == 5) {
			hero_mp += 50;
			hero_money -= 10;
			System.out.printf("%s의 MP가 %d이(가) 되었습니다.\n", hero_name, hero_mp);
		}
		System.out.printf("%d원 남았습니다.\n", hero_money);
		information();

	}

	static int hero_attack() {
		System.out.printf("%s의 공격입니다\n", hero_name);
		int damage = 0;
		if (hero_name.equals("김형균")) {
			System.out.println("1. 신의 권능");
			System.out.print("공격 번호를 입력하세요 :");
			int c = in.nextInt();
			if (c == 1) {
				damage = hero_level * 1000 + hero_power * 3000;
			}

		} else {
			System.out.println("1. 쓰러스트");
			System.out.print("공격 번호를 입력하세요 :");
			int c = in.nextInt();
			if (c == 1) {
				damage = hero_level * 10 + hero_power * 30;
			}
		}
		return damage;
	}

	static void hero_attacked(int damagebymonster) {
		System.out.printf("%s이(가) 받은 데미지는 %d입니다.\n", hero_name, damagebymonster);
		if (hero_defense < damagebymonster) {
			hero_hp = hero_hp - damagebymonster;
			if (hero_hp <= 0) {
				hero_hp = 1;
				System.out.printf("영융은 죽지 않아요. 화려하게 부활했습니다.\n");
				deca += 1;
			}
		}
	}

	static int monster_attack() {
		System.out.printf("%s의 공격입니다.\n", monster_name);
		int damagebymonster = 0;
		damagebymonster = monster_power;
		return damagebymonster;
	}

	static void monster_attacked(int damage) {
		System.out.printf("%s이(가) 받은 데미지는 %d입니다.\n", monster_name, damage);
		if (monster_defense < damage) {
			monster_hp = monster_hp + monster_defense - damage;
			if (monster_hp <= 0) {
				System.out.printf("%s이(가) 죽었습니다.\n", monster_name);
				hero_experience += monster_experience;
				hero_money += monster_money;
				hero_levelup();
			}

		}
	}

	static void hero_levelup() {
		if (hero_experience >= hero_level * 80) {
			hero_level += 1;
			hero_money += hero_level * 50;
			System.out.printf("%s의 레벨이 %d가 되었습니다.\n", hero_name, hero_level);
			System.out.printf("레벨업 기념으로 돈이 %d원 증가하여 %d원이 되었습니다.\n", hero_level * 50, hero_money);
			hero_experience = 0;
			information();
		}
	}

}
