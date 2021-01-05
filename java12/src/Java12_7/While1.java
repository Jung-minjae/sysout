package Java12_7;
import java.util.Random;
import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean start_Game = true; // 게임진행 여부
		Random rdm = new Random(); // math.random 이 아닌 java.util 에 있는 random 함수 사용
		while (start_Game) { // 게임진행 루프

			boolean character_set = true; // 플레이어 생성 진행 여뷰
			int character_set_flag = 0; // 플레이어 생성 진행 flag
			boolean tour = true; // 휴식 여부
			int tour_flag = 0;
			boolean monster_battle = true; // 전투 진행 여부
			int monster_battle_flag = 0; // 전투 진행 flag

			/* 게임 설정 주사위 */
			int dice_encounter = 7; // 몬스터 조우 확률 주사위
			int dice_kind = 4; // 몬스터 종류 주사위
			int hitrating_dice = 10;

			/* 플레이어 설정 초기화 */
			String p_name = ""; // 플레이어 이름
			int p_job = 0; // 플레이어 직업
			int p_level = 1; // 플레이어 레벨
			int p_hp = 0; // 플레이어 체력
			int p_hp_p = p_hp;  //휴식후 hp회복용
			int p_weapon = 0; // 플레이어 무기
			String weapon_name = ""; // 플레이어 무기이름
			int weapon_dice = 0; // 플레이어 공격력 주사위
			int p_attk = 0; // 플레이어의 공격력
			int p_str = 0; // 플레이어의 힘
			int p_dex = 0; // 플레이어의 민첩성

			/* 몬스터 능력치 초기화 */
			String monster_name = ""; // 몬스터 이름
			int monster_HP = 0; // 몬스터 체력
			int monster_weapon = 0; // 몬스터 무기
			String m_weapon_name = ""; // 몬스터 무기명
			int m_weapon_dice = 0; // 몬스터 공격력 주사위
			int monster_attk = 0; // 몬스터 공격력
			int monster_str = 0; // 몬스터 힘
			int monster_dex = 0; // 몬스터 민첩성
			int monster_level = 0; // 몬스터 레벨
			
//			Scanner sc = new Scanner(System.in); // 플레이어 생성용 스캐너 호출
//			System.out.println("당신의 이름을 입력하세요.");
//			p_name = sc.nextLine();
//			System.out.println();
			/* 플레이어 생성 루프 시작 */
			while (character_set) {
				/* 플레이어 능력치 설정 */
				Scanner sc = new Scanner(System.in); // 플레이어 생성용 스캐너 호출

				System.out.println("당신의 이름을 입력하세요.");
				p_name = sc.nextLine();
				System.out.println("---------------------------------------------");
				System.out.println(p_name + " 님 직업을 선택해주세요.");
				System.out.println("1. 전사		2. 마법사		3. 사냥꾼");
				p_job = sc.nextInt();

				System.out.println("---------------------------------------------");
				System.out.println("무기를 선택해주세요.");
				System.out.println("---------------------------------------------");
				switch (p_job) {
				case 1: // 전사 선택
					p_hp = 200;
					p_str = 20;
					p_dex = 10;
					System.out.println("전사는 다음 무기를 선택할 수 있습니다.");
					System.out.println("1. Sword  2. Bastard Sword");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Sword";
						weapon_dice = 8;
					} else if (p_weapon == 2) {
						weapon_name = "Bastard Sword";
						weapon_dice = 10;
						p_dex = p_dex - 2; // 무게로 인한 민첩성 저하
					}
					break;

				case 2: // 마법사 선택
					p_hp = 100;
					p_str = 8;
					p_dex = 9;
					System.out.println("마법사는 다음 무기를 선택할 수 있습니다.");
					System.out.println("1. Staff    2. Magic Mace");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Staff";
						weapon_dice = 4;
					} else if (p_weapon == 2) {
						weapon_name = "Magic Mace";
						weapon_dice = 6;
						p_dex = p_dex - 1; // 무게로 인한 민첩성 저하
					}
					break;

				case 3: // 사냥꾼 선택
					p_hp = 150;
					p_str = 14;
					p_dex = 20;
					System.out.println("사냥꾼은 다음 무기를 선택할 수 있습니다.");
					System.out.println("1. Long Bow    2. Bolt");
					p_weapon = sc.nextInt();
					if (p_weapon == 1) {
						weapon_name = "Long Bow";
						weapon_dice = 6;
					} else if (p_weapon == 2) {
						weapon_name = "Bolt";
						weapon_dice = 8;
						p_dex = p_dex - 2; // 무게로 인한 민첩성 저하
					}
					break;
				}

//				System.out.println(p_hp);
//				System.out.println(p_str);
//				System.out.println(p_dex);
				System.out.println("-------------------------------------------------------");
				System.out.printf("* " + weapon_name + " * 을/를 선택하셨습니다. 공격 시 " + weapon_dice + " 면체 주사위를 굴립니다. \n ");
				System.out.println("-------------------------------------------------------");
				System.out.println("마지막으로 " + p_name + " 님의 능력치를 정하겠습니다.");
				System.out.println("10면체 주사위 두개를 굴립니다. 두개의 합에 따라 능력이 정해집니다.");
				System.out.println("-------------------------------------------------------");

				int dice_10_1 = rdm.nextInt(10);
				int dice_10_2 = rdm.nextInt(10);
				int dice_10_sum = dice_10_1 + dice_10_2;

				System.out.println("첫번째 주사위는 " + dice_10_1);
				System.out.println("두번째 주사위는 " + dice_10_2);

				if (dice_10_sum >= 15) {
					// 각 직업 기본 능력치 그대로
				} else if (dice_10_sum >=8 && dice_10_sum < 15) { // 능력치 10% 저하
					p_hp = p_hp - ((p_hp * 10) / 100);
					p_str = p_str - ((p_str * 10) / 100);
					p_dex = p_dex - ((p_dex * 10) / 100);
				} else if (dice_10_sum < 8 ) { // 능력치 20% 저하
					p_hp = p_hp - ((p_hp * 20) / 100);
					p_str = p_str - ((p_str * 20) / 100);
					p_dex = p_dex - ((p_dex * 20) / 100);
				}
				
				System.out.println("-------------------------------------------------------");
				System.out.printf(p_name + " 님 당신의 능력치 입니다. \n" + "체력 : " + p_hp + " \n" + "힘 : " + p_str + " \n"
						+ "민첩 : " + p_dex + " \n" + "무기 :" + weapon_name + " \n");
				System.out.println("-------------------------------------------------------");
				System.out.println(p_name + " 님 이대로 진행하시겠습니까? (1. YES   2. NO)");
				System.out.println("-------------------------------------------------------");

				character_set_flag = sc.nextInt();
				switch (character_set_flag) {
				case 1:
					character_set = false;
					break;

				case 2:
					character_set = true;
					System.out.println("---------------------------------------------");
					break;
				}
			}
			/* 플레이어 생성 루프 종료 */

			/* 몬스터 와의 전투 루프 시작 */
			while (tour) {
				Scanner sm = new Scanner(System.in); // 몬스터 전투 시 새로운 스캐너 호출
				int monster_encounter = 0; // 몬스터와 조우
				int monster_kind = 0; // 몬스터의 종
				if(p_hp<((p_hp*50)/100)) {
					System.out.println("체력이 너무 낮습니다. 휴식을 권합니다.");
				}

				System.out.printf(
						p_name + " 님은 모험의 여행을 떠났습니다. \n" + " 1 을 선택하시면, 계속 앞으로 나아갑니다." + " 2 를 선택하시면, 휴식을 취합니다.");

				tour_flag = sm.nextInt();
				

				switch (tour_flag) {
				case 1:
					System.out.println("----------------------------------------------------------");
					System.out.println(p_name + " 님 기척이 느껴집니다. (주사위를 굴립니다.)");
					monster_encounter = rdm.nextInt(dice_encounter); // 주사위를 굴려 몬스터 조우 확률을 정함
					System.out.println(monster_encounter + "  나왔습니다.");
					if (monster_encounter > 4) {
						System.out.println("-----------------------------------------------------");
						System.out.println("아무 것도 없습니다. 계속 여행을 떠납니다.");
					} else if (monster_encounter <= 4) {
						System.out.println("-----------------------------------------------------");
						System.out.printf("몬스터가 있는 것 같습니다. \n" 
										+ "주사위를 굴립니다. \n");

						monster_kind = rdm.nextInt(dice_kind); // 주사위를 굴려 몬스터 종류를 정

						/* 몬스터 종류 설정 */
						switch (monster_kind) {
						case 1:
							monster_name = "Kobold"; // 몬스터 이름
							monster_HP = 100; // 몬스터 체력
							m_weapon_name = "Dangger"; // 몬스터 무기명
							m_weapon_dice = 4; // 몬스터 공격력 주사위
							monster_str = 10; // 몬스터 힘
							monster_dex = 8; // 몬스터 민첩성
							monster_level = 1; // 몬스터 레벨
							break;

						case 2:
							monster_name = "Ork"; // 몬스터 이름
							monster_HP = 150; // 몬스터 체력
							m_weapon_name = "Stick"; // 몬스터 무기명
							m_weapon_dice = 6; // 몬스터 공격력 주사위
							monster_str = 14; // 몬스터 힘
							monster_dex = 7; // 몬스터 민첩성
							monster_level = 2; // 몬스터 레벨
							break;
							
						case 3:
							monster_name = "Ork leader"; // 몬스터 이름
							monster_HP = 200; // 몬스터 체력
							m_weapon_name = "Mace"; // 몬스터 무기명
							m_weapon_dice = 8; // 몬스터 공격력 주사위
							monster_str = 15; // 몬스터 힘
							monster_dex = 9; // 몬스터 민첩성
							monster_level = 3; // 몬스터 레벨
							break;
							
						case 4:
							monster_name = "Ogre"; // 몬스터 이름
							monster_HP = 300; // 몬스터 체력
							m_weapon_name = "Stick"; // 몬스터 무기명
							m_weapon_dice = 6; // 몬스터 공격력 주사위
							monster_str = 18; // 몬스터 힘
							monster_dex = 10; // 몬스터 민첩성
							monster_level = 4; // 몬스터 레벨
							break;
							
						case 5:
							monster_name = "Fallen knight"; // 몬스터 이름
							monster_HP = 200; // 몬스터 체력
							m_weapon_name = "Bastard Sword"; // 몬스터 무기명
							m_weapon_dice = 8; // 몬스터 공격력 주사위
							monster_str = 18; // 몬스터 힘
							monster_dex = 12; // 몬스터 민첩성
							monster_level = 5; // 몬스터 레벨
							break;
							
						}
						
						System.out.println("-----------------------------------------------------");
						System.out.println(m_weapon_name + " 으로 무장한  " + monster_name + "입니다.");
//						System.out.println(monster_HP);
//						System.out.println(m_weapon_dice);
//						System.out.println(monster_str); 
//						System.out.println(monster_dex);
//						System.out.println(monster_level);
						monster_battle = true;
						while(monster_battle) {
							int hitrating = rdm.nextInt(hitrating_dice);
							System.out.println(hitrating);
							if(hitrating>5) {
								
							
							p_attk = rdm.nextInt(weapon_dice)+p_str;
							System.out.println(p_name+"님이"+ monster_name +"에게 "+p_attk+"데미지를 주었습니다.");
							monster_HP = monster_HP-p_attk;
//							System.out.println("다시 공격하시겠습니까");
//							System.out.println("1.Yes 2.No");
//							int a = sm.nextInt();
//							if(a==1) {
//								
//							}
							if(monster_HP <= 0) {
								System.out.println("몬스터를 물리쳤습니다.");
								monster_battle = false;
								
							}
							
						}
							else if(hitrating <=5) {
								monster_attk = rdm.nextInt(m_weapon_dice)+monster_str;
								System.out.println(monster_name + "가" + p_name + " 에게"+ monster_attk+" 데미지를 주었습니다");
								p_hp = p_hp-monster_attk;
								if(p_hp<=0) {
									System.out.println("당신은 사망하였습니다.");
									monster_battle=false;
									System.out.println("게임이 끝났습니다");
									break;
								
							}
							}
						}
					}
						
					
					
						

				case 2:
					System.out.printf(
							"--------------------------------------------- \n" + 
							"잠을 잡니다.  zzzzzzzzzzzzzzzzzzzzzzzzzzzzz\n"+"체력이 회복 되었습니다./n");
					
					p_hp = p_hp_p;
					
						System.out.println();
					break;
				}

			
		}
			
			
	}
	}
}


		
		

	