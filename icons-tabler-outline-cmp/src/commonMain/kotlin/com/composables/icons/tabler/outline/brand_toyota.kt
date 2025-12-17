package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandToyota: ImageVector
    get() {
        if (_BrandToyota != null) return _BrandToyota!!
        
        _BrandToyota = ImageVector.Builder(
            name = "brand-toyota",
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
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 7f, 0f, true, false, 20f, 0f)
                arcToRelative(10f, 7f, 0f, true, false, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                curveToRelative(0f, 3.866f, 1.343f, 7f, 3f, 7f)
                reflectiveCurveToRelative(3f, -3.134f, 3f, -7f)
                reflectiveCurveToRelative(-1.343f, -7f, -3f, -7f)
                reflectiveCurveToRelative(-3f, 3.134f, -3f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.415f, 6.191f)
                curveToRelative(-0.888f, 0.503f, -1.415f, 1.13f, -1.415f, 1.809f)
                curveToRelative(0f, 1.657f, 3.134f, 3f, 7f, 3f)
                reflectiveCurveToRelative(7f, -1.343f, 7f, -3f)
                curveToRelative(0f, -0.678f, -0.525f, -1.304f, -1.41f, -1.806f)
            }
        }.build()
        
        return _BrandToyota!!
    }

private var _BrandToyota: ImageVector? = null

