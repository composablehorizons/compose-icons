package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGrindr: ImageVector
    get() {
        if (_BrandGrindr != null) return _BrandGrindr!!
        
        _BrandGrindr = ImageVector.Builder(
            name = "brand-grindr",
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
                moveTo(13f, 13.282f)
                curveToRelative(0f, 0.492f, 0.784f, 1.718f, 2.102f, 1.718f)
                curveToRelative(1.318f, 0f, 2.898f, -0.966f, 2.898f, -2.062f)
                curveToRelative(0f, -0.817f, -0.932f, -0.938f, -1.409f, -0.938f)
                curveToRelative(-0.228f, 0f, -3.591f, 0.111f, -3.591f, 1.282f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                curveToRelative(-2.984f, 0f, -6.471f, -2.721f, -6.63f, -2.982f)
                curveToRelative(-2.13f, -3.49f, -2.37f, -13.703f, -2.37f, -13.703f)
                lineToRelative(1.446f, -1.315f)
                curveToRelative(2.499f, 0.39f, 5.023f, 0.617f, 7.554f, 0.68f)
                arcToRelative(58.626f, 58.626f, 0f, false, false, 7.554f, -0.68f)
                lineToRelative(1.446f, 1.315f)
                reflectiveCurveToRelative(-0.24f, 10.213f, -2.37f, 13.704f)
                curveToRelative(-0.16f, 0.26f, -3.646f, 2.981f, -6.63f, 2.981f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13.282f)
                curveToRelative(0f, 0.492f, -0.784f, 1.718f, -2.102f, 1.718f)
                curveToRelative(-1.318f, 0f, -2.898f, -0.966f, -2.898f, -2.062f)
                curveToRelative(0f, -0.817f, 0.932f, -0.938f, 1.409f, -0.938f)
                curveToRelative(0.228f, 0f, 3.591f, 0.111f, 3.591f, 1.282f)
                close()
            }
        }.build()
        
        return _BrandGrindr!!
    }

private var _BrandGrindr: ImageVector? = null

