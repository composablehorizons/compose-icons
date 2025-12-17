package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
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
                moveTo(22.41f, 12f)
                lineTo(12f, 1.59f)
                lineTo(1.59f, 11.99f)
                lineTo(12f, 22.41f)
                lineTo(22.41f, 12f)
                close()
                moveTo(14f, 14.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineTo(7.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null

