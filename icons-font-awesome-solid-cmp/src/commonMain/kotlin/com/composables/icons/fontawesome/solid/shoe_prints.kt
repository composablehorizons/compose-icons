package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShoePrints: ImageVector
    get() {
        if (_ShoePrints != null) return _ShoePrints!!
        
        _ShoePrints = ImageVector.Builder(
            name = "shoe-prints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 160f)
                horizontalLineToRelative(32f)
                verticalLineTo(32f)
                horizontalLineToRelative(-32f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                close()
                moveTo(0f, 416f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(32f)
                verticalLineTo(352f)
                horizontalLineTo(64f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                close()
                moveToRelative(337.46f, -128f)
                curveToRelative(-34.91f, 0f, -76.16f, 13.12f, -104.73f, 32f)
                curveToRelative(-24.79f, 16.38f, -44.52f, 32f, -104.73f, 32f)
                verticalLineToRelative(128f)
                lineToRelative(57.53f, 15.97f)
                curveToRelative(26.21f, 7.28f, 53.01f, 13.12f, 80.31f, 15.05f)
                curveToRelative(32.69f, 2.31f, 65.6f, 0.67f, 97.58f, -6.2f)
                curveTo(472.9f, 481.3f, 512f, 429.22f, 512f, 384f)
                curveToRelative(0f, -64f, -84.18f, -96f, -174.54f, -96f)
                close()
                moveTo(491.42f, 7.19f)
                curveTo(459.44f, 0.32f, 426.53f, -1.33f, 393.84f, 0.99f)
                curveToRelative(-27.3f, 1.93f, -54.1f, 7.77f, -80.31f, 15.04f)
                lineTo(256f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(60.2f, 0f, 79.94f, 15.62f, 104.73f, 32f)
                curveToRelative(28.57f, 18.88f, 69.82f, 32f, 104.73f, 32f)
                curveTo(555.82f, 224f, 640f, 192f, 640f, 128f)
                curveToRelative(0f, -45.22f, -39.1f, -97.3f, -148.58f, -120.81f)
                close()
            }
        }.build()
        
        return _ShoePrints!!
    }

private var _ShoePrints: ImageVector? = null

