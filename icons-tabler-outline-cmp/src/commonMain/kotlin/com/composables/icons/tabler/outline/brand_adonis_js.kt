package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAdonisJs: ImageVector
    get() {
        if (_BrandAdonisJs != null) return _BrandAdonisJs!!
        
        _BrandAdonisJs = ImageVector.Builder(
            name = "brand-adonis-js",
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
                moveTo(12f, 3f)
                curveToRelative(7.2f, 0f, 9f, 1.8f, 9f, 9f)
                reflectiveCurveToRelative(-1.8f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -1.8f, -9f, -9f)
                reflectiveCurveToRelative(1.8f, -9f, 9f, -9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.863f, 16.922f)
                curveToRelative(1.137f, -0.422f, 1.637f, -0.922f, 3.137f, -0.922f)
                reflectiveCurveToRelative(2f, 0.5f, 3.138f, 0.922f)
                curveToRelative(0.713f, 0.264f, 1.516f, -0.102f, 1.778f, -0.772f)
                curveToRelative(0.126f, -0.32f, 0.11f, -0.673f, -0.044f, -0.983f)
                lineToRelative(-3.708f, -7.474f)
                curveToRelative(-0.297f, -0.598f, -1.058f, -0.859f, -1.7f, -0.583f)
                arcToRelative(1.24f, 1.24f, 0f, false, false, -0.627f, 0.583f)
                lineToRelative(-3.709f, 7.474f)
                curveToRelative(-0.321f, 0.648f, -0.017f, 1.415f, 0.679f, 1.714f)
                curveToRelative(0.332f, 0.143f, 0.715f, 0.167f, 1.056f, 0.04f)
                close()
            }
        }.build()
        
        return _BrandAdonisJs!!
    }

private var _BrandAdonisJs: ImageVector? = null

