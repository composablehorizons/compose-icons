package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EraserOff: ImageVector
    get() {
        if (_EraserOff != null) return _EraserOff!!
        
        _EraserOff = ImageVector.Builder(
            name = "eraser-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 20f)
                horizontalLineToRelative(-10.5f)
                lineToRelative(-4.21f, -4.3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.41f)
                lineToRelative(5f, -4.993f)
                moveToRelative(2.009f, -2.01f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.41f, 0f)
                lineToRelative(5f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.41f)
                curveToRelative(-1.417f, 1.431f, -2.406f, 2.432f, -2.97f, 3f)
                moveToRelative(-2.02f, 2.043f)
                lineToRelative(-4.211f, 4.256f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13.3f)
                lineToRelative(-6.3f, -6.3f)
            }
        }.build()
        
        return _EraserOff!!
    }

private var _EraserOff: ImageVector? = null

