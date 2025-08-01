# 🏦 Kotlin Banking System
This is a tiny banking app written in Kotlin. Imagine you're playing pretend bank — this app lets you do just that!

---

## 🧠 What Does It Do?

This program lets you open a **bank account** and:
- 🏦 **Check how much money you have**
- 💸 **Take money out** (like from an ATM)
- 💵 **Put money in** (like giving money to your piggy bank)
- ❌ **Close the system** (like going home after the bank closes)

---

## 🏛️ Types of Bank Accounts

You can choose from 3 types of accounts:
1. **CREDIT** – This means you borrowed money. You need to *pay it back!*
2. **DEBIT** – You can only spend the money you have.
3. **CHECKING** – Regular account to keep and use money.

---

## 💼 What Are the Main Features?

| Feature          | What it Does                                                                 |
|------------------|------------------------------------------------------------------------------|
| `createAccountType()` | Helps you choose which type of account you want                         |
| `depositAmount()`     | Adds money to your account (except credit – special rules!)             |
| `withdraw()`          | Takes money out of your account if you have enough                      |
| `debitWithdraw()`     | Stops you from taking money if you're broke (like a strict piggy bank!) |
| `creditDeposit()`     | Helps you pay back what you owe in a credit account                     |
| `promptToAskMoney()`  | Asks how much money you want to use                                     |

---

## 🧮 How CREDIT Works

If your account is CREDIT:
- You **owe** money (your balance starts negative, like -50).
- If you try to pay back **more** than you owe, ❌ it's not allowed.
- If you pay the **exact** amount you owe, ✅ it says “you paid off your account!”
- You can also pay **a little bit at a time**, and it updates your balance each time.

---

## 🧮 How DEBIT Works

If your account is DEBIT:
You can only spend what you already have — no borrowing allowed!
If your balance is 0, ❌ you can't withdraw anything.
If you try to withdraw more than you have, it will stop you.
You can still deposit as much money as you want — just like putting coins into a jar.

---

## 🧮 How CHECKING Works

If your account is CHECKING:
It’s a simple money-in, money-out account.
✅ You can deposit and withdraw freely, as long as you don’t go below zero.
If you try to take out more than your balance, it’ll say ❌ “Not enough money!”
Great for practice banking, like a real-life piggy bank with rules.

---

## ▶️ How to Run It

1. Copy the Kotlin code into IntelliJ, VSCode, or your favorite Kotlin playground.
2. Hit the **Run** button.
3. Follow the prompts:
   - Choose account type
   - Enter money
   - Withdraw or deposit
   - See updated balance
   - Exit when done!

---

## 💡 Fun Fact

Even though it’s a small program, it teaches you big things:
- Decision making (`if`, `else if`, `when`)
- Loops (`while`)
- Input/output (`readln()`, `println`)
- Keeping track of state (like balance!)

---

## 🧵 Future Upgrades (Ideas!)
- Add passwords to accounts 🔐
- Save multiple accounts 🧾
- Use coroutines for real-time banking ⏱️
- Connect to a real database 🗄️

---

Happy Banking! 🏦✨  
Made with ❤️ in Kotlin.

