package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SquareFull: ImageVector
    get() {
        if (_SquareFull != null) return _SquareFull!!
        
        _SquareFull = ImageVector.Builder(
            name = "square-full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 512f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(512f)
                verticalLineToRelative(512f)
                close()
            }
        }.build()
        
        return _SquareFull!!
    }

private var _SquareFull: ImageVector? = null

