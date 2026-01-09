//package practiceQuestions;
//
//public class EncapsulationOnilneShopping {
//
//	static class Cart {
//		private int totalAmount;
//
//		public int getTotalAmount() {
//			return totalAmount;
//		}
//
//		public void addItem(int itemPrice) {
//			if (itemPrice <= 0) {
//				System.out.println("Invalid price");
//				return;
//			}
//			totalAmount += itemPrice;
//		}
//
//		public void removeItem(int itemPrice) {
//			if (itemPrice > totalAmount || itemPrice <= 0) {
//				System.out.println("Invalid amount, amount cannot be greater than total amount");
//				return;
//			}
//			totalAmount -= itemPrice;
//
//		}
//	}
//
//	public static void main(String[] args) {
//		Cart cart = new Cart();
//		cart.addItem(1500);
//		cart.removeItem(-3);
//		System.out.println(cart.getTotalAmount());
//	}
//
//}

//Battery

//package practiceQuestions;
//
//public class EncapsulationMobileBattery {
//
//	static class Battery {
//		private int batteryLevel;
//
//		public int getBatteryLevel() {
//			return batteryLevel;
//		}
//
//		public void useBattery(int units) {
//			if (units <= 0 || batteryLevel - units < 0) {
//				System.out.println("Battery is very Low");
//				return;
//			}
//			batteryLevel -= units;
//		}
//
//		public void chargeBattery(int units) {
//			if (units < 0 || batteryLevel + units > 100) {
//				System.out.println("Battery is beyond 100%, so you cannot charge!");
//				return;
//			}
//			batteryLevel += units;
//		}
//
//		public void setBatteryLevel(int batteryLevel) {
//			if (batteryLevel < 0 || batteryLevel > 100) {
//				System.out.println("Invalid Battery units");
//				return;
//			}
//			this.batteryLevel = batteryLevel;
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Battery battery = new Battery();
//		battery.setBatteryLevel(67);
//		System.out.println(battery.getBatteryLevel());
//		battery.chargeBattery(10);
//		System.out.println(battery.getBatteryLevel());
//		battery.useBattery(15);
//		System.out.println(battery.getBatteryLevel());
//
//	}
//
//}

//

