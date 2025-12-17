package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Device_unknown: ImageVector
    get() {
        if (_Device_unknown != null) return _Device_unknown!!
        
        _Device_unknown = ImageVector.Builder(
            name = "device_unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-6f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-1.48f, -5.81f)
                horizontalLineToRelative(0.13f)
                curveToRelative(0.33f, 0f, 0.59f, -0.23f, 0.7f, -0.54f)
                curveToRelative(0.24f, -0.69f, 0.91f, -1.21f, 1.66f, -1.21f)
                curveToRelative(0.93f, 0f, 1.75f, 0.82f, 1.75f, 1.75f)
                curveToRelative(0f, 1.32f, -1.49f, 1.55f, -2.23f, 2.82f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.08f, 0.14f, -0.14f, 0.29f, -0.2f, 0.45f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.02f, 0.05f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.01f, 0.05f)
                curveToRelative(-0.1f, 0.31f, -0.16f, 0.66f, -0.16f, 1.08f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0f, -0.25f, 0.04f, -0.47f, 0.12f, -0.67f)
                curveToRelative(0.54f, -1.47f, 2.77f, -1.86f, 2.48f, -4.18f)
                curveToRelative(-0.19f, -1.55f, -1.43f, -2.84f, -2.98f, -3.04f)
                curveToRelative(-1.77f, -0.23f, -3.29f, 0.78f, -3.81f, 2.3f)
                curveToRelative(-0.2f, 0.56f, 0.23f, 1.14f, 0.82f, 1.14f)
                close()
            }
        }.build()
        
        return _Device_unknown!!
    }

private var _Device_unknown: ImageVector? = null

