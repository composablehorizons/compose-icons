package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TriangleRight: ImageVector
    get() {
        if (_TriangleRight != null) return _TriangleRight!!
        
        _TriangleRight = ImageVector.Builder(
            name = "triangle-right",
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
                moveTo(22f, 18f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -1.3f, -0.6f, -0.4f, -1.3f)
                lineTo(20.4f, 4.3f)
                curveToRelative(0.9f, -0.7f, 1.6f, -0.4f, 1.6f, 0.7f)
                close()
            }
        }.build()
        
        return _TriangleRight!!
    }

private var _TriangleRight: ImageVector? = null

