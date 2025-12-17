package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandArc: ImageVector
    get() {
        if (_BrandArc != null) return _BrandArc!!
        
        _BrandArc = ImageVector.Builder(
            name = "brand-arc",
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
                moveTo(4.687f, 14.694f)
                lineToRelative(-0.987f, 2.103f)
                curveToRelative(-0.502f, 1.07f, -0.125f, 2.387f, 0.908f, 2.945f)
                curveToRelative(1.096f, 0.59f, 2.444f, 0.13f, 2.972f, -0.995f)
                lineToRelative(0.9f, -1.92f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.317f, 14.576f)
                curveToRelative(1.818f, -1.6f, 3.16f, -3.78f, 3.64f, -6.217f)
                curveToRelative(0.235f, -1.194f, -0.525f, -2.351f, -1.695f, -2.586f)
                arcToRelative(2.14f, 2.14f, 0f, false, false, -1.625f, 0.326f)
                curveToRelative(-0.478f, 0.323f, -0.81f, 0.826f, -0.922f, 1.398f)
                curveToRelative(-0.208f, 1.054f, -0.695f, 2.037f, -1.366f, 2.872f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.68f, 12.759f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, -1.283f, 0.157f)
                curveToRelative(-0.336f, 0f, -0.683f, -0.04f, -1.03f, -0.115f)
                curveToRelative(-1.44f, -0.31f, -2.89f, -1.215f, -3.709f, -2.315f)
                arcToRelative(3.7f, 3.7f, 0f, false, true, -0.487f, -0.853f)
                arcToRelative(2.157f, 2.157f, 0f, false, false, -2.818f, -1.213f)
                curveToRelative(-1.107f, 0.455f, -1.641f, 1.736f, -1.196f, 2.86f)
                curveToRelative(0.508f, 1.278f, 1.404f, 2.45f, 2.53f, 3.415f)
                arcToRelative(11.2f, 11.2f, 0f, false, false, 3.791f, 2.133f)
                curveToRelative(0.953f, 0.31f, 1.942f, 0.483f, 2.916f, 0.483f)
                arcToRelative(9.8f, 9.8f, 0f, false, false, 3.162f, -0.537f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.37f, 12.801f)
                lineToRelative(0.943f, -2.013f)
                curveToRelative(0.09f, -0.19f, 0.357f, -0.19f, 0.446f, 0f)
                lineToRelative(0.923f, 1.97f)
                horizontalLineToRelative(0.006f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(1.88f, 4.015f)
                lineToRelative(0.923f, 1.971f)
                arcToRelative(2.16f, 2.16f, 0f, false, false, 1.957f, 1.254f)
                quadToRelative(0.29f, 0f, 0.576f, -0.081f)
                curveToRelative(1.303f, -0.365f, 1.92f, -1.887f, 1.339f, -3.129f)
                lineToRelative(-1.04f, -2.218f)
                lineToRelative(-1.968f, -4.204f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(-2.862f, -6.112f)
                arcToRelative(2.16f, 2.16f, 0f, false, false, -1.954f, -1.254f)
                curveToRelative(-0.833f, 0f, -1.593f, 0.488f, -1.953f, 1.254f)
                lineToRelative(-2.92f, 6.232f)
            }
        }.build()
        
        return _BrandArc!!
    }

private var _BrandArc: ImageVector? = null

