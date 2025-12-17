package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Link_off: ImageVector
    get() {
        if (_Link_off != null) return _Link_off!!
        
        _Link_off = ImageVector.Builder(
            name = "link_off",
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
                    moveTo(14f, 9f)
                    horizontalLineToRelative(2.87f)
                    curveToRelative(1.46f, 0f, 2.8f, 0.98f, 3.08f, 2.42f)
                    curveToRelative(0.31f, 1.64f, -0.74f, 3.11f, -2.22f, 3.48f)
                    lineToRelative(1.53f, 1.53f)
                    curveToRelative(1.77f, -0.91f, 2.95f, -2.82f, 2.7f, -5.01f)
                    curveTo(21.68f, 8.86f, 19.37f, 7f, 16.79f, 7f)
                    horizontalLineTo(14f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveTo(13f, 8.55f, 13.45f, 9f, 14f, 9f)
                    close()
                    moveTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(2.64f, 2.64f)
                    curveToRelative(-1.77f, 0.91f, -2.95f, 2.82f, -2.7f, 5.01f)
                    curveTo(2.32f, 15.14f, 4.63f, 17f, 7.21f, 17f)
                    horizontalLineTo(10f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(7.13f)
                    curveToRelative(-1.46f, 0f, -2.8f, -0.98f, -3.08f, -2.42f)
                    curveTo(3.74f, 10.94f, 4.8f, 9.47f, 6.27f, 9.1f)
                    lineToRelative(2.12f, 2.12f)
                    curveTo(8.16f, 11.41f, 8f, 11.68f, 8f, 12f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1.17f)
                    lineToRelative(8.9f, 8.9f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    close()
                    moveTo(14f, 11f)
                    lineToRelative(1.71f, 1.71f)
                    curveTo(15.89f, 12.53f, 16f, 12.28f, 16f, 12f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Link_off!!
    }

private var _Link_off: ImageVector? = null

