package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Camera_indoor: ImageVector
    get() {
        if (_Camera_indoor != null) return _Camera_indoor!!
        
        _Camera_indoor = ImageVector.Builder(
            name = "camera_indoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.8f, 3.65f)
                    lineToRelative(-6f, 4.5f)
                    curveTo(4.3f, 8.53f, 4f, 9.12f, 4f, 9.75f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-9f)
                    curveToRelative(0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                    lineToRelative(-6f, -4.5f)
                    curveTo(12.49f, 3.12f, 11.51f, 3.12f, 10.8f, 3.65f)
                    close()
                    moveTo(15.27f, 15.67f)
                    lineTo(14f, 15f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    lineToRelative(1.27f, -0.67f)
                    curveTo(15.6f, 12.15f, 16f, 12.39f, 16f, 12.77f)
                    verticalLineToRelative(2.46f)
                    curveTo(16f, 15.61f, 15.6f, 15.85f, 15.27f, 15.67f)
                    close()
                }
            }
        }.build()
        
        return _Camera_indoor!!
    }

private var _Camera_indoor: ImageVector? = null

