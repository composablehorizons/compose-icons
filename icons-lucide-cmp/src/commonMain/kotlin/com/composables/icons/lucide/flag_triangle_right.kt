package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlagTriangleRight: ImageVector
    get() {
        if (_FlagTriangleRight != null) return _FlagTriangleRight!!
        
        _FlagTriangleRight = ImageVector.Builder(
            name = "flag-triangle-right",
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
                moveTo(6f, 22f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 1.17f, -0.71f)
                lineToRelative(11.38f, 5.69f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0f, 1.44f)
                lineTo(6f, 15.5f)
            }
        }.build()
        
        return _FlagTriangleRight!!
    }

private var _FlagTriangleRight: ImageVector? = null

