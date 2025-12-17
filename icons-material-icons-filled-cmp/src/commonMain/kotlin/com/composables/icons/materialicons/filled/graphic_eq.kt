package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Graphic_eq: ImageVector
    get() {
        if (_Graphic_eq != null) return _Graphic_eq!!
        
        _Graphic_eq = ImageVector.Builder(
            name = "graphic_eq",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 18f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(20f)
                close()
                moveToRelative(-8f, -8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineTo(3f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(12f, 4f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(4f, -8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Graphic_eq!!
    }

private var _Graphic_eq: ImageVector? = null

