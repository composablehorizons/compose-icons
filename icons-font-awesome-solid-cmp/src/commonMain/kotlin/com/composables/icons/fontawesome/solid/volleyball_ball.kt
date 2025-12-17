package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VolleyballBall: ImageVector
    get() {
        if (_VolleyballBall != null) return _VolleyballBall!!
        
        _VolleyballBall = ImageVector.Builder(
            name = "volleyball-ball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(231.39f, 243.48f)
                arcToRelative(285.56f, 285.56f, 0f, false, false, -22.7f, -105.7f)
                curveToRelative(-90.8f, 42.4f, -157.5f, 122.4f, -180.3f, 216.8f)
                arcToRelative(249f, 249f, 0f, false, false, 56.9f, 81.1f)
                arcToRelative(333.87f, 333.87f, 0f, false, true, 146.1f, -192.2f)
                close()
                moveToRelative(-36.9f, -134.4f)
                arcToRelative(284.23f, 284.23f, 0f, false, false, -57.4f, -70.7f)
                curveToRelative(-91f, 49.8f, -144.8f, 152.9f, -125f, 262.2f)
                curveToRelative(33.4f, -83.1f, 98.4f, -152f, 182.4f, -191.5f)
                close()
                moveToRelative(187.6f, 165.1f)
                curveToRelative(8.6f, -99.8f, -27.3f, -197.5f, -97.5f, -264.4f)
                curveToRelative(-14.7f, -1.7f, -51.6f, -5.5f, -98.9f, 8.5f)
                arcTo(333.87f, 333.87f, 0f, false, true, 279.19f, 241f)
                arcToRelative(285f, 285f, 0f, false, false, 102.9f, 33.18f)
                close()
                moveToRelative(-124.7f, 9.5f)
                arcToRelative(286.33f, 286.33f, 0f, false, false, -80.2f, 72.6f)
                curveToRelative(82f, 57.3f, 184.5f, 75.1f, 277.5f, 47.8f)
                arcToRelative(247.15f, 247.15f, 0f, false, false, 42.2f, -89.9f)
                arcToRelative(336.1f, 336.1f, 0f, false, true, -80.9f, 10.4f)
                curveToRelative(-54.6f, -0.1f, -108.9f, -14.1f, -158.6f, -40.9f)
                close()
                moveToRelative(-98.3f, 99.7f)
                curveToRelative(-15.2f, 26f, -25.7f, 54.4f, -32.1f, 84.2f)
                arcToRelative(247.07f, 247.07f, 0f, false, false, 289f, -22.1f)
                curveToRelative(-112.9f, 16.1f, -203.3f, -24.8f, -256.9f, -62.1f)
                close()
                moveToRelative(180.3f, -360.6f)
                curveToRelative(55.3f, 70.4f, 82.5f, 161.2f, 74.6f, 253.6f)
                arcToRelative(286.59f, 286.59f, 0f, false, false, 89.7f, -14.2f)
                curveToRelative(0f, -2f, 0.3f, -4f, 0.3f, -6f)
                curveToRelative(0f, -107.8f, -68.7f, -199.1f, -164.6f, -233.4f)
                close()
            }
        }.build()
        
        return _VolleyballBall!!
    }

private var _VolleyballBall: ImageVector? = null

