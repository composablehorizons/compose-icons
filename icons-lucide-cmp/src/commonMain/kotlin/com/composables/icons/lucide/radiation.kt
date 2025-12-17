package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Radiation: ImageVector
    get() {
        if (_Radiation != null) return _Radiation!!
        
        _Radiation = ImageVector.Builder(
            name = "radiation",
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
                moveTo(12f, 12f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15.4641f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 0f)
                lineTo(7.52786f, 19.74597f)
                arcTo(1f, 1f, 0f, false, false, 7.99303f, 21.16211f)
                arcTo(10f, 10f, 0f, false, false, 16.00697f, 21.16211f)
                arcTo(1f, 1f, 0f, false, false, 16.47214f, 19.74597f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, false, false, -2f, -3.464f)
                lineToRelative(2.472f, -4.282f)
                arcToRelative(1f, 1f, 0f, false, true, 1.46f, -0.305f)
                arcToRelative(10f, 10f, 0f, false, true, 4.006f, 6.94f)
                arcTo(1f, 1f, 0f, false, true, 21f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, 2f, -3.464f)
                lineTo(7.528f, 4.254f)
                arcToRelative(1f, 1f, 0f, false, false, -1.46f, -0.305f)
                arcToRelative(10f, 10f, 0f, false, false, -4.006f, 6.94f)
                arcTo(1f, 1f, 0f, false, false, 3f, 12f)
                close()
            }
        }.build()
        
        return _Radiation!!
    }

private var _Radiation: ImageVector? = null

