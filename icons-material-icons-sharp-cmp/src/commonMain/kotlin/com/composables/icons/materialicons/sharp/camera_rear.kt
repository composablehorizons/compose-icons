package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Camera_rear: ImageVector
    get() {
        if (_Camera_rear != null) return _Camera_rear!!
        
        _Camera_rear = ImageVector.Builder(
            name = "camera_rear",
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
                moveTo(10f, 20f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(5f, -20f)
                horizontalLineTo(5f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                verticalLineTo(0f)
                close()
                moveToRelative(-7f, 6f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.89f, -2f, 1.99f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveTo(14f, 5.1f, 13.1f, 6f, 12f, 6f)
                close()
            }
        }.build()
        
        return _Camera_rear!!
    }

private var _Camera_rear: ImageVector? = null

