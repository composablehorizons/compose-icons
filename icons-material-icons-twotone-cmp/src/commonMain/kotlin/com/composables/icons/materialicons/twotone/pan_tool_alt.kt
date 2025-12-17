package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pan_tool_alt: ImageVector
    get() {
        if (_Pan_tool_alt != null) return _Pan_tool_alt!!
        
        _Pan_tool_alt = ImageVector.Builder(
            name = "pan_tool_alt",
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
                    moveTo(17.08f, 19f)
                    horizontalLineToRelative(-6.55f)
                    lineToRelative(-3.7f, -3.78f)
                    lineTo(11f, 16.11f)
                    verticalLineTo(5.5f)
                    curveTo(11f, 5.22f, 11.22f, 5f, 11.5f, 5f)
                    reflectiveCurveTo(12f, 5.22f, 12f, 5.5f)
                    verticalLineToRelative(6.18f)
                    horizontalLineToRelative(1.76f)
                    lineTo(18f, 13.56f)
                    lineTo(17.08f, 19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.89f, 11.77f)
                    lineToRelative(-3.8f, -1.67f)
                    curveTo(14.96f, 10.04f, 14.81f, 10f, 14.65f, 10f)
                    horizontalLineTo(14f)
                    verticalLineTo(5.5f)
                    curveTo(14f, 4.12f, 12.88f, 3f, 11.5f, 3f)
                    reflectiveCurveTo(9f, 4.12f, 9f, 5.5f)
                    verticalLineToRelative(8.15f)
                    lineToRelative(-1.87f, -0.4f)
                    curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                    lineTo(4f, 15.22f)
                    lineToRelative(5.12f, 5.19f)
                    curveTo(9.49f, 20.79f, 10f, 21f, 10.53f, 21f)
                    horizontalLineToRelative(6.55f)
                    curveToRelative(0.98f, 0f, 1.81f, -0.7f, 1.97f, -1.67f)
                    lineToRelative(0.92f, -5.44f)
                    curveTo(20.12f, 13.03f, 19.68f, 12.17f, 18.89f, 11.77f)
                    close()
                    moveTo(17.08f, 19f)
                    horizontalLineToRelative(-6.55f)
                    lineToRelative(-3.7f, -3.78f)
                    lineTo(11f, 16.11f)
                    verticalLineTo(5.5f)
                    curveTo(11f, 5.22f, 11.22f, 5f, 11.5f, 5f)
                    reflectiveCurveTo(12f, 5.22f, 12f, 5.5f)
                    verticalLineToRelative(6.18f)
                    horizontalLineToRelative(1.76f)
                    lineTo(18f, 13.56f)
                    lineTo(17.08f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Pan_tool_alt!!
    }

private var _Pan_tool_alt: ImageVector? = null

