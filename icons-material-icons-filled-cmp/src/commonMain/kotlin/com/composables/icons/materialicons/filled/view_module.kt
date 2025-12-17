package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_module: ImageVector
    get() {
        if (_View_module != null) return _View_module!!
        
        _View_module = ImageVector.Builder(
            name = "view_module",
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.67f, 5f)
                    verticalLineToRelative(6.5f)
                    horizontalLineTo(9.33f)
                    verticalLineTo(5f)
                    horizontalLineTo(14.67f)
                    close()
                    moveTo(15.67f, 11.5f)
                    horizontalLineTo(21f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-5.33f)
                    verticalLineTo(11.5f)
                    close()
                    moveTo(14.67f, 19f)
                    verticalLineToRelative(-6.5f)
                    horizontalLineTo(9.33f)
                    verticalLineTo(19f)
                    horizontalLineTo(14.67f)
                    close()
                    moveTo(15.67f, 12.5f)
                    verticalLineTo(19f)
                    horizontalLineTo(21f)
                    verticalLineToRelative(-6.5f)
                    horizontalLineTo(15.67f)
                    close()
                    moveTo(8.33f, 12.5f)
                    horizontalLineTo(3f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(5.33f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(8.33f, 11.5f)
                    verticalLineTo(5f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(6.5f)
                    horizontalLineTo(8.33f)
                    close()
                }
            }
        }.build()
        
        return _View_module!!
    }

private var _View_module: ImageVector? = null

