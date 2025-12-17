package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Linked_camera: ImageVector
    get() {
        if (_Linked_camera != null) return _Linked_camera!!
        
        _Linked_camera = ImageVector.Builder(
            name = "linked_camera",
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
                moveTo(20f, 9f)
                verticalLineToRelative(11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(4.05f)
                lineToRelative(1.83f, -2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                lineTo(7.17f, 6f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0.67f, -1.01f)
                horizontalLineTo(22f)
                curveTo(21.99f, 4.68f, 19.31f, 2f, 16f, 2f)
                verticalLineToRelative(1.33f)
                curveToRelative(2.58f, 0f, 4.66f, 2.08f, 4.67f, 4.66f)
                close()
                moveToRelative(-2.67f, 0f)
                horizontalLineToRelative(1.33f)
                curveToRelative(-0.01f, -1.84f, -1.49f, -3.32f, -3.33f, -3.32f)
                verticalLineTo(6f)
                curveToRelative(1.11f, 0f, 1.99f, 0.89f, 2f, 1.99f)
                close()
                moveTo(7f, 14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
                moveToRelative(8f, 0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
            }
        }.build()
        
        return _Linked_camera!!
    }

private var _Linked_camera: ImageVector? = null

