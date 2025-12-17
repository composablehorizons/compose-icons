package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Tangent: ImageVector
    get() {
        if (_Tangent != null) return _Tangent!!
        
        _Tangent = ImageVector.Builder(
            name = "tangent",
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
                moveTo(19f, 4f)
                arcTo(2f, 2f, 0f, false, true, 17f, 6f)
                arcTo(2f, 2f, 0f, false, true, 15f, 4f)
                arcTo(2f, 2f, 0f, false, true, 19f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.59f, 5.41f)
                lineTo(5.41f, 15.59f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                arcTo(2f, 2f, 0f, false, true, 4f, 19f)
                arcTo(2f, 2f, 0f, false, true, 2f, 17f)
                arcTo(2f, 2f, 0f, false, true, 6f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                reflectiveCurveToRelative(-4f, -9f, -1.5f, -11.5f)
                reflectiveCurveTo(22f, 12f, 22f, 12f)
            }
        }.build()
        
        return _Tangent!!
    }

private var _Tangent: ImageVector? = null

