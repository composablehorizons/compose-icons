package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Picture_in_picture: ImageVector
    get() {
        if (_Picture_in_picture != null) return _Picture_in_picture!!
        
        _Picture_in_picture = ImageVector.Builder(
            name = "picture_in_picture",
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
                moveTo(19f, 7f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineTo(7f)
                close()
                moveToRelative(4f, -4f)
                horizontalLineTo(1f)
                verticalLineToRelative(17.98f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16.01f)
                horizontalLineTo(3f)
                verticalLineTo(4.98f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.03f)
                close()
            }
        }.build()
        
        return _Picture_in_picture!!
    }

private var _Picture_in_picture: ImageVector? = null

