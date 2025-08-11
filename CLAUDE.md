# プロジェクト概要
Androidカレンダーの便利ツールのアプリケーション

# プロジェクト構造
```
CalendarTools/
├── app/                      # メインアプリケーションモジュール
├── feature-move/             # 一括移動機能モジュール
├── navigation/               # ナビゲーションに必要な型を定義するモジュール
├── gradle/
│   └── libs.versions.toml    # 依存関係バージョン管理
└── build.gradle.kts          # ルートビルド設定
```

# 開発ガイドライン

## コーディング規約
- Kotlin標準の命名規則を使用
- Compose UIを使用したモダンなUI実装
- Material Design 3 - Expressiveに準拠する
  - https://m3.material.io/blog/building-with-m3-expressive

## 通らないといけないコマンド
- Lintチェック: `./gradlew lint`
- デバッグビルド: `./gradlew assembleDebug`
