package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
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
                moveTo(4f, 22f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.4f, -0.8f)
                arcTo(6f, 6f, 0f, false, true, 8f, 2f)
                curveToRelative(3f, 0f, 5f, 2f, 7.333f, 2f)
                quadToRelative(2f, 0f, 3.067f, -0.8f)
                arcTo(1f, 1f, 0f, false, true, 20f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -0.4f, 0.8f)
                arcTo(6f, 6f, 0f, false, true, 16f, 16f)
                curveToRelative(-3f, 0f, -5f, -2f, -8f, -2f)
                arcToRelative(6f, 6f, 0f, false, false, -4f, 1.528f)
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

