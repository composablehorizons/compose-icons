package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sentiment_content: ImageVector
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
                moveTo(390f, 620f)
                horizontalLineToRelative(180f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(600f, 590f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(570f, 560f)
                horizontalLineTo(390f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(360f, 590f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(390f, 620f)
                close()
                moveToRelative(90f, 260f)
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
                moveTo(340f, 340f)
                quadToRelative(-23f, 0f, -44f, 9f)
                reflectiveQuadToRelative(-37f, 26f)
                quadToRelative(-10f, 11f, -10f, 24.5f)
                reflectiveQuadToRelative(11f, 20.5f)
                quadToRelative(10f, 7f, 22f, 5f)
                reflectiveQuadToRelative(22f, -10f)
                quadToRelative(8f, -7f, 17f, -10.5f)
                reflectiveQuadToRelative(19f, -3.5f)
                quadToRelative(10f, 0f, 19f, 4f)
                reflectiveQuadToRelative(17f, 10f)
                quadToRelative(10f, 8f, 22f, 9.5f)
                reflectiveQuadToRelative(22f, -5.5f)
                quadToRelative(11f, -7f, 11f, -20.5f)
                reflectiveQuadTo(421f, 375f)
                quadToRelative(-16f, -17f, -37f, -26f)
                reflectiveQuadToRelative(-44f, -9f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-23f, 0f, -45f, 9f)
                reflectiveQuadToRelative(-38f, 26f)
                quadToRelative(-10f, 11f, -9f, 24f)
                reflectiveQuadToRelative(12f, 21f)
                quadToRelative(10f, 7f, 22f, 5.5f)
                reflectiveQuadToRelative(22f, -9.5f)
                quadToRelative(8f, -6f, 17f, -10f)
                reflectiveQuadToRelative(19f, -4f)
                quadToRelative(11f, 0f, 20f, 4f)
                reflectiveQuadToRelative(17f, 10f)
                quadToRelative(10f, 8f, 21.5f, 9.5f)
                reflectiveQuadTo(700f, 420f)
                quadToRelative(11f, -7f, 11f, -20.5f)
                reflectiveQuadTo(701f, 375f)
                quadToRelative(-16f, -17f, -37f, -26f)
                reflectiveQuadToRelative(-44f, -9f)
                close()
            }
        }.build()
        
        return _Sentiment_content!!
    }

private var _Sentiment_content: ImageVector? = null

