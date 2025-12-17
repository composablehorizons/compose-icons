package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Photo_camera_front: ImageVector
    get() {
        if (_Photo_camera_front != null) return _Photo_camera_front!!
        
        _Photo_camera_front = ImageVector.Builder(
            name = "photo_camera_front",
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
                moveTo(18f, 10.48f)
                lineToRelative(4f, -3.98f)
                verticalLineToRelative(11f)
                lineToRelative(-4f, -3.98f)
                verticalLineTo(18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4.48f)
                close()
                moveToRelative(-2f, -0.79f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(12f)
                verticalLineTo(9.69f)
                close()
                moveTo(10f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, 1f)
                curveToRelative(1.34f, 0f, 4f, 0.67f, 4f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.33f, 2.66f, -2f, 4f, -2f)
                close()
            }
        }.build()
        
        return _Photo_camera_front!!
    }

private var _Photo_camera_front: ImageVector? = null

