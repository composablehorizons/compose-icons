package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.SpeakerWave: ImageVector
    get() {
        if (_SpeakerWave != null) return _SpeakerWave!!
        
        _SpeakerWave = ImageVector.Builder(
            name = "speaker-wave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(19.114f, 5.636f)
                arcToRelative(9f, 9f, 0f, false, true, 0f, 12.728f)
                moveTo(16.463f, 8.288f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 0f, 7.424f)
                moveTo(6.75f, 8.25f)
                lineToRelative(4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.28f, 0.53f)
                verticalLineToRelative(15.88f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.28f, 0.53f)
                lineToRelative(-4.72f, -4.72f)
                horizontalLineTo(4.51f)
                curveToRelative(-0.88f, 0f, -1.704f, -0.507f, -1.938f, -1.354f)
                arcTo(9.009f, 9.009f, 0f, false, true, 2.25f, 12f)
                curveToRelative(0f, -0.83f, 0.112f, -1.633f, 0.322f, -2.396f)
                curveTo(2.806f, 8.756f, 3.63f, 8.25f, 4.51f, 8.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()
        
        return _SpeakerWave!!
    }

private var _SpeakerWave: ImageVector? = null

