package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BellElectric: ImageVector
    get() {
        if (_BellElectric != null) return _BellElectric!!
        
        _BellElectric = ImageVector.Builder(
            name = "bell-electric",
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
                moveTo(18.518f, 17.347f)
                arcTo(7f, 7f, 0f, false, true, 14f, 19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.8f, 4f)
                arcTo(11f, 11f, 0f, false, true, 20f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                arcTo(2f, 2f, 0f, false, true, 20f, 18f)
                arcTo(2f, 2f, 0f, false, true, 18f, 16f)
                arcTo(2f, 2f, 0f, false, true, 22f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                arcTo(7f, 7f, 0f, false, true, 9f, 16f)
                arcTo(7f, 7f, 0f, false, true, 2f, 9f)
                arcTo(7f, 7f, 0f, false, true, 16f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 12f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 20f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 6f, 16f)
                close()
            }
        }.build()
        
        return _BellElectric!!
    }

private var _BellElectric: ImageVector? = null

