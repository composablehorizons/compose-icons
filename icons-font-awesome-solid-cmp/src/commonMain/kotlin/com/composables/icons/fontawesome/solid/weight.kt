package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Weight: ImageVector
    get() {
        if (_Weight != null) return _Weight!!
        
        _Weight = ImageVector.Builder(
            name = "weight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 64f)
                horizontalLineToRelative(-25.98f)
                curveTo(438.44f, 92.28f, 448f, 125.01f, 448f, 160f)
                curveToRelative(0f, 105.87f, -86.13f, 192f, -192f, 192f)
                reflectiveCurveTo(64f, 265.87f, 64f, 160f)
                curveToRelative(0f, -34.99f, 9.56f, -67.72f, 25.98f, -96f)
                horizontalLineTo(64f)
                curveTo(28.71f, 64f, 0f, 92.71f, 0f, 128f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 35.29f, 28.71f, 64f, 64f, 64f)
                horizontalLineToRelative(384f)
                curveToRelative(35.29f, 0f, 64f, -28.71f, 64f, -64f)
                verticalLineTo(128f)
                curveToRelative(0f, -35.29f, -28.71f, -64f, -64f, -64f)
                close()
                moveTo(256f, 320f)
                curveToRelative(88.37f, 0f, 160f, -71.63f, 160f, -160f)
                reflectiveCurveTo(344.37f, 0f, 256f, 0f)
                reflectiveCurveTo(96f, 71.63f, 96f, 160f)
                reflectiveCurveToRelative(71.63f, 160f, 160f, 160f)
                close()
                moveToRelative(-0.3f, -151.94f)
                lineToRelative(33.58f, -78.36f)
                curveToRelative(3.5f, -8.17f, 12.94f, -11.92f, 21.03f, -8.41f)
                curveToRelative(8.12f, 3.48f, 11.88f, 12.89f, 8.41f, 21f)
                lineToRelative(-33.67f, 78.55f)
                curveTo(291.73f, 188f, 296f, 197.45f, 296f, 208f)
                curveToRelative(0f, 22.09f, -17.91f, 40f, -40f, 40f)
                reflectiveCurveToRelative(-40f, -17.91f, -40f, -40f)
                curveToRelative(0f, -21.98f, 17.76f, -39.77f, 39.7f, -39.94f)
                close()
            }
        }.build()
        
        return _Weight!!
    }

private var _Weight: ImageVector? = null

