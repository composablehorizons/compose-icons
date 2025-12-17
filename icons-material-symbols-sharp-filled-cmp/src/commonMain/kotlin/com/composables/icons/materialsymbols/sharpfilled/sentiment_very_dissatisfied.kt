package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sentiment_very_dissatisfied: ImageVector
    get() {
        if (_Sentiment_very_dissatisfied != null) return _Sentiment_very_dissatisfied!!
        
        _Sentiment_very_dissatisfied = ImageVector.Builder(
            name = "sentiment_very_dissatisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 540f)
                quadToRelative(-68f, 0f, -123.5f, 38.5f)
                reflectiveQuadTo(276f, 680f)
                horizontalLineToRelative(408f)
                quadToRelative(-25f, -63f, -80.5f, -101.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(-168f, -60f)
                lineToRelative(44f, -42f)
                lineToRelative(42f, 42f)
                lineToRelative(42f, -42f)
                lineToRelative(-42f, -42f)
                lineToRelative(42f, -44f)
                lineToRelative(-42f, -42f)
                lineToRelative(-42f, 42f)
                lineToRelative(-44f, -42f)
                lineToRelative(-42f, 42f)
                lineToRelative(42f, 44f)
                lineToRelative(-42f, 42f)
                lineToRelative(42f, 42f)
                close()
                moveToRelative(250f, 0f)
                lineToRelative(42f, -42f)
                lineToRelative(44f, 42f)
                lineToRelative(42f, -42f)
                lineToRelative(-42f, -42f)
                lineToRelative(42f, -44f)
                lineToRelative(-42f, -42f)
                lineToRelative(-44f, 42f)
                lineToRelative(-42f, -42f)
                lineToRelative(-42f, 42f)
                lineToRelative(42f, 44f)
                lineToRelative(-42f, 42f)
                lineToRelative(42f, 42f)
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
        
        return _Sentiment_very_dissatisfied!!
    }

private var _Sentiment_very_dissatisfied: ImageVector? = null

