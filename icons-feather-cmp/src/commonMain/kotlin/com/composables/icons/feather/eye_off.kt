package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.EyeOff: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.94f, 17.94f)
                arcTo(10.07f, 10.07f, 0f, false, true, 12f, 20f)
                curveToRelative(-7f, 0f, -11f, -8f, -11f, -8f)
                arcToRelative(18.45f, 18.45f, 0f, false, true, 5.06f, -5.94f)
                moveTo(9.9f, 4.24f)
                arcTo(9.12f, 9.12f, 0f, false, true, 12f, 4f)
                curveToRelative(7f, 0f, 11f, 8f, 11f, 8f)
                arcToRelative(18.5f, 18.5f, 0f, false, true, -2.16f, 3.19f)
                moveToRelative(-6.72f, -1.07f)
                arcToRelative(3f, 3f, 0f, true, true, -4.24f, -4.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 1f)
                lineTo(23f, 23f)
            }
        }.build()
        
        return _EyeOff!!
    }

private var _EyeOff: ImageVector? = null

