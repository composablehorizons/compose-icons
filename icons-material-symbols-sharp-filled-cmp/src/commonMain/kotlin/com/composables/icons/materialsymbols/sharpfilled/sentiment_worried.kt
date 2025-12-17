package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sentiment_worried: ImageVector
    get() {
        if (_Sentiment_worried != null) return _Sentiment_worried!!
        
        _Sentiment_worried = ImageVector.Builder(
            name = "sentiment_worried",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(452f, 720f)
                horizontalLineToRelative(56f)
                quadToRelative(55f, 0f, 93.5f, -35f)
                reflectiveQuadToRelative(38.5f, -85f)
                quadToRelative(0f, -50f, -38.5f, -85f)
                reflectiveQuadTo(508f, 480f)
                horizontalLineToRelative(-56f)
                quadToRelative(-55f, 0f, -93.5f, 35f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(0f, 50f, 38.5f, 85f)
                reflectiveQuadToRelative(93.5f, 35f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-30f, 0f, -51f, -17.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(0f, -25f, 21f, -42.5f)
                reflectiveQuadToRelative(51f, -17.5f)
                horizontalLineToRelative(56f)
                quadToRelative(30f, 0f, 51f, 17.5f)
                reflectiveQuadToRelative(21f, 42.5f)
                quadToRelative(0f, 25f, -21f, 42.5f)
                reflectiveQuadTo(508f, 660f)
                horizontalLineToRelative(-56f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(-60f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(320f, 340f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(580f, 280f)
                horizontalLineToRelative(-60f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
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
        
        return _Sentiment_worried!!
    }

private var _Sentiment_worried: ImageVector? = null

