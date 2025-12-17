package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandReact: ImageVector
    get() {
        if (_BrandReact != null) return _BrandReact!!
        
        _BrandReact = ImageVector.Builder(
            name = "brand-react",
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
                moveTo(6.306f, 8.711f)
                curveToRelative(-2.602f, 0.723f, -4.306f, 1.926f, -4.306f, 3.289f)
                curveToRelative(0f, 2.21f, 4.477f, 4f, 10f, 4f)
                curveToRelative(0.773f, 0f, 1.526f, -0.035f, 2.248f, -0.102f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.692f, 15.289f)
                curveToRelative(2.603f, -0.722f, 4.308f, -1.926f, 4.308f, -3.289f)
                curveToRelative(0f, -2.21f, -4.477f, -4f, -10f, -4f)
                curveToRelative(-0.773f, 0f, -1.526f, 0.035f, -2.25f, 0.102f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.305f, 15.287f)
                curveToRelative(-0.676f, 2.615f, -0.485f, 4.693f, 0.695f, 5.373f)
                curveToRelative(1.913f, 1.105f, 5.703f, -1.877f, 8.464f, -6.66f)
                curveToRelative(0.387f, -0.67f, 0.733f, -1.339f, 1.036f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.694f, 8.716f)
                curveToRelative(0.677f, -2.616f, 0.487f, -4.696f, -0.694f, -5.376f)
                curveToRelative(-1.913f, -1.105f, -5.703f, 1.877f, -8.464f, 6.66f)
                curveToRelative(-0.387f, 0.67f, -0.733f, 1.34f, -1.037f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.424f)
                curveToRelative(-1.925f, -1.892f, -3.82f, -2.766f, -5f, -2.084f)
                curveToRelative(-1.913f, 1.104f, -1.226f, 5.877f, 1.536f, 10.66f)
                curveToRelative(0.386f, 0.67f, 0.793f, 1.304f, 1.212f, 1.896f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18.574f)
                curveToRelative(1.926f, 1.893f, 3.821f, 2.768f, 5f, 2.086f)
                curveToRelative(1.913f, -1.104f, 1.226f, -5.877f, -1.536f, -10.66f)
                curveToRelative(-0.375f, -0.65f, -0.78f, -1.283f, -1.212f, -1.897f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 12.866f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, -1.732f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1.732f)
                close()
            }
        }.build()
        
        return _BrandReact!!
    }

private var _BrandReact: ImageVector? = null

