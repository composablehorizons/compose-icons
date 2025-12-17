package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SmartHomeOff: ImageVector
    get() {
        if (_SmartHomeOff != null) return _SmartHomeOff!!
        
        _SmartHomeOff = ImageVector.Builder(
            name = "smart-home-off",
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
                moveTo(7.097f, 7.125f)
                lineToRelative(-2.037f, 1.585f)
                arcToRelative(2.665f, 2.665f, 0f, false, false, -1.029f, 2.105f)
                verticalLineToRelative(7.2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(0.559f, 0f, 1.064f, -0.229f, 1.427f, -0.598f)
                moveToRelative(0.572f, -3.417f)
                verticalLineToRelative(-5.185f)
                curveToRelative(0f, -0.823f, -0.38f, -1.6f, -1.03f, -2.105f)
                lineToRelative(-5.333f, -4.148f)
                arcToRelative(2.666f, 2.666f, 0f, false, false, -3.274f, 0f)
                lineToRelative(-1.029f, 0.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.332f, 15.345f)
                curveToRelative(-2.213f, 0.976f, -5.335f, 0.86f, -7.332f, -0.345f)
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
        
        return _SmartHomeOff!!
    }

private var _SmartHomeOff: ImageVector? = null

