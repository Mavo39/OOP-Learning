package wallet;

import java.util.Arrays;

class Test {
    public static void main(String[] args){
        // Walletクラス確認
        System.out.println("Walletクラスの動作確認");
        testWallet();

        System.out.println();

        // Personクラス確認
        System.out.println("Personクラスの動作確認");
        testPerson();
    }

    public static void testWallet(){
        Wallet wallet = new Wallet(3,2,3,5,2,3);
        // Arrays.toStringメソッドを使って配列の中身を文字列として出力
        System.out.println("初期状態: " + Arrays.toString(wallet.getBillCounts()));
        System.out.println("総額: $" + wallet.getTotalMoney());
        System.out.println();

        System.out.println("100ドルを5枚、財布に追加");
        int added = wallet.insertBill(100, 3);
        System.out.println("追加した合計金額: $" + added);
        System.out.println("総額: $" + wallet.getTotalMoney());
        System.out.println();

        System.out.println("100ドルを3枚、財布から取る");
        int removed = wallet.removeBill(100, 3);
        System.out.println("取った合計金額: $" + removed);
        System.out.println("総額: $" + wallet.getTotalMoney());
        System.out.println();
        
        System.out.println("特殊なケースの確認");
        System.out.println("枚数が不足している場合: 5ドルを5枚削除");
        System.out.println("現状: " + Arrays.toString(wallet.getBillCounts()));
        int removed5 = wallet.removeBill(5, 5);
        System.out.println("取る予定の合計金額: $" + removed5);
        System.out.println("結果: " + Arrays.toString(wallet.getBillCounts()));
        System.out.println();

        System.out.println("存在しないお札を追加した場合: 500ドルを5枚追加");
        System.out.println("現状: " + Arrays.toString(wallet.getBillCounts()));
        int added500 = wallet.insertBill(500, 5);
        System.out.println("追加予定の合計金額: $" + added500);
        System.out.println("存在しないお金を追加しようとしているため計算されない");
        System.out.println("結果: " + Arrays.toString(wallet.getBillCounts()));
        System.out.println();        
    }

    public static void testPerson(){
        Person ma = new Person("M", "S", 30, 1.77, 65.0, 555);
        System.out.println("フルネーム: " + ma.getFullName());
        System.out.println("所持金: $" + ma.getCash());
        System.out.println();

        System.out.println("$389受け取り");
        int[] bills = ma.getPayed(389);
        System.out.println("$389の紙幣内訳: " + Arrays.toString(bills));
        System.out.println();
        
        System.out.println("$212支払い");
        bills = ma.spendMoney(212);
        System.out.println("$212の紙幣内訳: " + Arrays.toString(bills));
        System.out.println();

        System.out.println("現在の所持金: $" + ma.getCash());
        System.out.println();

        System.out.println("財布を無くした");
        Wallet dropped = ma.dropWallet();
        System.out.println("財布を無くしたときの所持金: $" + dropped.getTotalMoney());
        System.out.println();

        System.out.println("財布を追加(400ドル追加: 20ドル*10 + 100ドル*2)");
        Wallet newWallet = new Wallet(0, 0, 0, 10, 0, 2); // 20ドル×10 + 100ドル×2
        ma.addWallet(newWallet);
        System.out.println("新しい所持金: $" + ma.getCash());
        System.out.println();

        System.out.println("denominationの動作確認");
        // twentiesテスト
        System.out.println("twenties");
        ma.setDenominationPreference("twenties");
        System.out.println("$389追加");
        System.out.println("期待: [4, 1, 0, 19, 0, 0]");
        bills = ma.getPayed(389);
        System.out.println("結果: " + Arrays.toString(bills));
        System.out.println();

        // dollarsテスト
        System.out.println("dollars");
        ma.setDenominationPreference("dollars");
        System.out.println("$389追加");
        System.out.println("期待: [389, 0, 0, 0, 0, 0]");
        bills = ma.getPayed(389);
        System.out.println("結果: " + Arrays.toString(bills));
        System.out.println();

        // highestFirstテスト
        System.out.println("highestFirst");
        ma.setDenominationPreference("highestFirst");
        System.out.println("$389追加");
        System.out.println("期待: [4, 1, 1, 1, 1, 3]");
        bills = ma.getPayed(389);
        System.out.println("結果: " + Arrays.toString(bills));
        System.out.println();
    }
}