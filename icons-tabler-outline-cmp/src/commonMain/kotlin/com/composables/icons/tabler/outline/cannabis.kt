package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cannabis: ImageVector
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
                moveTo(7f, 20f)
                reflectiveCurveToRelative(0f, -2f, 1f, -3.5f)
                curveToRelative(-1.5f, 0f, -2f, -0.5f, -4f, -1.5f)
                curveToRelative(0f, 0f, 1.839f, -1.38f, 5f, -1f)
                curveToRelative(-1.789f, -0.97f, -3.279f, -2.03f, -5f, -6f)
                curveToRelative(0f, 0f, 3.98f, -0.3f, 6.5f, 3.5f)
                curveToRelative(-2.284f, -4.9f, 1.5f, -9.5f, 1.5f, -9.5f)
                curveToRelative(2.734f, 5.47f, 2.389f, 7.5f, 1.5f, 9.5f)
                curveToRelative(2.531f, -3.77f, 6.5f, -3.5f, 6.5f, -3.5f)
                curveToRelative(-1.721f, 3.97f, -3.211f, 5.03f, -5f, 6f)
                curveToRelative(3.161f, -0.38f, 5f, 1f, 5f, 1f)
                curveToRelative(-2f, 1f, -2.5f, 1.5f, -4f, 1.5f)
                curveToRelative(1f, 1.5f, 1f, 3.5f, 1f, 3.5f)
                curveToRelative(-2f, 0f, -4.438f, -2.22f, -5f, -3f)
                curveToRelative(-0.563f, 0.78f, -3f, 3f, -5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineToRelative(-5f)
            }
        }.build()
        
        return _Cannabis!!
    }

private var _Cannabis: ImageVector? = null

