# PokemonGame
Esse software foi desenvolvido como um trabalho para a disciplina MAC0321-Laboratório de Programação Orientado a Objeto e 
tem como objetivo simular uma Batalha Pokemon.
Há dois modos de batalha: Treinador versus Treinador e Treinador versus Pokemon Selvagem.
O primeiro modo está na contido na classe "BattleControls" e os comandos de ataque para cada pokemon são gerados aleatoriamente 
na simulação em questão.
Já o segundo modo consiste em uma versão simplificada de um mapa composto por duas regiões: "chão" e "gramado". 
Estando no gramado, existe a possibilidade de encontrar um pokemon selvagem iniciando, dessa maneira, uma batalha. Nessa simulação, 
o treinador pode se mover livremente pelo mapa, sendo os comandos de ataque e movimento aleatórios. Esse segundo modo está contido na 
classe "WildBattleControls".
O projeto foi baseado no programa de Bruce Eckel, que controla uma Greenhouse (estufa para plantas). Assim como no programa de Eckel, 
modelamos nossas classes responsáveis por algum tipo de ação (ataques, movimentos e rodadas da batalha) como Events dos controladores
BattleControls/WildBattleControls. 
