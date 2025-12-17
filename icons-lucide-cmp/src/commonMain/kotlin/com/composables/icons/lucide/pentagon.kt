package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
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
                moveTo(10.83f, 2.38f)
                arcToRelative(2f, 2f, 0f, false, true, 2.34f, 0f)
                lineToRelative(8f, 5.74f)
                arcToRelative(2f, 2f, 0f, false, true, 0.73f, 2.25f)
                lineToRelative(-3.04f, 9.26f)
                arcToRelative(2f, 2f, 0f, false, true, -1.9f, 1.37f)
                horizontalLineTo(7.04f)
                arcToRelative(2f, 2f, 0f, false, true, -1.9f, -1.37f)
                lineTo(2.1f, 10.37f)
                arcToRelative(2f, 2f, 0f, false, true, 0.73f, -2.25f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null

