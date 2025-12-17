package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SunOff: ImageVector
    get() {
        if (_SunOff != null) return _SunOff!!
        
        _SunOff = ImageVector.Builder(
            name = "sun-off",
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
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                moveToRelative(-2.834f, 1.177f)
                arcToRelative(4f, 4f, 0f, false, false, 5.66f, 5.654f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
                moveToRelative(8f, -9f)
                verticalLineToRelative(1f)
                moveToRelative(8f, 8f)
                horizontalLineToRelative(1f)
                moveToRelative(-9f, 8f)
                verticalLineToRelative(1f)
                moveToRelative(-6.4f, -15.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
                moveToRelative(0f, 11.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(-12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
            }
        }.build()
        
        return _SunOff!!
    }

private var _SunOff: ImageVector? = null

