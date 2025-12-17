package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Desktop_windows: ImageVector
    get() {
        if (_Desktop_windows != null) return _Desktop_windows!!
        
        _Desktop_windows = ImageVector.Builder(
            name = "desktop_windows",
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
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Desktop_windows!!
    }

private var _Desktop_windows: ImageVector? = null

