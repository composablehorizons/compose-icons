package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Alt_route: ImageVector
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
                    moveTo(11f, 6f)
                    lineTo(7f, 2f)
                    lineTo(3f, 6f)
                    horizontalLineToRelative(3.02f)
                    curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f)
                    lineToRelative(1.94f, -0.49f)
                    curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(21f, 6f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(-4f, 4f)
                    horizontalLineToRelative(2.99f)
                    curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f)
                    curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f)
                    curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f)
                    lineTo(9.46f, 13.6f)
                    curveTo(10.39f, 14.45f, 11f, 15.14f, 11f, 17f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineToRelative(0f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-5f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    curveToRelative(0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f)
                    curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f)
                    horizontalLineTo(21f)
                    close()
                }
            }
        }.build()
        
        return _Alt_route!!
    }

private var _Alt_route: ImageVector? = null

