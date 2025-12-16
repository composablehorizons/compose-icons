package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.RotateCw: ImageVector
    get() {
        if (_RotateCw != null) return _RotateCw!!
        
        _RotateCw = ImageVector.Builder(
            name = "rotate-cw",
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
                moveTo(23f, 4f)
                lineTo(23f, 10f)
                lineTo(17f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.49f, 15f)
                arcToRelative(9f, 9f, 0f, true, true, -2.12f, -9.36f)
                lineTo(23f, 10f)
            }
        }.build()
        
        return _RotateCw!!
    }

private var _RotateCw: ImageVector? = null

