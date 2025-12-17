package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sentiment_sad: ImageVector
    get() {
        if (_Sentiment_sad != null) return _Sentiment_sad!!
        
        _Sentiment_sad = ImageVector.Builder(
            name = "sentiment_sad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(250f, 640f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -71f, 49.5f, -120.5f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(71f, 0f, 120.5f, 49.5f)
                reflectiveQuadTo(650f, 630f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -96f, -67f, -163f)
                reflectiveQuadToRelative(-163f, -67f)
                quadToRelative(-96f, 0f, -163f, 67f)
                reflectiveQuadToRelative(-67f, 163f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(34f, -270f)
                quadToRelative(41f, -6f, 86.5f, -32f)
                reflectiveQuadToRelative(72.5f, -59f)
                lineToRelative(-46f, -38f)
                quadToRelative(-20f, 24f, -55.5f, 44f)
                reflectiveQuadTo(276f, 310f)
                lineToRelative(8f, 60f)
                close()
                moveToRelative(392f, 0f)
                lineToRelative(8f, -60f)
                quadToRelative(-30f, -5f, -65.5f, -25f)
                reflectiveQuadTo(563f, 241f)
                lineToRelative(-46f, 38f)
                quadToRelative(27f, 33f, 72.5f, 59f)
                reflectiveQuadToRelative(86.5f, 32f)
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
        
        return _Sentiment_sad!!
    }

private var _Sentiment_sad: ImageVector? = null

