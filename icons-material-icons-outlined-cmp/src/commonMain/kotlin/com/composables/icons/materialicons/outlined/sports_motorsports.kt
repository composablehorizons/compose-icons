package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sports_motorsports: ImageVector
    get() {
        if (_Sports_motorsports != null) return _Sports_motorsports!!
        
        _Sports_motorsports = ImageVector.Builder(
            name = "sports_motorsports",
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
                    moveTo(21.96f, 11.22f)
                    curveTo(21.57f, 7.01f, 17.76f, 4f, 13.56f, 4f)
                    curveToRelative(-0.19f, 0f, -0.38f, 0.01f, -0.57f, 0.02f)
                    curveTo(2f, 4.74f, 2f, 17.2f, 2f, 17.2f)
                    verticalLineTo(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveTo(18.67f, 20f, 22.41f, 15.99f, 21.96f, 11.22f)
                    close()
                    moveTo(5.26f, 11.56f)
                    curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f)
                    lineToRelative(3.62f, 1.53f)
                    curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f)
                    curveToRelative(0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f)
                    horizontalLineTo(4.72f)
                    curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f)
                    close()
                    moveTo(18.44f, 16.04f)
                    curveTo(17.3f, 17.29f, 15.68f, 18f, 14f, 18f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-0.8f)
                    curveToRelative(0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f)
                    horizontalLineToRelative(6.15f)
                    curveToRelative(1.99f, 0f, 3.61f, -1.62f, 3.61f, -3.61f)
                    curveToRelative(0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f)
                    lineTo(9.3f, 7.01f)
                    curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f)
                    curveTo(13.27f, 6f, 13.42f, 6f, 13.56f, 6f)
                    curveToRelative(3.31f, 0f, 6.13f, 2.37f, 6.41f, 5.41f)
                    curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f)
                    close()
                }
            }
        }.build()
        
        return _Sports_motorsports!!
    }

private var _Sports_motorsports: ImageVector? = null

