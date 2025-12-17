package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Truck: ImageVector
    get() {
        if (_Truck != null) return _Truck!!
        
        _Truck = ImageVector.Builder(
            name = "truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.908f, 2.067f)
                arcTo(0.978f, 0.978f, 0f, false, false, 2f, 3.05f)
                verticalLineTo(8f)
                horizontalLineToRelative(6f)
                verticalLineTo(3.05f)
                arcToRelative(0.978f, 0.978f, 0f, false, false, -0.908f, -0.983f)
                arcToRelative(32.481f, 32.481f, 0f, false, false, -4.184f, 0f)
                close()
                moveTo(12.919f, 4.722f)
                arcTo(0.98f, 0.98f, 0f, false, false, 11.968f, 4f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6.268f)
                arcTo(2f, 2f, 0f, false, true, 12f, 13f)
                horizontalLineToRelative(1f)
                arcToRelative(0.977f, 0.977f, 0f, false, false, 0.985f, -1f)
                arcToRelative(31.99f, 31.99f, 0f, false, false, -1.066f, -7.278f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 13f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(2f, 12f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 13f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _Truck!!
    }

private var _Truck: ImageVector? = null

