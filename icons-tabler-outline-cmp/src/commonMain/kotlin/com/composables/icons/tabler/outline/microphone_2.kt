package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Microphone2: ImageVector
    get() {
        if (_Microphone2 != null) return _Microphone2!!
        
        _Microphone2 = ImageVector.Builder(
            name = "microphone-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12.9f)
                arcToRelative(5f, 5f, 0f, true, false, -3.902f, -3.9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12.9f)
                lineToRelative(-3.902f, -3.899f)
                lineToRelative(-7.513f, 8.584f)
                arcToRelative(2f, 2f, 0f, true, false, 2.827f, 2.83f)
                lineToRelative(8.588f, -7.515f)
                close()
            }
        }.build()
        
        return _Microphone2!!
    }

private var _Microphone2: ImageVector? = null

