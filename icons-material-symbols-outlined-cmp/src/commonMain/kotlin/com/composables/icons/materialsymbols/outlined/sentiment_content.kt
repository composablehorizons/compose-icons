package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sentiment_content: ImageVector
    get() {
        if (_Sentiment_content != null) return _Sentiment_content!!
        
        _Sentiment_content = ImageVector.Builder(
            name = "sentiment_content",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 620f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-60f)
                horizontalLineTo(360f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(-20f, -280f)
                quadToRelative(-32f, 0f, -59.5f, 18f)
                reflectiveQuadTo(235f, 404f)
                lineToRelative(50f, 33f)
                quadToRelative(10f, -15f, 24f, -25.5f)
                reflectiveQuadToRelative(31f, -10.5f)
                quadToRelative(17f, 0f, 31f, 10.5f)
                reflectiveQuadToRelative(24f, 24.5f)
                lineToRelative(50f, -33f)
                quadToRelative(-18f, -27f, -45.5f, -45f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-32f, 0f, -59.5f, 18f)
                reflectiveQuadTo(515f, 404f)
                lineToRelative(50f, 33f)
                quadToRelative(10f, -14f, 24f, -24.5f)
                reflectiveQuadToRelative(31f, -10.5f)
                quadToRelative(17f, 0f, 31.5f, 10f)
                reflectiveQuadToRelative(23.5f, 25f)
                lineToRelative(50f, -33f)
                quadToRelative(-18f, -28f, -45.5f, -46f)
                reflectiveQuadTo(620f, 340f)
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
        
        return _Sentiment_content!!
    }

private var _Sentiment_content: ImageVector? = null

