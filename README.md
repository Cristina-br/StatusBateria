# 🔋 StatusBateria

**Projeto simples em Java como exercício para vaga de estágio, utilizando conceitos básicos de Programação Orientada a Objetos (POO).**

---

## 📌 Conceitos abordados

- Declaração de classes e objetos
- Encapsulamento com atributos `private` e uso de getters/setters
- Criação de métodos personalizados
- Laços de repetição e controle de fluxo (`switch`, `do-while`)
- Simulação de comportamento de bateria com base em eventos

---

## 🧱 Estrutura do Projeto

### 📁 Pacote `statusBateria`

#### ✅ Classe `Main`
Classe principal com menu interativo que permite ao usuário:
- Registrar eventos de **consumo** ou **carregamento** da bateria.
- Visualizar o **status atual da bateria**.
- Encerrar o programa.

#### ✅ Classe `Bateria`
Contém a lógica de cálculo da porcentagem de bateria com base nos eventos registrados.

**Atributos:**
- `private int n`: armazenará o valor atual da bateria.

**Métodos:**
- `getBattery(int[] eventos)`: recebe um array de eventos e calcula o percentual da bateria, iniciando de 50%, com limites entre 0% e 100%.
- `getN()` e `setN(int n)`: métodos padrão de acesso ao atributo `n`.

---

## ▶️ Como Executar

1. Compile o código:

```bash
javac statusBateria/Main.java
```

2. Execute o programa:

```bash
java statusBateria.Main
```

---

## 🖱️ Menu do Sistema

```text
---- MENU DE STATUS DA BATERIA ----
1. Registrar evento (consumo ou carregamento)
2. Visualizar status da bateria (% restante)
3. Sair
```

---

## 📊 Exemplo de Saída

```text
---- MENU DE STATUS DA BATERIA ----
1. Registrar evento (consumo ou carregamento)
2. Visualizar status da bateria (% restante)
3. Sair
1
Digite quantos % da bateria foi consumida (ex.: -10) ou carregada (ex.: 10): 
-30
Evento registrado com sucesso

---- MENU DE STATUS DA BATERIA ----
1. Registrar evento (consumo ou carregamento)
2. Visualizar status da bateria (% restante)
3. Sair
2
Status atual da bateria: 20%
```

---

## 💡 Observações

- A bateria sempre inicia com 50%.
- Os eventos registrados são acumulados em um array de tamanho fixo.
- O método `getBattery` garante que a bateria não ultrapasse 100% nem fique abaixo de 0%.

---

## 📚 Desenvolvido por

Cristina ✨  
Estudante de Gestão da Tecnologia da Informação (UniCesumar) | Jovem Programadora (SENAC) 
