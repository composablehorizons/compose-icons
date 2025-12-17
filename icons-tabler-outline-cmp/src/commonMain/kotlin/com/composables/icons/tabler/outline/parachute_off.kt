package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ParachuteOff: ImageVector
    get() {
        if (_ParachuteOff != null) return _ParachuteOff!!
        
        _ParachuteOff = ImageVector.Builder(
            name = "parachute-off",
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
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                curveToRelative(-1.737f, 0f, -3.37f, 0.443f, -4.794f, 1.222f)
                moveToRelative(-2.28f, 1.71f)
                arcToRelative(9.969f, 9.969f, 0f, false, false, -2.926f, 7.068f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, -1.66f, -1.46f, -3f, -3.25f, -3f)
                curveToRelative(-1.63f, 0f, -2.973f, 1.099f, -3.212f, 2.54f)
                moveToRelative(-0.097f, -0.09f)
                curveToRelative(-0.23f, -1.067f, -1.12f, -1.935f, -2.29f, -2.284f)
                moveToRelative(-3.445f, 0.568f)
                curveToRelative(-0.739f, 0.55f, -1.206f, 1.36f, -1.206f, 2.266f)
                curveToRelative(0f, -1.66f, -1.46f, -3f, -3.25f, -3f)
                curveToRelative(-1.8f, 0f, -3.25f, 1.34f, -3.25f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                lineToRelative(10f, 10f)
                lineToRelative(-3.5f, -10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.582f, 14.624f)
                lineToRelative(-2.582f, 7.376f)
                lineToRelative(4.992f, -4.992f)
                moveToRelative(2.014f, -2.014f)
                lineToRelative(3f, -3f)
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
        
        return _ParachuteOff!!
    }

private var _ParachuteOff: ImageVector? = null

