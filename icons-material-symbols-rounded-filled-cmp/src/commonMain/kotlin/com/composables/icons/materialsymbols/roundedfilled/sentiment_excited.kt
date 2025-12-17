package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_excited: ImageVector
    get() {
        if (_Sentiment_excited != null) return _Sentiment_excited!!
        
        _Sentiment_excited = ImageVector.Builder(
            name = "sentiment_excited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(340f, 280f)
                quadToRelative(-34f, 0f, -60f, 22f)
                reflectiveQuadToRelative(-40f, 54f)
                quadToRelative(-5f, 11f, 1.5f, 21f)
                reflectiveQuadToRelative(18.5f, 13f)
                quadToRelative(11f, 3f, 22f, -2.5f)
                reflectiveQuadToRelative(16f, -16.5f)
                quadToRelative(7f, -13f, 17.5f, -22f)
                reflectiveQuadToRelative(24.5f, -9f)
                quadToRelative(14f, 0f, 24.5f, 9.5f)
                reflectiveQuadTo(382f, 372f)
                quadToRelative(5f, 11f, 16f, 16f)
                reflectiveQuadToRelative(22f, 2f)
                quadToRelative(12f, -3f, 18.5f, -13f)
                reflectiveQuadToRelative(1.5f, -21f)
                quadToRelative(-14f, -32f, -40f, -54f)
                reflectiveQuadToRelative(-60f, -22f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-34f, 0f, -60f, 22f)
                reflectiveQuadToRelative(-40f, 54f)
                quadToRelative(-5f, 11f, 1.5f, 21f)
                reflectiveQuadToRelative(18.5f, 13f)
                quadToRelative(11f, 3f, 22f, -2.5f)
                reflectiveQuadToRelative(16f, -16.5f)
                quadToRelative(7f, -13f, 17.5f, -22f)
                reflectiveQuadToRelative(24.5f, -9f)
                quadToRelative(14f, 0f, 24.5f, 9.5f)
                reflectiveQuadTo(662f, 372f)
                quadToRelative(5f, 11f, 16f, 16f)
                reflectiveQuadToRelative(22f, 2f)
                quadToRelative(12f, -3f, 18.5f, -13f)
                reflectiveQuadToRelative(1.5f, -21f)
                quadToRelative(-14f, -32f, -40f, -54f)
                reflectiveQuadToRelative(-60f, -22f)
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
        
        return _Sentiment_excited!!
    }

private var _Sentiment_excited: ImageVector? = null

