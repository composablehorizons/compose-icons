package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HatCowboy: ImageVector
    get() {
        if (_HatCowboy != null) return _HatCowboy!!
        
        _HatCowboy = ImageVector.Builder(
            name = "hat-cowboy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(490f, 296.9f)
                curveTo(480.51f, 239.51f, 450.51f, 64f, 392.3f, 64f)
                curveToRelative(-14f, 0f, -26.49f, 5.93f, -37f, 14f)
                arcToRelative(58.21f, 58.21f, 0f, false, true, -70.58f, 0f)
                curveToRelative(-10.51f, -8f, -23f, -14f, -37f, -14f)
                curveToRelative(-58.2f, 0f, -88.2f, 175.47f, -97.71f, 232.88f)
                curveTo(188.81f, 309.47f, 243.73f, 320f, 320f, 320f)
                reflectiveCurveToRelative(131.23f, -10.51f, 170f, -23.1f)
                close()
                moveToRelative(142.9f, -37.18f)
                arcToRelative(16f, 16f, 0f, false, false, -19.75f, 1.5f)
                curveToRelative(-1f, 0.9f, -101.27f, 90.78f, -293.16f, 90.78f)
                curveToRelative(-190.82f, 0f, -292.22f, -89.94f, -293.24f, -90.84f)
                arcTo(16f, 16f, 0f, false, false, 1f, 278.53f)
                curveTo(1.73f, 280.55f, 78.32f, 480f, 320f, 480f)
                reflectiveCurveToRelative(318.27f, -199.45f, 319f, -201.47f)
                arcToRelative(16f, 16f, 0f, false, false, -6.09f, -18.81f)
                close()
            }
        }.build()
        
        return _HatCowboy!!
    }

private var _HatCowboy: ImageVector? = null

