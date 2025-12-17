package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sentiment_satisfied: ImageVector
    get() {
        if (_Sentiment_satisfied != null) return _Sentiment_satisfied!!
        
        _Sentiment_satisfied = ImageVector.Builder(
            name = "sentiment_satisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 440f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 380f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 320f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 440f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 380f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 320f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 380f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 440f)
                close()
                moveToRelative(140f, 260f)
                quadToRelative(68f, 0f, 123.5f, -38.5f)
                reflectiveQuadTo(684f, 560f)
                horizontalLineToRelative(-66f)
                quadToRelative(-22f, 37f, -58.5f, 58.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-43f, 0f, -79.5f, -21.5f)
                reflectiveQuadTo(342f, 560f)
                horizontalLineToRelative(-66f)
                quadToRelative(25f, 63f, 80.5f, 101.5f)
                reflectiveQuadTo(480f, 700f)
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
            }
        }.build()
        
        return _Sentiment_satisfied!!
    }

private var _Sentiment_satisfied: ImageVector? = null

