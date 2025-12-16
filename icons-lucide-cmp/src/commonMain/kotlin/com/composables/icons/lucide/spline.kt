package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Spline: ImageVector
    get() {
        if (_Spline != null) return _Spline!!
        
        _Spline = ImageVector.Builder(
            name = "spline",
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
                moveTo(21f, 5f)
                arcTo(2f, 2f, 0f, false, true, 19f, 7f)
                arcTo(2f, 2f, 0f, false, true, 17f, 5f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                arcTo(2f, 2f, 0f, false, true, 5f, 21f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                arcTo(2f, 2f, 0f, false, true, 7f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                arcTo(12f, 12f, 0f, false, true, 17f, 5f)
            }
        }.build()
        
        return _Spline!!
    }

private var _Spline: ImageVector? = null

