package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Important_devices: ImageVector
    get() {
        if (_Important_devices != null) return _Important_devices!!
        
        _Important_devices = ImageVector.Builder(
            name = "important_devices",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 11.01f)
                lineTo(18f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, -0.45f, -0.99f, -1f, -0.99f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                close()
                moveTo(20f, 2f)
                horizontalLineTo(2f)
                curveTo(0.89f, 2f, 0f, 2.89f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-8.03f, 7f)
                lineTo(11f, 6f)
                lineToRelative(-0.97f, 3f)
                horizontalLineTo(7f)
                lineToRelative(2.47f, 1.76f)
                lineToRelative(-0.94f, 2.91f)
                lineToRelative(2.47f, -1.8f)
                lineToRelative(2.47f, 1.8f)
                lineToRelative(-0.94f, -2.91f)
                lineTo(15f, 9f)
                horizontalLineToRelative(-3.03f)
                close()
            }
        }.build()
        
        return _Important_devices!!
    }

private var _Important_devices: ImageVector? = null

