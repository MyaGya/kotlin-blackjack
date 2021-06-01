package domain

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class UserTest {
    @DisplayName("게이머 생성")
    @Test
    fun nameSplitTest() {
        val inputNames = "test1,test2,test3"
        val gamers = Gamers(inputNames)
        listOf("test1", "test2", "test3")
        assertThat(gamers.names).isEqualTo(listOf(Gamer("test1"), Gamer("test2"), Gamer("test3")))
    }

    @DisplayName("카드 객체 생성")
    @Test
    fun carList() {
        assertThat(TrumpCard(TrumpCardNumber.FIVE, TrumpCardPattern.CLOVER).getScore()).isEqualTo(5)
    }

    @DisplayName("카드들의 점수 계산")
    @Test
    fun carsListScore() {
        //given
        val fiveCard = TrumpCard(TrumpCardNumber.FIVE, TrumpCardPattern.CLOVER)
        val cards = Cards(listOf(fiveCard, fiveCard, fiveCard))
        //then
        assertThat(cards.getTotalScore()).isEqualTo(15)
    }

}
