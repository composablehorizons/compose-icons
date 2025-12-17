package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LampCeiling: ImageVector
    get() {
        if (_LampCeiling != null) return _LampCeiling!!
        
        _LampCeiling = ImageVector.Builder(
            name = "lamp-ceiling",
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
                moveTo(12f, 2f)
                verticalLineToRelative(5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.829f, 15.998f)
                arcToRelative(3f, 3f, 0f, true, true, -5.658f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.92f, 14.606f)
                arcTo(1f, 1f, 0f, false, true, 20f, 16f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.92f, -1.394f)
                lineToRelative(3f, -7f)
                arcTo(1f, 1f, 0f, false, true, 7f, 7f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, 0.92f, 0.606f)
                close()
            }
        }.build()
        
        return _LampCeiling!!
    }

private var _LampCeiling: ImageVector? = null

