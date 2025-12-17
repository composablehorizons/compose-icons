package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Laptop_chromebook: ImageVector
    get() {
        if (_Laptop_chromebook != null) return _Laptop_chromebook!!
        
        _Laptop_chromebook = ImageVector.Builder(
            name = "laptop_chromebook",
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
                moveTo(22f, 18f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(6f, -3f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Laptop_chromebook!!
    }

private var _Laptop_chromebook: ImageVector? = null

