package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EyeOff: ImageVector
    get() {
        if (_EyeOff != null) return _EyeOff!!
        
        _EyeOff = ImageVector.Builder(
            name = "eye-off",
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
                moveTo(10.585f, 10.587f)
                arcToRelative(2f, 2f, 0f, false, false, 2.829f, 2.828f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.681f, 16.673f)
                arcToRelative(8.717f, 8.717f, 0f, false, true, -4.681f, 1.327f)
                curveToRelative(-3.6f, 0f, -6.6f, -2f, -9f, -6f)
                curveToRelative(1.272f, -2.12f, 2.712f, -3.678f, 4.32f, -4.674f)
                moveToRelative(2.86f, -1.146f)
                arcToRelative(9.055f, 9.055f, 0f, false, true, 1.82f, -0.18f)
                curveToRelative(3.6f, 0f, 6.6f, 2f, 9f, 6f)
                curveToRelative(-0.666f, 1.11f, -1.379f, 2.067f, -2.138f, 2.87f)
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
        
        return _EyeOff!!
    }

private var _EyeOff: ImageVector? = null

