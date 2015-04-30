とかげ算
=

Problem Statement
-
トカゲは変温動物である。暖かい年にはその個体数を増やすが、寒い年には逆に減っていく。

サカモト博士が発見したサカモトカゲ(学名: Plestiodon sakamotus)は、暖かい年には個体数を3増やし、寒い年には個体数を半分(小数点以下切り捨て)にすることが広く知られている(当然ではあるが、0匹になって絶滅してしまえばそれ以降の繁殖は行われない)。

あなたの仕事は、過去の気候状況を与えられたとき、1匹のサカモトカゲが現在何匹になっているかを計算するプログラムを書くことである。

Input
-
入力は複数のデータセットで構成され、1つのデータセットは以下の形式で表される。
> T

Tは各年の気候状況を表す文字からなる文字列である。Tの各文字は、その年が暖かい年ならば'w'、寒い年ならば'c'である。

入力の終わりは、Tの代わりに"end"が入力される。

Constraints
-
入力は以下の条件をすべて満たす。

- Tの文字数をLとするとき、1 <= L <= 100
- Tの中に現れる文字は全て'w'または'c'である

Output
-
出力は、現在のサカモトカゲの匹数を1行で出力せよ。

Sample Input
-
    wwc
    cwcwwwwww
    wwwwwwwwwwcwwwwwwwwwwc
    end

Sample Output
-
    3
    0
    22
- 1つめのデータセットは、1年目で4匹に増え、2年目で7匹に増え、3年目で3匹に減る。
- 2つめのデータセットは、1年目で0匹になるため、それ以降は繁殖しない。