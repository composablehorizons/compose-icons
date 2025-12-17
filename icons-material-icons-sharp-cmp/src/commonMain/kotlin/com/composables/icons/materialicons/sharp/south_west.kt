package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.South_west: ImageVector
    get() {
        if (_South_west != null) return _South_west!!
        
        _South_west = ImageVector.Builder(
            name = "south_west",
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
                moveTo(15f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8.41f)
                lineTo(20f, 5.41f)
                lineTo(18.59f, 4f)
                lineTo(7f, 15.59f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _South_west!!
    }

private var _South_west: ImageVector? = null

