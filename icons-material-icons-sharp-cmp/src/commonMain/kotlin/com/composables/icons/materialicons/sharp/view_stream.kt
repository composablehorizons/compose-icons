package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_stream: ImageVector
    get() {
        if (_View_stream != null) return _View_stream!!
        
        _View_stream = ImageVector.Builder(
            name = "view_stream",
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
                moveTo(3f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(6f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _View_stream!!
    }

private var _View_stream: ImageVector? = null

