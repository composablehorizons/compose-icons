package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_extremely_dissatisfied: ImageVector
    get() {
        if (_Sentiment_extremely_dissatisfied != null) return _Sentiment_extremely_dissatisfied!!
        
        _Sentiment_extremely_dissatisfied = ImageVector.Builder(
            name = "sentiment_extremely_dissatisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(140f, -400f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 420f)
                quadToRelative(0f, -15f, -7f, -28.5f)
                reflectiveQuadTo(654f, 370f)
                lineToRelative(9f, -5f)
                quadToRelative(8f, -5f, 10f, -12.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                quadToRelative(-5f, -8f, -12f, -10f)
                reflectiveQuadToRelative(-15f, 3f)
                lineToRelative(-106f, 60f)
                quadToRelative(-8f, 4f, -9.5f, 11.5f)
                reflectiveQuadTo(530f, 417f)
                quadToRelative(5f, 8f, 12.5f, 10.5f)
                reflectiveQuadTo(558f, 425f)
                lineToRelative(2f, -1f)
                quadToRelative(2f, 24f, 19f, 40f)
                reflectiveQuadToRelative(41f, 16f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(24f, 0f, 41f, -16f)
                reflectiveQuadToRelative(19f, -40f)
                lineToRelative(2f, 1f)
                quadToRelative(8f, 5f, 15.5f, 3f)
                reflectiveQuadToRelative(12.5f, -10f)
                quadToRelative(4f, -8f, 2f, -15.5f)
                reflectiveQuadTo(422f, 390f)
                lineToRelative(-105f, -60f)
                quadToRelative(-8f, -4f, -15f, -2f)
                reflectiveQuadToRelative(-12f, 10f)
                quadToRelative(-5f, 8f, -3f, 15f)
                reflectiveQuadToRelative(10f, 12f)
                lineToRelative(9f, 5f)
                quadToRelative(-12f, 8f, -19f, 21.5f)
                reflectiveQuadToRelative(-7f, 28.5f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 480f)
                close()
                moveToRelative(140f, 40f)
                quadToRelative(-71f, 0f, -125f, 45.5f)
                reflectiveQuadTo(279f, 680f)
                horizontalLineToRelative(402f)
                quadToRelative(-22f, -69f, -76f, -114.5f)
                reflectiveQuadTo(480f, 520f)
                close()
            }
        }.build()
        
        return _Sentiment_extremely_dissatisfied!!
    }

private var _Sentiment_extremely_dissatisfied: ImageVector? = null

