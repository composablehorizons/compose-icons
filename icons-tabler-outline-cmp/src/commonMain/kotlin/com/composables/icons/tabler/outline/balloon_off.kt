package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BalloonOff: ImageVector
    get() {
        if (_BalloonOff != null) return _BalloonOff!!
        
        _BalloonOff = ImageVector.Builder(
            name = "balloon-off",
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
                moveTo(14f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.762f, 3.753f)
                arcToRelative(6f, 6f, 0f, false, true, 10.238f, 4.247f)
                curveToRelative(0f, 1.847f, -0.37f, 3.564f, -1.007f, 4.993f)
                moveToRelative(-1.59f, 2.42f)
                curveToRelative(-0.967f, 1f, -2.14f, 1.587f, -3.403f, 1.587f)
                curveToRelative(-3.314f, 0f, -6f, -4.03f, -6f, -9f)
                curveToRelative(0f, -0.593f, 0.086f, -1.166f, 0.246f, -1.707f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
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
        }.build()
        
        return _BalloonOff!!
    }

private var _BalloonOff: ImageVector? = null

