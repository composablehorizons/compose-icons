package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TentOff: ImageVector
    get() {
        if (_TentOff != null) return _TentOff!!
        
        _TentOff = ImageVector.Builder(
            name = "tent-off",
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
                moveTo(11f, 14f)
                lineToRelative(4f, 6f)
                horizontalLineToRelative(5f)
                moveToRelative(-2.863f, -6.868f)
                lineToRelative(-5.137f, -9.132f)
                lineToRelative(-1.44f, 2.559f)
                moveToRelative(-1.44f, 2.563f)
                lineToRelative(-6.12f, 10.878f)
                horizontalLineToRelative(6f)
                lineToRelative(4f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _TentOff!!
    }

private var _TentOff: ImageVector? = null

