package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Perm_device_information: ImageVector
    get() {
        if (_Perm_device_information != null) return _Perm_device_information!!
        
        _Perm_device_information = ImageVector.Builder(
            name = "perm_device_information",
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
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(6f, -9.99f)
                lineTo(7f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -1.99f, -2f, -1.99f)
                close()
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(0f, -14f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Perm_device_information!!
    }

private var _Perm_device_information: ImageVector? = null

