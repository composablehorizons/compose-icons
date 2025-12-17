package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dock: ImageVector
    get() {
        if (_Dock != null) return _Dock!!
        
        _Dock = ImageVector.Builder(
            name = "dock",
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
                moveTo(8f, 23f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 1.01f)
                lineTo(6f, 1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(12f)
                verticalLineTo(1.01f)
                close()
                moveTo(16f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Dock!!
    }

private var _Dock: ImageVector? = null

