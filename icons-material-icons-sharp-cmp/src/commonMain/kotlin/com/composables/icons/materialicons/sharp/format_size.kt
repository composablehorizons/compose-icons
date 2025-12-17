package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_size: ImageVector
    get() {
        if (_Format_size != null) return _Format_size!!
        
        _Format_size = ImageVector.Builder(
            name = "format_size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                close()
                moveToRelative(-6f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Format_size!!
    }

private var _Format_size: ImageVector? = null

