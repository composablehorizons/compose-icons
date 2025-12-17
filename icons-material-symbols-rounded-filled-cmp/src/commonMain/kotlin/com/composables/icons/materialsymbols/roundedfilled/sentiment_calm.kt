package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_calm: ImageVector
    get() {
        if (_Sentiment_calm != null) return _Sentiment_calm!!
        
        _Sentiment_calm = ImageVector.Builder(
            name = "sentiment_calm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                quadToRelative(34f, 0f, 64f, -12.5f)
                reflectiveQuadToRelative(56f, -35.5f)
                quadToRelative(9f, -8f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -8f, -21.5f, -8f)
                reflectiveQuadToRelative(-22.5f, 8f)
                quadToRelative(-17f, 13f, -36f, 21f)
                reflectiveQuadToRelative(-40f, 8f)
                quadToRelative(-21f, 0f, -40f, -8f)
                reflectiveQuadToRelative(-36f, -21f)
                quadToRelative(-10f, -8f, -22.5f, -8f)
                reflectiveQuadToRelative(-21.5f, 8f)
                quadToRelative(-9f, 8f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(26f, 22f, 56f, 35f)
                reflectiveQuadToRelative(64f, 13f)
                close()
                moveToRelative(0f, 180f)
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
                moveTo(340f, 480f)
                quadToRelative(34f, 0f, 60f, -22f)
                reflectiveQuadToRelative(40f, -54f)
                quadToRelative(5f, -11f, -1.5f, -21f)
                reflectiveQuadTo(420f, 370f)
                quadToRelative(-11f, -3f, -22f, 2.5f)
                reflectiveQuadTo(382f, 389f)
                quadToRelative(-7f, 13f, -17.5f, 22f)
                reflectiveQuadToRelative(-24.5f, 9f)
                quadToRelative(-14f, 0f, -25f, -9.5f)
                reflectiveQuadTo(298f, 388f)
                quadToRelative(-5f, -11f, -16f, -16f)
                reflectiveQuadToRelative(-22f, -2f)
                quadToRelative(-12f, 3f, -18.5f, 12.5f)
                reflectiveQuadTo(240f, 403f)
                quadToRelative(14f, 32f, 39.5f, 54.5f)
                reflectiveQuadTo(340f, 480f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(34f, 0f, 60f, -22f)
                reflectiveQuadToRelative(40f, -54f)
                quadToRelative(5f, -11f, -1.5f, -21f)
                reflectiveQuadTo(700f, 370f)
                quadToRelative(-11f, -3f, -22f, 2.5f)
                reflectiveQuadTo(662f, 389f)
                quadToRelative(-7f, 13f, -17.5f, 22f)
                reflectiveQuadToRelative(-24.5f, 9f)
                quadToRelative(-14f, 0f, -25f, -9.5f)
                reflectiveQuadTo(578f, 388f)
                quadToRelative(-5f, -11f, -16f, -16f)
                reflectiveQuadToRelative(-22f, -2f)
                quadToRelative(-12f, 3f, -18.5f, 12.5f)
                reflectiveQuadTo(520f, 403f)
                quadToRelative(14f, 32f, 39.5f, 54.5f)
                reflectiveQuadTo(620f, 480f)
                close()
            }
        }.build()
        
        return _Sentiment_calm!!
    }

private var _Sentiment_calm: ImageVector? = null

