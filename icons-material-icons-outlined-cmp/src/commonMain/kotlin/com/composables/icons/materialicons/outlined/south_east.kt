package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.South_east: ImageVector
    get() {
        if (_South_east != null) return _South_east!!
        
        _South_east = ImageVector.Builder(
            name = "south_east",
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
                moveTo(19f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.59f)
                lineTo(5.41f, 4f)
                lineTo(4f, 5.41f)
                lineTo(15.59f, 17f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _South_east!!
    }

private var _South_east: ImageVector? = null

