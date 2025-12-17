package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sentiment_calm: ImageVector
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
                moveTo(340f, 480f)
                quadToRelative(42f, 0f, 70f, -30.5f)
                reflectiveQuadToRelative(39f, -72.5f)
                lineToRelative(-58f, -14f)
                quadToRelative(-5f, 22f, -17.5f, 39.5f)
                reflectiveQuadTo(340f, 420f)
                quadToRelative(-21f, 0f, -33.5f, -17.5f)
                reflectiveQuadTo(289f, 363f)
                lineToRelative(-58f, 14f)
                quadToRelative(11f, 42f, 39f, 72.5f)
                reflectiveQuadToRelative(70f, 30.5f)
                close()
                moveToRelative(140f, 220f)
                quadToRelative(39f, 0f, 75f, -17.5f)
                reflectiveQuadToRelative(67f, -52.5f)
                lineToRelative(-44f, -40f)
                quadToRelative(-22f, 24f, -47f, 36.5f)
                reflectiveQuadTo(480f, 639f)
                quadToRelative(-26f, 0f, -51f, -12.5f)
                reflectiveQuadTo(382f, 590f)
                lineToRelative(-44f, 40f)
                quadToRelative(32f, 35f, 67.5f, 52.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(140f, -220f)
                quadToRelative(42f, 0f, 70f, -30.5f)
                reflectiveQuadToRelative(39f, -72.5f)
                lineToRelative(-58f, -14f)
                quadToRelative(-5f, 22f, -17.5f, 39.5f)
                reflectiveQuadTo(620f, 420f)
                quadToRelative(-21f, 0f, -33.5f, -17.5f)
                reflectiveQuadTo(569f, 363f)
                lineToRelative(-58f, 14f)
                quadToRelative(11f, 42f, 39f, 72.5f)
                reflectiveQuadToRelative(70f, 30.5f)
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
                moveToRelative(0f, -400f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
            }
        }.build()
        
        return _Sentiment_calm!!
    }

private var _Sentiment_calm: ImageVector? = null

