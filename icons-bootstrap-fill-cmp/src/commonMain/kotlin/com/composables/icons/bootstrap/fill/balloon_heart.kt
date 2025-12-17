package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BalloonHeart: ImageVector
    get() {
        if (_BalloonHeart != null) return _BalloonHeart!!
        
        _BalloonHeart = ImageVector.Builder(
            name = "balloon-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.49f, 10.92f)
                curveTo(19.412f, 3.382f, 11.28f, -2.387f, 8f, 0.986f)
                curveTo(4.719f, -2.387f, -3.413f, 3.382f, 7.51f, 10.92f)
                lineToRelative(-0.234f, 0.468f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0.448f, 0.224f)
                lineToRelative(0.04f, -0.08f)
                curveToRelative(0.009f, 0.17f, 0.024f, 0.315f, 0.051f, 0.45f)
                curveToRelative(0.068f, 0.344f, 0.208f, 0.622f, 0.448f, 1.102f)
                lineToRelative(0.013f, 0.028f)
                curveToRelative(0.212f, 0.422f, 0.182f, 0.85f, 0.05f, 1.246f)
                curveToRelative(-0.135f, 0.402f, -0.366f, 0.751f, -0.534f, 1.003f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.416f, 0.278f)
                lineToRelative(0.004f, -0.007f)
                curveToRelative(0.166f, -0.248f, 0.431f, -0.646f, 0.588f, -1.115f)
                curveToRelative(0.16f, -0.479f, 0.212f, -1.051f, -0.076f, -1.629f)
                curveToRelative(-0.258f, -0.515f, -0.365f, -0.732f, -0.419f, -1.004f)
                arcToRelative(2f, 2f, 0f, false, true, -0.037f, -0.289f)
                lineToRelative(0.008f, 0.017f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0.448f, -0.224f)
                lineToRelative(-0.235f, -0.468f)
                close()
                moveTo(6.726f, 1.269f)
                curveToRelative(-1.167f, -0.61f, -2.8f, -0.142f, -3.454f, 1.135f)
                curveToRelative(-0.237f, 0.463f, -0.36f, 1.08f, -0.202f, 1.85f)
                curveToRelative(0.055f, 0.27f, 0.467f, 0.197f, 0.527f, -0.071f)
                curveToRelative(0.285f, -1.256f, 1.177f, -2.462f, 2.989f, -2.528f)
                curveToRelative(0.234f, -0.008f, 0.348f, -0.278f, 0.14f, -0.386f)
            }
        }.build()
        
        return _BalloonHeart!!
    }

private var _BalloonHeart: ImageVector? = null

