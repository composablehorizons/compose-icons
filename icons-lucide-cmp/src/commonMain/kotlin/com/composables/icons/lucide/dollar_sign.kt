package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DollarSign: ImageVector
    get() {
        if (_DollarSign != null) return _DollarSign!!
        
        _DollarSign = ImageVector.Builder(
            name = "dollar-sign",
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
                lineTo(12f, 22f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5f)
                horizontalLineTo(9.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                horizontalLineToRelative(5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineTo(6f)
            }
        }.build()
        
        return _DollarSign!!
    }

private var _DollarSign: ImageVector? = null

