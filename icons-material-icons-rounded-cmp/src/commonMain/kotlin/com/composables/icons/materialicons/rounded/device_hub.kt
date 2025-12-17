package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Device_hub: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 16f)
                lineToRelative(-4f, -4f)
                verticalLineTo(8.82f)
                curveToRelative(1.35f, -0.49f, 2.26f, -1.89f, 1.93f, -3.46f)
                curveToRelative(-0.25f, -1.18f, -1.23f, -2.12f, -2.42f, -2.32f)
                curveTo(10.63f, 2.73f, 9f, 4.17f, 9f, 6f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineTo(12f)
                lineToRelative(-4f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.05f)
                lineToRelative(4f, -4.2f)
                lineToRelative(4f, 4.2f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Device_hub!!
    }

private var _Device_hub: ImageVector? = null

