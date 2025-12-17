package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Moustache: ImageVector
    get() {
        if (_Moustache != null) return _Moustache!!
        
        _Moustache = ImageVector.Builder(
            name = "moustache",
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
                moveTo(15f, 9f)
                arcToRelative(3f, 3f, 0f, false, true, 2.599f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.933f, 1.333f, 2.133f, 1.556f, 3.126f, 1.556f)
                lineToRelative(0.291f, 0f)
                lineToRelative(0.77f, -0.044f)
                lineToRelative(0.213f, 0f)
                curveToRelative(-0.963f, 1.926f, -3.163f, 2.925f, -6.6f, 3f)
                lineToRelative(-0.4f, 0f)
                lineToRelative(-0.165f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 0.165f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                arcToRelative(3f, 3f, 0f, false, false, -2.599f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.933f, 1.333f, -2.133f, 1.556f, -3.126f, 1.556f)
                lineToRelative(-0.291f, 0f)
                lineToRelative(-0.77f, -0.044f)
                lineToRelative(-0.213f, 0f)
                curveToRelative(0.963f, 1.926f, 3.163f, 2.925f, 6.6f, 3f)
                lineToRelative(0.4f, 0f)
                lineToRelative(0.165f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -0.165f, -6f)
                close()
            }
        }.build()
        
        return _Moustache!!
    }

private var _Moustache: ImageVector? = null

