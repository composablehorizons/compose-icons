package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDrupal: ImageVector
    get() {
        if (_BrandDrupal != null) return _BrandDrupal!!
        
        _BrandDrupal = ImageVector.Builder(
            name = "brand-drupal",
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
                moveTo(12f, 2f)
                curveToRelative(0f, 4.308f, -7f, 6f, -7f, 12f)
                arcToRelative(7f, 7f, 0f, false, false, 14f, 0f)
                curveToRelative(0f, -6f, -7f, -7.697f, -7f, -12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11.33f)
                arcToRelative(65.753f, 65.753f, 0f, false, true, -2.012f, 2.023f)
                curveToRelative(-1f, 0.957f, -1.988f, 1.967f, -1.988f, 3.647f)
                curveToRelative(0f, 2.17f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.827f, 4f, -4f)
                curveToRelative(0f, -1.676f, -0.989f, -2.685f, -1.983f, -3.642f)
                curveToRelative(-0.42f, -0.404f, -2.259f, -2.357f, -5.517f, -5.858f)
                lineToRelative(3.5f, 3.83f)
                close()
            }
        }.build()
        
        return _BrandDrupal!!
    }

private var _BrandDrupal: ImageVector? = null

