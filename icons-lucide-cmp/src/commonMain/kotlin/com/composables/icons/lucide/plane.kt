package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Plane: ImageVector
    get() {
        if (_Plane != null) return _Plane!!
        
        _Plane = ImageVector.Builder(
            name = "plane",
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
                moveTo(17.8f, 19.2f)
                lineTo(16f, 11f)
                lineToRelative(3.5f, -3.5f)
                curveTo(21f, 6f, 21.5f, 4f, 21f, 3f)
                curveToRelative(-1f, -0.5f, -3f, 0f, -4.5f, 1.5f)
                lineTo(13f, 8f)
                lineTo(4.8f, 6.2f)
                curveToRelative(-0.5f, -0.1f, -0.9f, 0.1f, -1.1f, 0.5f)
                lineToRelative(-0.3f, 0.5f)
                curveToRelative(-0.2f, 0.5f, -0.1f, 1f, 0.3f, 1.3f)
                lineTo(9f, 12f)
                lineToRelative(-2f, 3f)
                horizontalLineTo(4f)
                lineToRelative(-1f, 1f)
                lineToRelative(3f, 2f)
                lineToRelative(2f, 3f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(3.5f, 5.3f)
                curveToRelative(0.3f, 0.4f, 0.8f, 0.5f, 1.3f, 0.3f)
                lineToRelative(0.5f, -0.2f)
                curveToRelative(0.4f, -0.3f, 0.6f, -0.7f, 0.5f, -1.2f)
                close()
            }
        }.build()
        
        return _Plane!!
    }

private var _Plane: ImageVector? = null

