package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Alt_route: ImageVector
    get() {
        if (_Alt_route != null) return _Alt_route!!
        
        _Alt_route = ImageVector.Builder(
            name = "alt_route",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9.78f, 11.16f)
                    lineToRelative(-1.42f, 1.42f)
                    curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f)
                    lineToRelative(1.94f, -0.49f)
                    curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f)
                    close()
                    moveTo(10.15f, 5.15f)
                    lineTo(7.35f, 2.35f)
                    curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                    lineTo(3.85f, 5.15f)
                    curveTo(3.54f, 5.46f, 3.76f, 6f, 4.21f, 6f)
                    horizontalLineToRelative(1.81f)
                    curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f)
                    lineToRelative(1.94f, -0.49f)
                    curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6f)
                    horizontalLineToRelative(1.78f)
                    curveTo(10.24f, 6f, 10.46f, 5.46f, 10.15f, 5.15f)
                    close()
                    moveTo(20.15f, 5.15f)
                    lineToRelative(-2.79f, -2.79f)
                    curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                    lineToRelative(-2.79f, 2.79f)
                    curveTo(13.54f, 5.46f, 13.76f, 6f, 14.21f, 6f)
                    horizontalLineToRelative(1.78f)
                    curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f)
                    curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f)
                    curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f)
                    lineTo(9.46f, 13.6f)
                    curveTo(10.39f, 14.45f, 11f, 15.14f, 11f, 17f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineToRelative(0f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    curveToRelative(0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f)
                    curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f)
                    horizontalLineToRelative(1.8f)
                    curveTo(20.24f, 6f, 20.46f, 5.46f, 20.15f, 5.15f)
                    close()
                }
            }
        }.build()
        
        return _Alt_route!!
    }

private var _Alt_route: ImageVector? = null

