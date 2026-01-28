# UNO Console Game

A simple console-based UNO game written in Java.  
This game allows a human player to play against one or more bots in the classic UNO style.

---

## Features
- Player vs Bot gameplay
- Deck and Discard Pile management
- Classic UNO rules followed
- Color and Value cards
- Supports multiple rounds

---

## Classic UNO Rules Implemented
1. **Deck**: 108 cards — 4 colors (Red, Green, Blue, Yellow), numbers 0-9, and action cards (Skip, Reverse, Draw Two, Wild, Wild Draw Four).  
2. **Starting the Game**: Each player is dealt 7 cards. The top card of the deck is placed in the discard pile.  
3. **Gameplay**:  
   - Players take turns playing a card that **matches the color or value** of the top card of the discard pile.  
   - Action cards have their classic effects:  
     - **Skip**: Next player loses their turn  
     - **Reverse**: Order of play reverses  
     - **Draw Two**: Next player draws two cards and loses their turn  
     - **Wild**: Player chooses the next color  
     - **Wild Draw Four**: Player chooses the next color, next player draws four cards  
4. **Drawing Cards**: If a player cannot play a card, they draw one from the deck.  
5. **UNO Call**: When a player has only one card left, they must call “UNO”.  
6. **Winning**: The first player to get rid of all their cards wins the round.

---

## Project Structure
- `uno` package:
  - `Game.java`
  - `Deck.java`
  - `DiscardPile.java`
  - `Card.java`
  - `Player.java`
  - `HumanPlayer.java`
  - `BotPlayer.java`
  - `Color.java`
  - `Value.java`
  - `Main.java`

---

## How to Run
1. Compile all Java files in the `uno` package.  
2. Run `Main.java` to start the game in the console.  
3. Follow the on-screen instructions to play.

---

## Future Improvements
- Add multiplayer support
- Improve AI for bot players
- Score tracking across multiple rounds
