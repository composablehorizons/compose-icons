package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RotateCw: ImageVector
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -9f, -9f)
                curveToRelative(2.52f, 0f, 4.93f, 1f, 6.74f, 2.74f)
                lineTo(21f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
        }.build()
        
        return _RotateCw!!
    }

private var _RotateCw: ImageVector? = null

