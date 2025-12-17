package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Camera_outdoor: ImageVector
    get() {
        if (_Camera_outdoor != null) return _Camera_outdoor!!
        
        _Camera_outdoor = ImageVector.Builder(
            name = "camera_outdoor",
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
                    moveTo(18f, 13f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    lineToRelative(1.27f, 0.67f)
                    curveTo(19.6f, 16.85f, 20f, 16.61f, 20f, 16.23f)
                    verticalLineToRelative(-2.46f)
                    curveToRelative(0f, -0.38f, -0.4f, -0.62f, -0.73f, -0.44f)
                    lineTo(18f, 14f)
                    verticalLineTo(13f)
                    close()
                    moveTo(10.8f, 3.9f)
                    lineToRelative(-6f, 4.5f)
                    curveTo(4.3f, 8.78f, 4f, 9.37f, 4f, 10f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(13f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-9f)
                    lineToRelative(6f, -4.5f)
                    lineToRelative(6f, 4.5f)
                    lineToRelative(0f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                    lineToRelative(-6f, -4.5f)
                    curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                    close()
                }
            }
        }.build()
        
        return _Camera_outdoor!!
    }

private var _Camera_outdoor: ImageVector? = null

