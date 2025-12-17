package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pan_tool: ImageVector
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
                moveTo(18f, 24f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(-1.08f, 0f, -2.14f, -0.45f, -2.89f, -1.23f)
                lineToRelative(-7.3f, -7.61f)
                lineToRelative(2.07f, -1.83f)
                curveToRelative(0.62f, -0.55f, 1.53f, -0.66f, 2.26f, -0.27f)
                lineTo(8f, 14.34f)
                verticalLineTo(4.79f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.17f, 0f, 0.34f, 0.02f, 0.51f, 0.05f)
                curveToRelative(0.09f, -1.3f, 1.17f, -2.33f, 2.49f, -2.33f)
                curveToRelative(0.86f, 0f, 1.61f, 0.43f, 2.06f, 1.09f)
                curveToRelative(0.29f, -0.12f, 0.61f, -0.18f, 0.94f, -0.18f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.28f)
                curveToRelative(0.16f, -0.03f, 0.33f, -0.05f, 0.5f, -0.05f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineTo(20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(4.14f, 15.28f)
                lineToRelative(5.86f, 6.1f)
                curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6.15f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
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
                close()
            }
        }.build()
        
        return _Pan_tool!!
    }

private var _Pan_tool: ImageVector? = null

