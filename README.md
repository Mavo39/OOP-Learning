# Java OOP 学習リポジトリ

## プロジェクト概要
このリポジトリは、Javaを使ったオブジェクト指向プログラミング(OOP)の学習過程を記録するものです。<br> 
VS Codeを使用し、実際にコードを書きながらOOPの基本概念（カプセル化、継承、ポリモーフィズムなど）を理解することを目的としています。<br> 
なお、本プロジェクトではRecursionCSプログラムで学習したコードを使用しています。<br> 

## Java選定理由
①JavaはOOPの基本概念である「クラス」「オブジェクト」「継承」「ポリモーフィズム」「カプセル化」を、文法レベルで強制しているため<br> 
②型厳格性により設計力を鍛えるため<br> 

## ディレクトリ構成
```plaintext
OOP/
├── bin/                   # javacコンパイル後のバイトコード(.class)格納先
│   └── クラス/
│       └── Example.class  # コンパイル済みクラスファイル
├── src/                   # メインソースコード(.java)格納先
│   └── クラス/
│       └── Example.java   # オリジナルソースコード
├── test/                  # テストコード格納先
│   └── クラス/
│       └── MainTest.java  # テストクラス
└── README.md
```


## 🎯 学習目標
**オブジェクト指向設計**
✅ クラス設計<br>
✅ メンバ変数とメモリ<br>
✅ オブジェクトのスコープ<br>
✅ クラス変数
✅ クラスメソッド
✅ カプセル化
✅ クラスの抽象化
✅ 不変オブジェクト

**関連と継承**
✅ 関連
✅ 多重度
✅ 集約とコンポジション
✅ 依存関係
✅ 継承
✅ ポリモーフィズム

**抽象クラスをインターフェース**
✅ 抽象クラス
✅ 抽象構造体
- [ ] インターフェース
- [ ] 複数のインターフェース
- [ ] データ構造インターフェース
- [ ] ジェネリクス
- [ ] 汎用データ構造

## 学習記録
2025.3.27 Personクラスの実装<br>
2025.3.28 オブジェクトスコープ完了・クラスパスとパッケージ宣言の関係について・クラス変数(1)を学習<br>
2025.3.29 クラス変数・クラスメソッドを完了・インスタンスメソッドと静的メソッドの違いを学習<br>
2025.3.30 カプセル化・クラスの抽象化の学習完了<br>
2025.3.31 不変オブジェクトまで学習完了・関連を学習開始<br>
2025.4.1 昨日実装できなかったWalletクラス・Personクラスの拡張を試みるも未だできず。ただ、前進している感覚はある。明日こそ！<br>
2025.4.2 やっとWalletクラスを使用に基づいて拡張できた。明日はUML図でクラスの関係性を表現しよう。<br>
2025.4.3 UML図の作成のみ<br>
2025.4.4 集約とコンポジッションを3/4学習。クラスの内包関係について学んだ<br>
2025.4.5 集約とコンポジッションをクリア。依存関係を3/4学習<br>
2025.4.7 依存関係をクリア。継承の概念をコーディングを通じて理解中<br>
2025.4.8 ポリモーフィズムの概念を学習。完全に理解できたとは言い難いが先に進める<br>
2025.4.9 抽象クラスをShape2dクラスの実装を通じて学習開始<br>
2025.4.11 抽象クラスを少しだけ続きを実装<br>
2025.4.14 抽象クラスクリア<br>
2025.4.15 インターフェースの実装2クラス分作成<br>