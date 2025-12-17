package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gamepad2: ImageVector
    get() {
        if (_Gamepad2 != null) return _Gamepad2!!
        
        _Gamepad2 = ImageVector.Builder(
            name = "gamepad-2",
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
                moveTo(6f, 11f)
                lineTo(10f, 11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9f)
                lineTo(8f, 13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                lineTo(15.01f, 12f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10f)
                lineTo(18.01f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.32f, 5f)
                horizontalLineTo(6.68f)
                arcToRelative(4f, 4f, 0f, false, false, -3.978f, 3.59f)
                curveToRelative(-0.006f, 0.052f, -0.01f, 0.101f, -0.017f, 0.152f)
                curveTo(2.604f, 9.416f, 2f, 14.456f, 2f, 16f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                curveToRelative(1f, 0f, 1.5f, -0.5f, 2f, -1f)
                lineToRelative(1.414f, -1.414f)
                arcTo(2f, 2f, 0f, false, true, 9.828f, 16f)
                horizontalLineToRelative(4.344f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineTo(17f, 18f)
                curveToRelative(0.5f, 0.5f, 1f, 1f, 2f, 1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                curveToRelative(0f, -1.545f, -0.604f, -6.584f, -0.685f, -7.258f)
                curveToRelative(-0.007f, -0.05f, -0.011f, -0.1f, -0.017f, -0.151f)
                arcTo(4f, 4f, 0f, false, false, 17.32f, 5f)
                close()
            }
        }.build()
        
        return _Gamepad2!!
    }

private var _Gamepad2: ImageVector? = null

