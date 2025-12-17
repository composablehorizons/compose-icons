package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MugOff: ImageVector
    get() {
        if (_MugOff != null) return _MugOff!!
        
        _MugOff = ImageVector.Builder(
            name = "mug-off",
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
                moveTo(9f, 5f)
                horizontalLineToRelative(5.917f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, 1.083f, 1.077f)
                verticalLineToRelative(5.923f)
                moveToRelative(-0.167f, 3.88f)
                arcToRelative(4.33f, 4.33f, 0f, false, true, -4.166f, 3.12f)
                horizontalLineToRelative(-4.334f)
                curveToRelative(-2.393f, 0f, -4.333f, -1.929f, -4.333f, -4.308f)
                verticalLineToRelative(-8.615f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, 1.083f, -1.077f)
                horizontalLineToRelative(0.917f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.045f, 2.5f, 2.333f)
                verticalLineToRelative(2.334f)
                curveToRelative(0f, 1.148f, -0.89f, 2.103f, -2.06f, 2.297f)
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
        
        return _MugOff!!
    }

private var _MugOff: ImageVector? = null

