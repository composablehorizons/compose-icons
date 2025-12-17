package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_power: ImageVector
    get() {
        if (_Settings_power != null) return _Settings_power!!
        
        _Settings_power = ImageVector.Builder(
            name = "settings_power",
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
                    moveTo(8f, 24f)
                    lineTo(8f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 23.55f, 7.45f, 24f, 8f, 24f)
                    close()
                    moveTo(12f, 24f)
                    lineTo(12f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 23.55f, 11.45f, 24f, 12f, 24f)
                    close()
                    moveTo(12f, 2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineTo(3f)
                    curveTo(13f, 2.45f, 12.55f, 2f, 12f, 2f)
                    close()
                    moveTo(15.94f, 5.06f)
                    lineToRelative(-0.02f, 0.02f)
                    curveTo(15.51f, 5.49f, 15.56f, 6.16f, 16f, 6.54f)
                    curveToRelative(1.51f, 1.34f, 2.33f, 3.43f, 1.88f, 5.7f)
                    curveToRelative(-0.46f, 2.28f, -2.29f, 4.14f, -4.56f, 4.62f)
                    curveTo(9.43f, 17.69f, 6f, 14.74f, 6f, 11f)
                    curveToRelative(0f, -1.78f, 0.78f, -3.37f, 2.01f, -4.47f)
                    curveToRelative(0.43f, -0.39f, 0.47f, -1.04f, 0.07f, -1.45f)
                    lineTo(8.06f, 5.06f)
                    curveTo(7.69f, 4.69f, 7.1f, 4.67f, 6.7f, 5.02f)
                    curveToRelative(-2.01f, 1.77f, -3.12f, 4.53f, -2.56f, 7.52f)
                    curveToRelative(0.59f, 3.15f, 3.11f, 5.7f, 6.26f, 6.31f)
                    curveToRelative(5.12f, 0.99f, 9.6f, -2.9f, 9.6f, -7.85f)
                    curveToRelative(0f, -2.38f, -1.05f, -4.52f, -2.71f, -5.99f)
                    curveTo(16.9f, 4.67f, 16.31f, 4.69f, 15.94f, 5.06f)
                    close()
                    moveTo(16f, 24f)
                    lineTo(16f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(15f, 23.55f, 15.45f, 24f, 16f, 24f)
                    close()
                }
            }
        }.build()
        
        return _Settings_power!!
    }

private var _Settings_power: ImageVector? = null

