package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pan_tool: ImageVector
    get() {
        if (_Pan_tool != null) return _Pan_tool!!
        
        _Pan_tool = ImageVector.Builder(
            name = "pan_tool",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 5.65f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3.42f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.51f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4.79f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(12.87f)
                lineToRelative(-5.35f, -2.83f)
                lineToRelative(-0.51f, 0.45f)
                lineToRelative(5.86f, 6.1f)
                curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6.15f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 3.65f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineToRelative(-0.28f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.33f, 0f, -0.65f, 0.06f, -0.94f, 0.18f)
                curveTo(15.11f, 0.44f, 14.35f, 0.01f, 13.5f, 0.01f)
                curveToRelative(-1.32f, 0f, -2.41f, 1.03f, -2.49f, 2.33f)
                curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.51f, -0.05f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9.55f)
                lineToRelative(-2.41f, -1.28f)
                curveToRelative(-0.73f, -0.39f, -1.64f, -0.28f, -2.26f, 0.27f)
                lineToRelative(-2.07f, 1.83f)
                lineToRelative(7.3f, 7.61f)
                curveToRelative(0.75f, 0.78f, 1.8f, 1.23f, 2.89f, 1.23f)
                horizontalLineTo(18f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineTo(6.15f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(-0.54f, 0f, -1.07f, -0.22f, -1.44f, -0.62f)
                lineToRelative(-5.86f, -6.11f)
                lineToRelative(0.51f, -0.45f)
                lineTo(10f, 17.66f)
                verticalLineTo(4.79f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.51f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(3.42f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(6.15f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        
        return _Pan_tool!!
    }

private var _Pan_tool: ImageVector? = null

