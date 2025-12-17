package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Ring_volume: ImageVector
    get() {
        if (_Ring_volume != null) return _Ring_volume!!
        
        _Ring_volume = ImageVector.Builder(
            name = "ring_volume",
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
                moveTo(18.6f, 17.22f)
                curveToRelative(0.66f, 0.37f, 1.28f, 0.79f, 1.87f, 1.27f)
                lineToRelative(1.07f, -1.07f)
                curveToRelative(-0.91f, -0.75f, -1.9f, -1.38f, -2.94f, -1.9f)
                verticalLineToRelative(1.7f)
                close()
                moveTo(3.53f, 18.5f)
                curveToRelative(0.58f, -0.47f, 1.21f, -0.89f, 1.87f, -1.27f)
                verticalLineToRelative(-1.71f)
                curveToRelative(-1.05f, 0.51f, -2.03f, 1.15f, -2.95f, 1.9f)
                lineToRelative(1.08f, 1.08f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                curveTo(7.46f, 12f, 3.34f, 13.78f, 0.29f, 16.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                curveToRelative(0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.45f, -0.48f, 3f, -0.73f, 4.6f, -0.73f)
                curveToRelative(1.6f, 0f, 3.15f, 0.25f, 4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.7f)
                curveTo(20.66f, 13.78f, 16.54f, 12f, 12f, 12f)
                close()
                moveToRelative(-6.6f, 5.23f)
                curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f)
                lineToRelative(-1.07f, -1.07f)
                curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f)
                verticalLineToRelative(1.7f)
                close()
                moveToRelative(15.07f, 1.26f)
                curveToRelative(-0.59f, -0.48f, -1.21f, -0.9f, -1.87f, -1.27f)
                verticalLineToRelative(-1.7f)
                curveToRelative(1.04f, 0.51f, 2.03f, 1.15f, 2.94f, 1.9f)
                lineToRelative(-1.07f, 1.07f)
                close()
                moveTo(16.19f, 8.4f)
                lineToRelative(1.41f, 1.41f)
                reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.56f, 3.55f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(6.4f, 9.81f)
                lineTo(7.81f, 8.4f)
                lineTo(4.26f, 4.84f)
                lineTo(2.84f, 6.26f)
                curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f)
                close()
            }
        }.build()
        
        return _Ring_volume!!
    }

private var _Ring_volume: ImageVector? = null

