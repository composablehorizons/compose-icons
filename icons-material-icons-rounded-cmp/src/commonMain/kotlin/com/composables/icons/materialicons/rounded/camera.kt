package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.81f, 2.86f)
                curveToRelative(0.17f, -0.3f, 0f, -0.7f, -0.35f, -0.74f)
                curveToRelative(-2.62f, -0.37f, -5.3f, 0.28f, -7.44f, 1.86f)
                curveToRelative(-0.19f, 0.15f, -0.25f, 0.43f, -0.12f, 0.65f)
                lineToRelative(3.01f, 5.22f)
                curveToRelative(0.19f, 0.33f, 0.67f, 0.33f, 0.87f, 0f)
                lineToRelative(4.03f, -6.99f)
                close()
                moveToRelative(7.49f, 5.47f)
                curveToRelative(-0.98f, -2.47f, -2.92f, -4.46f, -5.35f, -5.5f)
                curveToRelative(-0.23f, -0.1f, -0.5f, 0f, -0.63f, 0.22f)
                lineToRelative(-3.01f, 5.21f)
                curveToRelative(-0.19f, 0.32f, 0.05f, 0.74f, 0.44f, 0.74f)
                horizontalLineToRelative(8.08f)
                curveToRelative(0.35f, 0f, 0.6f, -0.35f, 0.47f, -0.67f)
                close()
                moveToRelative(0.07f, 1.67f)
                horizontalLineToRelative(-6.2f)
                curveToRelative(-0.38f, 0f, -0.63f, 0.42f, -0.43f, 0.75f)
                lineTo(19f, 18.14f)
                curveToRelative(0.17f, 0.3f, 0.6f, 0.35f, 0.82f, 0.08f)
                curveToRelative(1.74f, -2.18f, 2.48f, -5.03f, 2.05f, -7.79f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                close()
                moveTo(4.18f, 5.79f)
                curveToRelative(-1.73f, 2.19f, -2.48f, 5.02f, -2.05f, 7.79f)
                curveToRelative(0.03f, 0.24f, 0.25f, 0.42f, 0.5f, 0.42f)
                horizontalLineToRelative(6.2f)
                curveToRelative(0.38f, 0f, 0.63f, -0.42f, 0.43f, -0.75f)
                lineTo(5f, 5.87f)
                curveToRelative(-0.18f, -0.3f, -0.61f, -0.35f, -0.82f, -0.08f)
                close()
                moveTo(2.7f, 15.67f)
                curveToRelative(0.98f, 2.47f, 2.92f, 4.46f, 5.35f, 5.5f)
                curveToRelative(0.23f, 0.1f, 0.5f, 0f, 0.63f, -0.22f)
                lineToRelative(3.01f, -5.21f)
                curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.43f, -0.75f)
                horizontalLineTo(3.17f)
                curveToRelative(-0.35f, 0.01f, -0.6f, 0.36f, -0.47f, 0.68f)
                close()
                moveToRelative(7.83f, 6.22f)
                curveToRelative(2.62f, 0.37f, 5.3f, -0.28f, 7.44f, -1.86f)
                curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f)
                lineToRelative(-3.01f, -5.22f)
                curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0f)
                lineToRelative(-4.04f, 6.99f)
                curveToRelative(-0.17f, 0.3f, 0.01f, 0.7f, 0.35f, 0.75f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

