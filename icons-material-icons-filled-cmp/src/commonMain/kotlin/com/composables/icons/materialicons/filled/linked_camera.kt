package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Linked_camera: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.2f, 14f)
                arcTo(3.2f, 3.2f, 0f, false, true, 12f, 17.2f)
                arcTo(3.2f, 3.2f, 0f, false, true, 8.8f, 14f)
                arcTo(3.2f, 3.2f, 0f, false, true, 15.2f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(17f, 14f)
                arcTo(5f, 5f, 0f, false, true, 12f, 19f)
                arcTo(5f, 5f, 0f, false, true, 7f, 14f)
                arcTo(5f, 5f, 0f, false, true, 17f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3.33f)
                curveToRelative(2.58f, 0f, 4.67f, 2.09f, 4.67f, 4.67f)
                horizontalLineTo(22f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(1.33f)
                moveTo(16f, 6f)
                curveToRelative(1.11f, 0f, 2f, 0.89f, 2f, 2f)
                horizontalLineToRelative(1.33f)
                curveToRelative(0f, -1.84f, -1.49f, -3.33f, -3.33f, -3.33f)
                verticalLineTo(6f)
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 9f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
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
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(-5f, 10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.build()
        
        return _Linked_camera!!
    }

private var _Linked_camera: ImageVector? = null

