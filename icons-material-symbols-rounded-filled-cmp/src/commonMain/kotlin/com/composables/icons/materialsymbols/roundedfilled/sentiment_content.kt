package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_content: ImageVector
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
                moveTo(340f, 340f)
                quadToRelative(-25f, 0f, -47f, 11f)
                reflectiveQuadToRelative(-39f, 29f)
                quadToRelative(-8f, 9f, -6.5f, 21f)
                reflectiveQuadToRelative(12.5f, 19f)
                quadToRelative(10f, 7f, 22f, 5f)
                reflectiveQuadToRelative(22f, -10f)
                quadToRelative(8f, -7f, 17f, -10.5f)
                reflectiveQuadToRelative(19f, -3.5f)
                quadToRelative(10f, 0f, 19f, 4f)
                reflectiveQuadToRelative(17f, 10f)
                quadToRelative(10f, 8f, 22f, 9.5f)
                reflectiveQuadToRelative(22f, -5.5f)
                quadToRelative(11f, -7f, 13f, -18.5f)
                reflectiveQuadToRelative(-6f, -19.5f)
                quadToRelative(-17f, -18f, -39.5f, -29.5f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-25f, 0f, -47.5f, 11f)
                reflectiveQuadTo(533f, 381f)
                quadToRelative(-8f, 8f, -6f, 20f)
                reflectiveQuadToRelative(13f, 19f)
                quadToRelative(10f, 7f, 22f, 5.5f)
                reflectiveQuadToRelative(22f, -9.5f)
                quadToRelative(8f, -6f, 17f, -10f)
                reflectiveQuadToRelative(19f, -4f)
                quadToRelative(11f, 0f, 20f, 4f)
                reflectiveQuadToRelative(17f, 10f)
                quadToRelative(10f, 8f, 21.5f, 9.5f)
                reflectiveQuadTo(700f, 420f)
                quadToRelative(11f, -7f, 13f, -19f)
                reflectiveQuadToRelative(-6f, -20f)
                quadToRelative(-17f, -19f, -39.5f, -30f)
                reflectiveQuadTo(620f, 340f)
                close()
            }
        }.build()
        
        return _Sentiment_content!!
    }

private var _Sentiment_content: ImageVector? = null

