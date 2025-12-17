package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandEdge: ImageVector
    get() {
        if (_BrandEdge != null) return _BrandEdge!!
        
        _BrandEdge = ImageVector.Builder(
            name = "brand-edge",
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
                moveTo(20.978f, 11.372f)
                arcToRelative(9f, 9f, 0f, true, false, -1.593f, 5.773f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.978f, 11.372f)
                curveToRelative(0.21f, 2.993f, -5.034f, 2.413f, -6.913f, 1.486f)
                curveToRelative(1.392f, -1.6f, 0.402f, -4.038f, -2.274f, -3.851f)
                curveToRelative(-1.745f, 0.122f, -2.927f, 1.157f, -2.784f, 3.202f)
                curveToRelative(0.28f, 3.99f, 4.444f, 6.205f, 10.36f, 4.79f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.022f, 12.628f)
                curveToRelative(-0.283f, -4.043f, 8.717f, -7.228f, 11.248f, -2.688f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.628f, 20.978f)
                curveToRelative(-2.993f, 0.21f, -5.162f, -4.725f, -3.567f, -9.748f)
            }
        }.build()
        
        return _BrandEdge!!
    }

private var _BrandEdge: ImageVector? = null

