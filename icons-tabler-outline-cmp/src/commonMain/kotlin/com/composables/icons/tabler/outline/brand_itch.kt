package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandItch: ImageVector
    get() {
        if (_BrandItch != null) return _BrandItch!!
        
        _BrandItch = ImageVector.Builder(
            name = "brand-itch",
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
                moveTo(2f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.087f, 1.078f, 2f, 2f, 2f)
                curveToRelative(1.107f, 0f, 2f, -0.91f, 2f, -2f)
                curveToRelative(0f, 1.09f, 0.893f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.91f, 2f, -2f)
                curveToRelative(0f, 1.09f, 0.893f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.91f, 2f, -2f)
                curveToRelative(0f, 1.09f, 0.893f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.91f, 2f, -2f)
                curveToRelative(0f, 1.09f, 0.893f, 2f, 2f, 2f)
                curveToRelative(0.922f, 0f, 2f, -0.913f, 2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.009f, -0.275f, -0.538f, -0.964f, -1.588f, -2.068f)
                arcToRelative(3f, 3f, 0f, false, false, -2.174f, -0.932f)
                horizontalLineToRelative(-12.476f)
                arcToRelative(3f, 3f, 0f, false, false, -2.174f, 0.932f)
                curveToRelative(-1.05f, 1.104f, -1.58f, 1.793f, -1.588f, 2.068f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 10f)
                curveToRelative(-0.117f, 6.28f, 0.154f, 9.765f, 0.814f, 10.456f)
                curveToRelative(1.534f, 0.367f, 4.355f, 0.535f, 7.186f, 0.536f)
                curveToRelative(2.83f, -0.001f, 5.652f, -0.169f, 7.186f, -0.536f)
                curveToRelative(0.99f, -1.037f, 0.898f, -9.559f, 0.814f, -10.456f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _BrandItch!!
    }

private var _BrandItch: ImageVector? = null

