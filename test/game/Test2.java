package game;

import game.Field;

class Test2 {
    public static void main(String[] args){
        Player p1 = new Player("Tom", 2000, 200, 60, 1000);
        // Monster gorilla = new Monster("Gorilla", 4000, 40, 100);
        // Monster vampire = new Monster("Vampire", 6000, 160, 20);

        // この世界に登場するモンスターを格納する動的配列を生成
        Field world = new Field();

        // モンスターの名前とパラメータを渡すことでモンスターを追加
        // 内部でどのようにDragonが作成されているか、このメソッドがどのクラスに依存しているかわからない
        // world.randomlyAdd("Dragon", 30000, 400, 400);

        // プレイヤーp1をフィールドに追加
        world.randomlyAddWithDependency(p1);

        // モンスターオブジェクトを直接引数として渡すことでモンスターを追加する
        // このクラスがMonsterクラスに依存していることがわかる
        // モンスターオブジェクトが既に作成されているため、このメソッド内部でモンスターがどのように作成されるかを考慮する必要はない
        // world.randomlyAddWithDependency(gorilla);
        // world.randomlyAddWithDependency(vampire);

        // 他のプレイヤーを追加
        Player p2 = new Player("Mike", 2000, 300, 50, 1300);
        Player p3 = new Player("Sam", 200, 20, 60, 1000000);

        world.randomlyAddWithDependency(p2);
        world.randomlyAddWithDependency(p3);
        
        System.out.println(world);
    }
}