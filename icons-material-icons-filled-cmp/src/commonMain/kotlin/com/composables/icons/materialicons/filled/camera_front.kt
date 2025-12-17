package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Camera_front: ImageVector
    get() {
        if (_Camera_front != null) return _Camera_front!!
        
        _Camera_front = ImageVector.Builder(
            name = "camera_front",
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
                moveTo(12f, 8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveTo(10.9f, 8f, 12f, 8f)
                close()
                moveToRelative(5f, -8f)
                horizontalLineTo(7f)
                curveTo(5.9f, 0f, 5f, 0.9f, 5f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, -1.67f, -3.33f, -2.5f, -5f, -2.5f)
                reflectiveCurveToRelative(-5f, 0.83f, -5f, 2.5f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Camera_front!!
    }

private var _Camera_front: ImageVector? = null

