package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandNeteaseMusic: ImageVector
    get() {
        if (_BrandNeteaseMusic != null) return _BrandNeteaseMusic!!
        
        _BrandNeteaseMusic = ImageVector.Builder(
            name = "brand-netease-music",
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
                moveTo(9f, 4f)
                curveToRelative(-2.93f, 1.346f, -5f, 5.046f, -5f, 8.492f)
                curveToRelative(0f, 4.508f, 4f, 7.508f, 8f, 7.508f)
                reflectiveCurveToRelative(8f, -3f, 8f, -7f)
                curveToRelative(0f, -3.513f, -3.5f, -5.513f, -6f, -5.513f)
                reflectiveCurveToRelative(-5f, 1.513f, -5f, 4.513f)
                curveToRelative(0f, 2f, 1.5f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1f, 3f, -3f)
                curveToRelative(0f, -3.513f, -2f, -4.508f, -2f, -6.515f)
                curveToRelative(0f, -3.504f, 3.5f, -2.603f, 4f, -1.502f)
            }
        }.build()
        
        return _BrandNeteaseMusic!!
    }

private var _BrandNeteaseMusic: ImageVector? = null

