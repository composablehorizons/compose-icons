package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSupernova: ImageVector
    get() {
        if (_BrandSupernova != null) return _BrandSupernova!!
        
        _BrandSupernova = ImageVector.Builder(
            name = "brand-supernova",
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
                moveTo(12f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.038f, 0f, 5.5f, -1.343f, 5.5f, -3f)
                reflectiveCurveToRelative(-2.462f, -3f, -5.5f, -3f)
                curveToRelative(-1.836f, 0f, -3.462f, 0.49f, -4.46f, 1.245f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.038f, 0f, -5.5f, 1.343f, -5.5f, 3f)
                reflectiveCurveToRelative(2.462f, 3f, 5.5f, 3f)
                curveToRelative(1.844f, 0f, 3.476f, -0.495f, 4.474f, -1.255f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -3.038f, -1.343f, -5.5f, -3f, -5.5f)
                reflectiveCurveToRelative(-3f, 2.462f, -3f, 5.5f)
                curveToRelative(0f, 1.833f, 0.49f, 3.457f, 1.241f, 4.456f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 3.038f, 1.343f, 5.5f, 3f, 5.5f)
                reflectiveCurveToRelative(3f, -2.462f, 3f, -5.5f)
                curveToRelative(0f, -1.842f, -0.494f, -3.472f, -1.252f, -4.47f)
            }
        }.build()
        
        return _BrandSupernova!!
    }

private var _BrandSupernova: ImageVector? = null

