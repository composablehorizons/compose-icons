package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDeno: ImageVector
    get() {
        if (_BrandDeno != null) return _BrandDeno!!
        
        _BrandDeno = ImageVector.Builder(
            name = "brand-deno",
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
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.47f, 20.882f)
                lineToRelative(-1.47f, -5.882f)
                curveToRelative(-2.649f, -0.088f, -5f, -1.624f, -5f, -3.5f)
                curveToRelative(0f, -1.933f, 2.239f, -3.5f, 5f, -3.5f)
                reflectiveCurveToRelative(4f, 1f, 5f, 3f)
                curveToRelative(0.024f, 0.048f, 0.69f, 2.215f, 2f, 6.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _BrandDeno!!
    }

private var _BrandDeno: ImageVector? = null

