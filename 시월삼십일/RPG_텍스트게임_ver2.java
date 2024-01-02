package 시월삼십일;
import java.util.Scanner;

public class RPG_텍스트게임_ver2 {
	static Hero hero = new Hero();
	static Monster monster = new Monster();
	static PotionStore store = new PotionStore();
	static Scanner in = new Scanner(System.in);
	static String hero_name;

	public static void main(String[] args) {
		System.out.println("**********RPG GAME***********");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");
		System.out.print("직업의 번호를 입력하세요 :");
		int n = in.nextInt();
		in.nextLine();
		hero.Class(n);
		System.out.printf("%s이(가) 선택되었습니다.\n", hero.hero_class);
		System.out.print("영웅의 이름을 입력하세요. :");
		hero_name = in.nextLine();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		information();
		
		while (true) {
			if (hero.hero_level == 1) {
				System.out.println("사냥터에 입장하였습니다.");
				fight();
			}
			else {
				System.out.println("1. 사냥터");
				System.out.println("2. 상점");
				System.out.print("입장할 장소를 입력하세요 :");
				int x = in.nextInt();
				in.nextLine();
				if (x == 1)
					fight();
				else {
					store();
				}
				
			}

		}

	}
	
	static void information() {
		System.out.println("*********************");
		System.out.printf("현재 %s의 이름 : %s\n", hero_name, hero_name);
		System.out.printf("현재 %s의 레벨 : %d\n", hero_name, hero.hero_level);
		System.out.printf("현재 %s의 힘 : %d\n", hero_name, hero.hero_power);
		System.out.printf("현재 %s의 방어력 : %d\n", hero_name, hero.hero_defense);
		System.out.printf("현재 %s의 HP : %d\n", hero_name, hero.hero_hp);
		System.out.printf("현재 %s의 MP : %d\n", hero_name, hero.hero_mp);
		System.out.printf("현재 %s의 경험치 : %d\n", hero_name, hero.hero_experience);
		System.out.printf("현재 %s의 돈 : %d\n", hero_name, hero.hero_money);
		System.out.println("*********************");
	}
	
	static void levelup() {
		if (hero.hero_experience >= hero.hero_level * 80) {
			hero.hero_level += 1;
			hero.hero_money += hero.hero_level * 50;
			System.out.printf("%s의 레벨이 %d가 되었습니다.\n", hero_name, hero.hero_level);
			System.out.printf("레벨업 기념으로 돈이 %d원 증가하여 %d원이 되었습니다.\n", hero.hero_level * 50, hero.hero_money);
			hero.hero_experience = 0;
			information();
		}
	}
	
	static void store() {
		System.out.println("상점에 입장하였습니다.");
		System.out.println("1. 힘 증강 포션 (30원)");
		System.out.println("2. 방어력 증강 포션 (30원)");
		System.out.println("3. 경험치 증강 포션 (100원)");
		System.out.println("4. HP 증강 포션 (10원)");
		System.out.println("5. MP 증강 포션 (10원)");
		System.out.print("원하시는 상품의 번호를 입력하세요. :");
		int p = in.nextInt();
		store.store(p);
		if (hero.hero_money < store.smoney) {
			System.out.println(" 구매하실 수 없습니다.");
		} else {
			System.out.println("상점에서 상품을 구매하는 중입니다.");
			System.out.println("구입이 완료되었습니다.");
			System.out.printf("%s의 %s이(가) %d 증가하였습니다.\n", hero_name, store.pname, store.pnum);
			hero.hero_money -= store.smoney;
			System.out.printf("돈이 %d 남았습니다.\n", hero.hero_money);
			information();
		}
	}
	
	static void fight() {
		if (hero.hero_level == 1) {
			System.out.println("1. 너구리");
		} else if (hero.hero_level == 2) {
			System.out.println("1. 너구리");
			System.out.println("2. 살쾡이");
		} else if (hero.hero_level == 3) {
			System.out.println("1. 너구리");
			System.out.println("2. 살쾡이");
			System.out.println("3. 들개");
		} else if (hero.hero_level > 3) {
			System.out.println("1. 너구리");
			System.out.println("2. 살쾡이");
			System.out.println("3. 들개");
			System.out.println("4. 멧돼지");
		}
		System.out.print("전투할 상대를 입력하세요 :");
		int m = in.nextInt();
		in.nextLine();
		monster.Monsterclass(m);
		
		System.out.printf("%s와 전투를 시작합니다.\n", monster.monster_name);
		
		while (monster.monster_hp > 0) {
			System.out.printf("%s의 공격입니다.\n", hero_name);
			if (hero.hero_level == 1) {
				System.out.printf("1. %s\n", hero.hero_skill1);
			} else if (hero.hero_level == 2) {
				System.out.printf("1. %s\n", hero.hero_skill1);
				System.out.printf("2. %s\n", hero.hero_skill2);
			} else if (hero.hero_level >= 3) {
				System.out.printf("1. %s\n", hero.hero_skill1);
				System.out.printf("2. %s\n", hero.hero_skill2);
				System.out.printf("3. %s\n", hero.hero_skill3);
			}
			System.out.print("스킬 번호를 입력하세요 :");
			int snum = in.nextInt();
			in.nextLine();
			
			int mdamaged = hero.hero_level * 10 + hero.hero_power * 30;
			if (snum == 1) {
				if (monster.monster_name.equals("너구리") && hero.hero_class.equals("도적"))
					mdamaged += hero.hero_level * 6;
			}
			if (snum == 2) {
				mdamaged += hero.hero_level * 5;
				if (monster.monster_name.equals("살쾡이") && hero.hero_class.equals("마법사")) 
					mdamaged += hero.hero_level * 2;
			} else if (snum == 3) {
				mdamaged += hero.hero_level * 9;
				if (monster.monster_name.equals("멧돼지") && hero.hero_class.equals("전사"))
					mdamaged += hero.hero_level * 4;
			}
			System.out.printf("%s가 받은 데미지는 %d입니다.\n", monster.monster_name, mdamaged);
			if (monster.monster_defense >= mdamaged) {
				monster.monster_hp = monster.monster_hp;
			} else {
				monster.monster_hp = monster.monster_hp + monster.monster_defense - mdamaged;
			}
			if (monster.monster_hp <= 0)
				break;
			System.out.printf("%s의 공격입니다.\n", monster.monster_name);
			if (hero.hero_defense >= monster.monster_power) {
				hero.hero_hp = hero.hero_hp;
				System.out.printf("%s가 받은 데미지는 0입니다.\n", hero_name);
			} else {
				hero.hero_hp = hero.hero_hp + hero.hero_defense - monster.monster_power;
				System.out.printf("%s가 받은 데미지는 %d입니다.\n", hero_name, monster.monster_power);
			}
			if (hero.hero_hp <= 0) {
				hero.hero_hp = 1;
				System.out.println("부활하였습니다.");
			}
		}
		
		if (monster.monster_hp <= 0) {
			System.out.printf("%s가 죽었습니다.\n", monster.monster_name);
			hero.hero_experience += monster.monster_experience;
			hero.hero_money += monster.monster_money;
			if (hero.hero_experience >= hero.hero_level * 80)
				levelup();
			else
				information();
		}
	}

}

class Hero {
	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;
	static String hero_class, hero_skill1, hero_skill2, hero_skill3;
	
	int Class(int n) {
		if (n == 1) {
			hero_class = "전사"; hero_level = 1; hero_power = 15; hero_defense = 25; hero_hp = 80; hero_mp = 0;
			hero_skill1 = "돌진"; hero_skill2 = "베기"; hero_skill3 = "찌르기";
		} else if (n == 2) {
			hero_class = "마법사"; hero_level = 1; hero_power = 20; hero_defense = 12; hero_hp = 60; hero_mp = 60;
			hero_skill1 = "불"; hero_skill2 = "물"; hero_skill3 = "번개";
		} else if (n == 3) {
			hero_class = "도적"; hero_level = 1; hero_power = 21; hero_defense = 10; hero_hp = 40; hero_mp = 0;
			hero_skill1 = "암살"; hero_skill2 = "독"; hero_skill3 = "급습";
		}
		hero_experience = 0; hero_money = 0;
		return n;
	}
}


class Monster {
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String monster_name;
	
	void Monsterclass(int m) {
		if (m == 1) {
			monster_name = "너구리";
			monster_hp = 100; monster_mp = 0; monster_level = 1; monster_power = 20; monster_defense = 5; monster_money = 10; monster_experience = 10;
		} else if (m == 2) {
			monster_name = "살쾡이";
			monster_hp = 2000; monster_mp = 0; monster_level = 5; monster_power = 100; monster_defense = 20; monster_money = 30; monster_experience = 50;
		} else if (m == 3) {
			monster_name = "들개";
			monster_hp = 4000; monster_mp = 0; monster_level = 9; monster_power = 300; monster_defense = 60; monster_money = 100; monster_experience = 90;
		} else if (m > 3) {
			monster_name = "멧돼지";
			monster_hp = 8000; monster_mp = 0; monster_level = 15; monster_power = 800; monster_defense = 120; monster_money = 200; monster_experience = 120;
		}
	}	
}


class PotionStore{
	static Hero hero = new Hero();
	static int power, defense, experience, HP, MP, pnum, smoney;
	static String pname;
	
	void store(int p) {
		int power = 3, defense = 3, experience = 50, HP = 50, MP = 50;
		if (p == 1) {
			pnum = power; hero.hero_power += pnum;
			pname = "힘";
			smoney = 30;
		}
		if (p == 2) {
			pnum = defense; hero.hero_defense += pnum;
			pname = "방어력";
			smoney = 30;
		}
		if (p == 3) {
			pnum = experience; hero.hero_experience += pnum;
			pname = "경험치";
			smoney = 50;
		}
		if (p == 4) {
			pnum = HP; hero.hero_hp += HP;
			pname = "HP";
			smoney = 10;
		}
		if (p == 5) {
			pnum = MP; hero.hero_mp += MP;
			pname = "MP";
			smoney = 10;
		}
		
	}
}