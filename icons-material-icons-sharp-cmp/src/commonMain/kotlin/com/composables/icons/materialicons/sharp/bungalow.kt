package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bungalow: ImageVector
    get() {
        if (_Bungalow != null) return _Bungalow!!
        
        _Bungalow = ImageVector.Builder(
            name = "bungalow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                lineTo(4.2f, 15.5f)
                lineToRelative(1.7f, 1.06f)
                lineTo(7f, 14.8f)
                verticalLineTo(21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6.21f)
                lineToRelative(1.1f, 1.77f)
                lineToRelative(1.7f, -1.06f)
                lineTo(12f, 3f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _Bungalow!!
    }

private var _Bungalow: ImageVector? = null

