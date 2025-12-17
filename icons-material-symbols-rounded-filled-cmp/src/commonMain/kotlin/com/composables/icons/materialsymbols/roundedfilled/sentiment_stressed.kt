package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_stressed: ImageVector
    get() {
        if (_Sentiment_stressed != null) return _Sentiment_stressed!!
        
        _Sentiment_stressed = ImageVector.Builder(
            name = "sentiment_stressed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 622f)
                lineToRelative(46f, 46f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(46f, -46f)
                lineToRelative(18f, 18f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                lineToRelative(-46f, -46f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-46f, 46f)
                lineToRelative(-46f, -46f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-46f, 46f)
                lineToRelative(-46f, -46f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-46f, 46f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(18f, -18f)
                lineToRelative(46f, 46f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(46f, -46f)
                close()
                moveTo(339f, 400f)
                lineToRelative(-52f, 38f)
                quadToRelative(-10f, 8f, -12.5f, 20f)
                reflectiveQuadToRelative(5.5f, 22f)
                quadToRelative(8f, 10f, 20f, 12.5f)
                reflectiveQuadToRelative(22f, -5.5f)
                lineToRelative(97f, -71f)
                quadToRelative(8f, -6f, 8f, -16f)
                reflectiveQuadToRelative(-8f, -16f)
                lineToRelative(-97f, -71f)
                quadToRelative(-10f, -8f, -22f, -5.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(-8f, 10f, -6f, 22f)
                reflectiveQuadToRelative(13f, 20f)
                lineToRelative(52f, 38f)
                close()
                moveToRelative(282f, 0f)
                lineToRelative(52f, -38f)
                quadToRelative(10f, -8f, 12.5f, -20f)
                reflectiveQuadToRelative(-5.5f, -22f)
                quadToRelative(-8f, -10f, -20f, -12.5f)
                reflectiveQuadToRelative(-22f, 5.5f)
                lineToRelative(-97f, 71f)
                quadToRelative(-8f, 6f, -8f, 16f)
                reflectiveQuadToRelative(8f, 16f)
                lineToRelative(97f, 71f)
                quadToRelative(10f, 8f, 22f, 5.5f)
                reflectiveQuadToRelative(20f, -12.5f)
                quadToRelative(8f, -10f, 6f, -22f)
                reflectiveQuadToRelative(-13f, -20f)
                lineToRelative(-52f, -38f)
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
        
        return _Sentiment_stressed!!
    }

private var _Sentiment_stressed: ImageVector? = null

