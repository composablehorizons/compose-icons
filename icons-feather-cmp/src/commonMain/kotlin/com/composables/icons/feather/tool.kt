package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Tool: ImageVector
    get() {
        if (_Tool != null) return _Tool!!
        
        _Tool = ImageVector.Builder(
            name = "tool",
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
                moveTo(14.7f, 6.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.4f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.4f, 0f)
                lineToRelative(3.77f, -3.77f)
                arcToRelative(6f, 6f, 0f, false, true, -7.94f, 7.94f)
                lineToRelative(-6.91f, 6.91f)
                arcToRelative(2.12f, 2.12f, 0f, false, true, -3f, -3f)
                lineToRelative(6.91f, -6.91f)
                arcToRelative(6f, 6f, 0f, false, true, 7.94f, -7.94f)
                lineToRelative(-3.76f, 3.76f)
                close()
            }
        }.build()
        
        return _Tool!!
    }

private var _Tool: ImageVector? = null

