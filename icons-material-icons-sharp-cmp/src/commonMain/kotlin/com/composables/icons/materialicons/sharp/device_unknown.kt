package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Device_unknown: ImageVector
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
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
                moveToRelative(-2f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
                moveTo(12f, 6.72f)
                curveToRelative(-1.96f, 0f, -3.5f, 1.52f, -3.5f, 3.47f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.82f, 1.75f, 1.75f)
                curveToRelative(0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f)
                curveToRelative(0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Device_unknown!!
    }

private var _Device_unknown: ImageVector? = null

