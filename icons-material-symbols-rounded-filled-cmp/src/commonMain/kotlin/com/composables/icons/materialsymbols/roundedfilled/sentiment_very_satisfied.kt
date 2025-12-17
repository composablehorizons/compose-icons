package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_very_satisfied: ImageVector
    get() {
        if (_Sentiment_very_satisfied != null) return _Sentiment_very_satisfied!!
        
        _Sentiment_very_satisfied = ImageVector.Builder(
            name = "sentiment_very_satisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                quadToRelative(58f, 0f, 107f, -28f)
                reflectiveQuadToRelative(79f, -76f)
                quadToRelative(6f, -12f, -1f, -24f)
                reflectiveQuadToRelative(-21f, -12f)
                horizontalLineTo(316f)
                quadToRelative(-14f, 0f, -21f, 12f)
                reflectiveQuadToRelative(-1f, 24f)
                quadToRelative(30f, 48f, 79.5f, 76f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveTo(356f, 398f)
                lineToRelative(21f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(9f, -9f, 8.5f, -21f)
                reflectiveQuadToRelative(-8.5f, -21f)
                lineToRelative(-35f, -36f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(327f, 341f)
                lineToRelative(-36f, 36f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(8f, 8f, 20.5f, 8.5f)
                reflectiveQuadTo(333f, 420f)
                lineToRelative(23f, -22f)
                close()
                moveToRelative(248f, 0f)
                lineToRelative(23f, 22f)
                quadToRelative(9f, 8f, 21f, 8f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                lineToRelative(-36f, -36f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(576f, 341f)
                lineToRelative(-36f, 36f)
                quadToRelative(-8f, 9f, -8f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(21f, -21f)
                close()
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
            }
        }.build()
        
        return _Sentiment_very_satisfied!!
    }

private var _Sentiment_very_satisfied: ImageVector? = null

