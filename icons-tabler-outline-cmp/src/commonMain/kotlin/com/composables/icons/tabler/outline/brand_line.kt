package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandLine: ImageVector
    get() {
        if (_BrandLine != null) return _BrandLine!!
        
        _BrandLine = ImageVector.Builder(
            name = "brand-line",
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
                moveTo(21f, 10.663f)
                curveToRelative(0f, -4.224f, -4.041f, -7.663f, -9f, -7.663f)
                reflectiveCurveToRelative(-9f, 3.439f, -9f, 7.663f)
                curveToRelative(0f, 3.783f, 3.201f, 6.958f, 7.527f, 7.56f)
                curveToRelative(1.053f, 0.239f, 0.932f, 0.644f, 0.696f, 2.133f)
                curveToRelative(-0.039f, 0.238f, -0.184f, 0.932f, 0.777f, 0.512f)
                curveToRelative(0.96f, -0.42f, 5.18f, -3.201f, 7.073f, -5.48f)
                curveToRelative(1.304f, -1.504f, 1.927f, -3.029f, 1.927f, -4.715f)
                verticalLineToRelative(-0.01f)
                close()
            }
        }.build()
        
        return _BrandLine!!
    }

private var _BrandLine: ImageVector? = null

