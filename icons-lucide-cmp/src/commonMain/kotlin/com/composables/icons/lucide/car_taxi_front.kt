package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CarTaxiFront: ImageVector
    get() {
        if (_CarTaxiFront != null) return _CarTaxiFront!!
        
        _CarTaxiFront = ImageVector.Builder(
            name = "car-taxi-front",
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
                moveTo(10f, 2f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.5f, -3.7f)
                arcTo(2f, 2f, 0f, false, false, 15.646f, 5f)
                horizontalLineTo(8.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.903f, 1.257f)
                lineTo(5f, 10f)
                lineTo(3f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 12f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 19f, 18f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 16f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 5f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 18f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _CarTaxiFront!!
    }

private var _CarTaxiFront: ImageVector? = null

