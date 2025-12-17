package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Laptop_windows: ImageVector
    get() {
        if (_Laptop_windows != null) return _Laptop_windows!!
        
        _Laptop_windows = ImageVector.Builder(
            name = "laptop_windows",
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
                moveTo(20f, 18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.99f)
                lineTo(22f, 3f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(10f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Laptop_windows!!
    }

private var _Laptop_windows: ImageVector? = null

