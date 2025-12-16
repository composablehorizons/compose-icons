package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.RotateCcw: ImageVector
    get() {
        if (_RotateCcw != null) return _RotateCcw!!
        
        _RotateCcw = ImageVector.Builder(
            name = "rotate-ccw",
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
                moveTo(1f, 4f)
                lineTo(1f, 10f)
                lineTo(7f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.51f, 15f)
                arcToRelative(9f, 9f, 0f, true, false, 2.13f, -9.36f)
                lineTo(1f, 10f)
            }
        }.build()
        
        return _RotateCcw!!
    }

private var _RotateCcw: ImageVector? = null

