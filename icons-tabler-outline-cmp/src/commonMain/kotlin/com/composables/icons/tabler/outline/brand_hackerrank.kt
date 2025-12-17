package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandHackerrank: ImageVector
    get() {
        if (_BrandHackerrank != null) return _BrandHackerrank!!
        
        _BrandHackerrank = ImageVector.Builder(
            name = "brand-hackerrank",
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
                moveTo(19.484f, 5.667f)
                curveToRelative(-1.146f, -0.904f, -3.35f, -2.394f, -6.497f, -3.429f)
                curveToRelative(-0.484f, -0.159f, -0.725f, -0.238f, -1.04f, -0.238f)
                curveToRelative(-0.314f, 0f, -0.556f, 0.08f, -1.04f, 0.238f)
                curveToRelative(-3.147f, 1.035f, -5.35f, 2.525f, -6.496f, 3.43f)
                curveToRelative(-0.402f, 0.317f, -0.604f, 0.476f, -0.797f, 0.816f)
                curveToRelative(-0.194f, 0.341f, -0.233f, 0.62f, -0.309f, 1.178f)
                arcToRelative(33f, 33f, 0f, false, false, -0.305f, 4.338f)
                curveToRelative(0f, 1.742f, 0.165f, 3.317f, 0.305f, 4.338f)
                curveToRelative(0.076f, 0.558f, 0.115f, 0.837f, 0.309f, 1.178f)
                curveToRelative(0.193f, 0.34f, 0.395f, 0.5f, 0.797f, 0.817f)
                curveToRelative(1.146f, 0.904f, 3.35f, 2.394f, 6.497f, 3.429f)
                curveToRelative(0.483f, 0.159f, 0.725f, 0.238f, 1.04f, 0.238f)
                curveToRelative(0.314f, 0f, 0.555f, -0.08f, 1.04f, -0.238f)
                curveToRelative(3.146f, -1.035f, 5.35f, -2.525f, 6.496f, -3.43f)
                curveToRelative(0.402f, -0.317f, 0.603f, -0.476f, 0.797f, -0.816f)
                curveToRelative(0.194f, -0.341f, 0.232f, -0.62f, 0.309f, -1.178f)
                curveToRelative(0.14f, -1.021f, 0.305f, -2.596f, 0.305f, -4.338f)
                reflectiveCurveToRelative(-0.165f, -3.317f, -0.305f, -4.338f)
                curveToRelative(-0.077f, -0.558f, -0.115f, -0.837f, -0.309f, -1.178f)
                reflectiveCurveToRelative(-0.395f, -0.5f, -0.797f, -0.817f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                verticalLineToRelative(7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                horizontalLineToRelative(-2f)
                lineToRelative(1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                horizontalLineToRelative(2f)
                lineToRelative(-1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                verticalLineToRelative(7f)
            }
        }.build()
        
        return _BrandHackerrank!!
    }

private var _BrandHackerrank: ImageVector? = null

