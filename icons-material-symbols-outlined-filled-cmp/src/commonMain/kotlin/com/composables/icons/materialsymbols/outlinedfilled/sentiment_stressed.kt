package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sentiment_stressed: ImageVector
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
                moveTo(298f, 504f)
                lineToRelative(143f, -104f)
                lineToRelative(-143f, -104f)
                lineToRelative(-36f, 48f)
                lineToRelative(77f, 56f)
                lineToRelative(-77f, 56f)
                lineToRelative(36f, 48f)
                close()
                moveToRelative(122f, 178f)
                lineToRelative(60f, -60f)
                lineToRelative(60f, 60f)
                lineToRelative(60f, -60f)
                lineToRelative(39f, 39f)
                lineToRelative(42f, -42f)
                lineToRelative(-81f, -81f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-81f, 81f)
                lineToRelative(42f, 42f)
                lineToRelative(39f, -39f)
                lineToRelative(60f, 60f)
                close()
                moveToRelative(242f, -178f)
                lineToRelative(36f, -48f)
                lineToRelative(-77f, -56f)
                lineToRelative(77f, -56f)
                lineToRelative(-36f, -48f)
                lineToRelative(-143f, 104f)
                lineToRelative(143f, 104f)
                close()
            }
        }.build()
        
        return _Sentiment_stressed!!
    }

private var _Sentiment_stressed: ImageVector? = null

