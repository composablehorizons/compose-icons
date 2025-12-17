package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) return _Cannabis!!
        
        _Cannabis = ImageVector.Builder(
            name = "cannabis",
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
                moveTo(12f, 22f)
                verticalLineToRelative(-4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                curveToRelative(-1.5f, 0f, -4.5f, 1.5f, -5f, 3f)
                curveToRelative(3.5f, 1.5f, 6f, 1f, 6f, 1f)
                curveToRelative(-1.5f, 1.5f, -2f, 3.5f, -2f, 5f)
                curveToRelative(2.5f, 0f, 4.5f, -1.5f, 6f, -3f)
                curveToRelative(1.5f, 1.5f, 3.5f, 3f, 6f, 3f)
                curveToRelative(0f, -1.5f, -0.5f, -3.5f, -2f, -5f)
                curveToRelative(0f, 0f, 2.5f, 0.5f, 6f, -1f)
                curveToRelative(-0.5f, -1.5f, -3.5f, -3f, -5f, -3f)
                curveToRelative(1.5f, -1f, 4f, -4f, 4f, -6f)
                curveToRelative(-2.5f, 0f, -5.5f, 1.5f, -7f, 3f)
                curveToRelative(0f, -2.5f, -0.5f, -5f, -2f, -7f)
                curveToRelative(-1.5f, 2f, -2f, 4.5f, -2f, 7f)
                curveToRelative(-1.5f, -1.5f, -4.5f, -3f, -7f, -3f)
                curveToRelative(0f, 2f, 2.5f, 5f, 4f, 6f)
            }
        }.build()
        
        return _Cannabis!!
    }

private var _Cannabis: ImageVector? = null

