package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Radical: ImageVector
    get() {
        if (_Radical != null) return _Radical!!
        
        _Radical = ImageVector.Builder(
            name = "radical",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(3.28f)
                arcToRelative(1f, 1f, 0f, false, true, 0.948f, 0.684f)
                lineToRelative(2.298f, 7.934f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.96f, -0.044f)
                lineTo(13.82f, 4.771f)
                arcTo(1f, 1f, 0f, false, true, 14.792f, 4f)
                horizontalLineTo(21f)
            }
        }.build()
        
        return _Radical!!
    }

private var _Radical: ImageVector? = null

