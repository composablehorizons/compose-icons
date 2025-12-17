package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EyeOff: ImageVector
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
                moveTo(10.733f, 5.076f)
                arcToRelative(10.744f, 10.744f, 0f, false, true, 11.205f, 6.575f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 0.696f)
                arcToRelative(10.747f, 10.747f, 0f, false, true, -1.444f, 2.49f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.084f, 14.158f)
                arcToRelative(3f, 3f, 0f, false, true, -4.242f, -4.242f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.479f, 17.499f)
                arcToRelative(10.75f, 10.75f, 0f, false, true, -15.417f, -5.151f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -0.696f)
                arcToRelative(10.75f, 10.75f, 0f, false, true, 4.446f, -5.143f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()
        
        return _EyeOff!!
    }

private var _EyeOff: ImageVector? = null

