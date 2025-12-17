package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RadarOff: ImageVector
    get() {
        if (_RadarOff != null) return _RadarOff!!
        
        _RadarOff = ImageVector.Builder(
            name = "radar-off",
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
                moveTo(11.291f, 11.295f)
                arcToRelative(1f, 1f, 0f, false, false, 0.709f, 1.705f)
                verticalLineToRelative(8f)
                curveToRelative(2.488f, 0f, 4.74f, -1.01f, 6.37f, -2.642f)
                moveToRelative(1.675f, -2.319f)
                arcToRelative(8.962f, 8.962f, 0f, false, false, 0.955f, -4.039f)
                horizontalLineToRelative(-5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                arcToRelative(5f, 5f, 0f, false, false, -5.063f, -1.88f)
                moveToRelative(-2.466f, 1.347f)
                arcToRelative(5f, 5f, 0f, false, false, 0.53f, 7.535f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.486f, 9f)
                arcToRelative(9f, 9f, 0f, false, false, -12.525f, -5.032f)
                moveToRelative(-2.317f, 1.675f)
                arcToRelative(9f, 9f, 0f, false, false, 3.36f, 14.852f)
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
        
        return _RadarOff!!
    }

private var _RadarOff: ImageVector? = null

