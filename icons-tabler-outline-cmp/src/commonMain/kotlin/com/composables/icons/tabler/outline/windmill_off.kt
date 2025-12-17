package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WindmillOff: ImageVector
    get() {
        if (_WindmillOff != null) return _WindmillOff!!
        
        _WindmillOff = ImageVector.Builder(
            name = "windmill-off",
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
                moveTo(15.061f, 11.06f)
                curveToRelative(1.18f, -0.824f, 1.939f, -2.11f, 1.939f, -3.56f)
                curveToRelative(0f, -2.49f, -2.24f, -4.5f, -5f, -4.5f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(0f, 2.76f, 2.01f, 5f, 4.5f, 5f)
                curveToRelative(0.166f, 0f, 0.33f, -0.01f, 0.49f, -0.03f)
                moveToRelative(2.624f, -1.36f)
                curveToRelative(0.856f, -0.91f, 1.386f, -2.19f, 1.386f, -3.61f)
                horizontalLineToRelative(-5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(-2.76f, 0f, -5f, 2.01f, -5f, 4.5f)
                reflectiveCurveToRelative(2.24f, 4.5f, 5f, 4.5f)
                verticalLineToRelative(-9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.981f, 7.033f)
                curveToRelative(-2.244f, 0.285f, -3.981f, 2.402f, -3.981f, 4.967f)
                horizontalLineToRelative(9f)
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
        
        return _WindmillOff!!
    }

private var _WindmillOff: ImageVector? = null

