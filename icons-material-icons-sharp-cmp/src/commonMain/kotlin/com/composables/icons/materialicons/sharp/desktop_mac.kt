package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Desktop_mac: ImageVector
    get() {
        if (_Desktop_mac != null) return _Desktop_mac!!
        
        _Desktop_mac = ImageVector.Builder(
            name = "desktop_mac",
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
                moveTo(23f, 2f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(9f)
                lineToRelative(-2f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                lineToRelative(-2f, -3f)
                horizontalLineToRelative(9f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Desktop_mac!!
    }

private var _Desktop_mac: ImageVector? = null

