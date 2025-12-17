package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Connected_tv: ImageVector
    get() {
        if (_Connected_tv != null) return _Connected_tv!!
        
        _Connected_tv = ImageVector.Builder(
            name = "connected_tv",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 3f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                    lineTo(22f, 5f)
                    curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                    close()
                    moveTo(20f, 17f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(17f)
                    close()
                    moveTo(7f, 15.97f)
                    curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15.97f)
                    close()
                    moveTo(5.62f, 12.55f)
                    curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f)
                    curveTo(8.51f, 15.75f, 8.82f, 16f, 9.18f, 16f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.46f, 0f, 0.82f, -0.41f, 0.75f, -0.86f)
                    curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f)
                    curveTo(5.41f, 11f, 5f, 11.36f, 5f, 11.82f)
                    verticalLineToRelative(0f)
                    curveTo(5f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f)
                    close()
                    moveTo(5.64f, 9.53f)
                    curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f)
                    curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f)
                    curveToRelative(0.45f, 0f, 0.79f, -0.4f, 0.75f, -0.85f)
                    curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f)
                    curveTo(5.4f, 8f, 5f, 8.34f, 5f, 8.79f)
                    curveTo(5f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f)
                    close()
                }
            }
        }.build()
        
        return _Connected_tv!!
    }

private var _Connected_tv: ImageVector? = null

