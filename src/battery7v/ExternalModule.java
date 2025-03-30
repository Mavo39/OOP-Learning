package battery7v;

// カプセル化していないことによる副作用を検証するためのクラス
class ExternalModule {
    // 意図しない副作用を引き起こすメソッド
    // Battery7vクラスのmanufacturedCountを直接変更するため、プログラムの状態が不正確になる可能性がある
    public static void dangerousMethod(String customerId, Battery7v battery){
        System.out.println();
        System.out.println("Processing data ... internals");
        System.out.println("Client " + customerId + " purchased a " + battery.toString());
        // 不適切に状態を変更する。これにより、製造されたバッテリーの数が意図しない数値になる。
        Battery7v.manufacturedCount += 1234;
    }
    // 意図しない副作用を引き起こすメソッド
    // Battery7vクラスのmanufacturedCountを直接変更するため、プログラムの状態が不正確になる可能性がある
    public static void otherDangerousMethod(){
        Battery7v.manufacturedCount += 10000;
    }
}