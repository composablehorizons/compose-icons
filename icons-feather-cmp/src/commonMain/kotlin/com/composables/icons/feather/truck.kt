package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Truck: ImageVector
    get() {
        if (_Truck != null) return _Truck!!
        
        _Truck = ImageVector.Builder(
            name = "truck",
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
                moveTo(1f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                lineTo(20f, 8f)
                lineTo(23f, 11f)
                lineTo(23f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, false, true, 3f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 18.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, false, true, 16f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 21f, 18.5f)
                close()
            }
        }.build()
        
        return _Truck!!
    }

private var _Truck: ImageVector? = null

