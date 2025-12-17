package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SuitHeart: ImageVector
    get() {
        if (_SuitHeart != null) return _SuitHeart!!
        
        _SuitHeart = ImageVector.Builder(
            name = "suit-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6.236f)
                lineToRelative(-0.894f, -1.789f)
                curveToRelative(-0.222f, -0.443f, -0.607f, -1.08f, -1.152f, -1.595f)
                curveTo(5.418f, 2.345f, 4.776f, 2f, 4f, 2f)
                curveTo(2.324f, 2f, 1f, 3.326f, 1f, 4.92f)
                curveToRelative(0f, 1.211f, 0.554f, 2.066f, 1.868f, 3.37f)
                curveToRelative(0.337f, 0.334f, 0.721f, 0.695f, 1.146f, 1.093f)
                curveTo(5.122f, 10.423f, 6.5f, 11.717f, 8f, 13.447f)
                curveToRelative(1.5f, -1.73f, 2.878f, -3.024f, 3.986f, -4.064f)
                curveToRelative(0.425f, -0.398f, 0.81f, -0.76f, 1.146f, -1.093f)
                curveTo(14.446f, 6.986f, 15f, 6.131f, 15f, 4.92f)
                curveTo(15f, 3.326f, 13.676f, 2f, 12f, 2f)
                curveToRelative(-0.777f, 0f, -1.418f, 0.345f, -1.954f, 0.852f)
                curveToRelative(-0.545f, 0.515f, -0.93f, 1.152f, -1.152f, 1.595f)
                close()
                moveToRelative(0.392f, 8.292f)
                arcToRelative(0.513f, 0.513f, 0f, false, true, -0.784f, 0f)
                curveToRelative(-1.601f, -1.902f, -3.05f, -3.262f, -4.243f, -4.381f)
                curveTo(1.3f, 8.208f, 0f, 6.989f, 0f, 4.92f)
                curveTo(0f, 2.755f, 1.79f, 1f, 4f, 1f)
                curveToRelative(1.6f, 0f, 2.719f, 1.05f, 3.404f, 2.008f)
                curveToRelative(0.26f, 0.365f, 0.458f, 0.716f, 0.596f, 0.992f)
                arcToRelative(7.6f, 7.6f, 0f, false, true, 0.596f, -0.992f)
                curveTo(9.281f, 2.049f, 10.4f, 1f, 12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.755f, 4f, 3.92f)
                curveToRelative(0f, 2.069f, -1.3f, 3.288f, -3.365f, 5.227f)
                curveToRelative(-1.193f, 1.12f, -2.642f, 2.48f, -4.243f, 4.38f)
                close()
            }
        }.build()
        
        return _SuitHeart!!
    }

private var _SuitHeart: ImageVector? = null

