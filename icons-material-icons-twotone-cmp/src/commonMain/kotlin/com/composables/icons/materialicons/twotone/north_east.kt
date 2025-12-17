package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.North_east: ImageVector
    get() {
        if (_North_east != null) return _North_east!!
        
        _North_east = ImageVector.Builder(
            name = "north_east",
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
                moveTo(9f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.59f)
                lineTo(4f, 18.59f)
                lineTo(5.41f, 20f)
                lineTo(17f, 8.41f)
                verticalLineTo(15f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _North_east!!
    }

private var _North_east: ImageVector? = null

