package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_day: ImageVector
    get() {
        if (_View_day != null) return _View_day!!
        
        _View_day = ImageVector.Builder(
            name = "view_day",
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
                moveTo(2f, 21f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 8f)
                horizontalLineTo(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(19f)
                verticalLineTo(8f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(19f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _View_day!!
    }

private var _View_day: ImageVector? = null

