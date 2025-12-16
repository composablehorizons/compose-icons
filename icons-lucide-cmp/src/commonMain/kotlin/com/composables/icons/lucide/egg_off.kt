package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EggOff: ImageVector
    get() {
        if (_EggOff != null) return _EggOff!!
        
        _EggOff = ImageVector.Builder(
            name = "egg-off",
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
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14.347f)
                verticalLineTo(14f)
                curveToRelative(0f, -6f, -4f, -12f, -8f, -12f)
                curveToRelative(-1.078f, 0f, -2.157f, 0.436f, -3.157f, 1.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.206f, 6.21f)
                curveTo(4.871f, 8.4f, 4f, 11.2f, 4f, 14f)
                arcToRelative(8f, 8f, 0f, false, false, 14.568f, 4.568f)
            }
        }.build()
        
        return _EggOff!!
    }

private var _EggOff: ImageVector? = null

