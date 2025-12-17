package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandZalando: ImageVector
    get() {
        if (_BrandZalando != null) return _BrandZalando!!
        
        _BrandZalando = ImageVector.Builder(
            name = "brand-zalando",
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
                moveTo(7.531f, 21f)
                curveToRelative(-0.65f, 0f, -1f, -0.15f, -1.196f, -0.27f)
                curveToRelative(-0.266f, -0.157f, -0.753f, -0.563f, -1.197f, -1.747f)
                arcToRelative(20.583f, 20.583f, 0f, false, true, -1.137f, -6.983f)
                curveToRelative(0.015f, -2.745f, 0.436f, -5.07f, 1.137f, -6.975f)
                curveToRelative(0.444f, -1.2f, 0.93f, -1.605f, 1.197f, -1.763f)
                curveToRelative(0.192f, -0.103f, 0.545f, -0.262f, 1.195f, -0.262f)
                curveToRelative(0.244f, 0f, 0.532f, 0.022f, 0.871f, 0.075f)
                arcToRelative(19.093f, 19.093f, 0f, false, true, 6.425f, 2.475f)
                horizontalLineToRelative(0.007f)
                arcToRelative(19.572f, 19.572f, 0f, false, true, 5.287f, 4.508f)
                curveToRelative(0.783f, 0.99f, 0.879f, 1.627f, 0.879f, 1.942f)
                curveToRelative(0f, 0.315f, -0.096f, 0.953f, -0.879f, 1.943f)
                arcToRelative(19.571f, 19.571f, 0f, false, true, -5.287f, 4.5f)
                horizontalLineToRelative(-0.007f)
                arcToRelative(19.041f, 19.041f, 0f, false, true, -6.425f, 2.474f)
                arcToRelative(5.01f, 5.01f, 0f, false, true, -0.871f, 0.083f)
                close()
            }
        }.build()
        
        return _BrandZalando!!
    }

private var _BrandZalando: ImageVector? = null

