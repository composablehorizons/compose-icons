package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Device_hub: ImageVector
    get() {
        if (_Device_hub != null) return _Device_hub!!
        
        _Device_hub = ImageVector.Builder(
            name = "device_hub",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 16f)
                lineToRelative(-4f, -4f)
                verticalLineTo(8.82f)
                curveTo(14.16f, 8.4f, 15f, 7.3f, 15f, 6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 4.34f, 9f, 6f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineTo(12f)
                lineToRelative(-4f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.05f)
                lineToRelative(4f, -4.2f)
                lineToRelative(4f, 4.2f)
                verticalLineTo(21f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Device_hub!!
    }

private var _Device_hub: ImageVector? = null

