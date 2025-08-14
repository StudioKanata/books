# Developers Summit 2025 Summer まとめ

## 1. 雰囲気紹介
- イベント概要
- 開催日・場所
  - JPタワーホール(東京駅直結のビル)
  - ![外観](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.jebl.co.jp%2Fbuilding%2Fjptower%2F&psig=AOvVaw06Oe-9yyWxI2_qjg0AHG_Q&ust=1755264775437000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCOCuiYi1io8DFQAAAAAdAAAAABAE)
- イベントの目的
  - [目的](https://event.shoeisha.jp/devsumi/20250717)

## 2. 会場雰囲気
- macbook + HHKBの人がいました...強そう(キャップ被ってたし)
- ![](/img/キャップを被ったラフな格好のメガネを掛けたソフトウェアエンジニアの画像を作成してください.jpg)

## 2. 印象に残った基調講演
- タイトル: Vibe Codingの幻想を越えて　生成AIを現場で使えるようにするまでの泥臭い話
- 講演者: Kuu (Kume Fumiya)
- 主な内容・印象的なポイント:
	- 個人開発と企業開発の違い
    	- 個人開発 : 短期的な生産・小さなプロジェクト
    	- 企業開発 : 継続的な開発・複数repositoryの構成
	- 上場企業としての制約
    	- 外部サービスを利用するにはセキュリティチームのチェックが必要
    	- 情報流出リスク
	- 使いやすい仕組みを作る
    	- 監査ログ
    	- 一人当たりの予算キャップを設定できる、超えたら上限上げてもらうことも可能にしている
    	- アカウント発行・管理の自動化
        	- IT Service agent
            	- Cursor やChatGPTのライセンスを発行してくれる
            	- Slack でリクエストを送る、ボタンクリックするだけ
      	- 非エンジニアの方でも気軽に使い方を質問できるチャットが活発(勉強会のテーマにするのもいいかも)
    	- ![参考](https://engineering.mercari.com/blog/entry/20250625-acfc60bbea/)
- 問題点
  - ソリューションごとに得意分野が違うらしい
    - ソースコード(実装)、仕様、背景情報、開発スケジュール等々
    - 全部をサポートする理想的なソリューションはまだ見つからない
    - Devin Search 䛿ソースコードの情報取得には強い
    - Google Agentspaceはドキュメント検索強い
    - 人間䛾情報処理能力が先に限界を迎える可能性も ...?

- タイトル: ソフトウェア設計とAI技術の活用
- 講演者: 増田 亨
- 主な内容・印象的なポイント:
    - 完璧な設計をしている時間はない
      - 優先順位をつけて取り組もう
	- 「ソフトウェア産業を全体を変える本当に革新的な技術はじわじわとじわじわと時間をかけて広がっていく」
    	- 現在、AI開発は暗黙知として個人開発メインで使われている
    	- これから暗黙知(tacit knowledge)が蓄積し、形式知(explicit knowledge)として一般的になってくる(本とか動画とか)
  	- どんなエンジニアがAIを効果的に活用できる？
    	- ソフトウェア設計の知識と経験が豊富/貧弱


## 7. 参考リンク・資料
- 公式サイト
- 関連資料
  - ![developers summit 2025 summer公式サイト](https://event.shoeisha.jp/devsumi/20250717)
  - ![各企業のAI活用の現在](https://github.com/fumiya-kume/ai-in-japan)
  - ![メルカリのAI導入から活用まで](https://engineering.mercari.com/blog/entry/20250625-acfc60bbea/)


