package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ZoomReset: ImageVector
    get() {
        if (_ZoomReset != null) return _ZoomReset!!
        
        _ZoomReset = ImageVector.Builder(
            name = "zoom-reset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                lineToRelative(-6f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.268f, 12.043f)
                arcToRelative(7.017f, 7.017f, 0f, false, false, 6.634f, 4.957f)
                arcToRelative(7.012f, 7.012f, 0f, false, false, 7.043f, -6.131f)
                arcToRelative(7f, 7f, 0f, false, false, -5.314f, -7.672f)
                arcToRelative(7.021f, 7.021f, 0f, false, false, -8.241f, 4.403f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _ZoomReset!!
    }

private var _ZoomReset: ImageVector? = null

