成績判定
=

Problem Statement
-
早稲田大学では、主にA+、A、B、C、F、Gの成績で評価を行っている。
ある授業を担当している教授は、毎年以下のとおりに点数をつけ、その点数に応じて成績を決めている。

######点数評価
1. 出席点は、授業への参加内容に応じて20点満点で評価する。
2. 理解度確認試験の点数を80点満点とする。

######成績評価
成績評価は、出席点と理解度確認試験の合計点に応じて、以下のとおりに評価する。

| 合計点数 | 成績 |
|:-------:|:---:|
| 90 ~ 100 | A+ |
| 80 ~ 89 | A |
| 70 ~ 79 | B |
| 60 ~ 69 | C |
| 1 ~ 59 | F |
| 0 | G |

あなたの仕事は、与えられた出席点と理解度確認試験の点数から、その学生の成績を判定することである。

Input
-
入力は、以下の形式で表される。
> N<br>
> A<sub>1</sub> E<sub>1</sub><br>
> A<sub>2</sub> E<sub>2</sub><br>
> :<br>
> A<sub>N</sub> E<sub>N</sub><br>

ここでNは入力を表すデータセットの個数、Aは出席点、Eは理解度確認試験の点数を表す。

Constraints
-
入力は、以下の条件をすべて満たす。

- 1 <= N <= 1000
- 0 <= A <= 20
- 0 <= T <= 80

Output
-
出力は、各データセットに対する成績判定を1行で出力せよ。

Sample Input
-
    3
    12 70
    20 80
    5 30

Sample Output
-
    A
    A+
    F