package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_column: ImageVector
    get() {
        if (_View_column != null) return _View_column!!
        
        _View_column = ImageVector.Builder(
            name = "view_column",
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
                    verticalLineToRelative(14f)
                    horizontalLineTo(9.33f)
                    verticalLineTo(5f)
                    horizontalLineTo(14.67f)
                    close()
                    moveTo(15.67f, 19f)
                    horizontalLineTo(21f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-5.33f)
                    verticalLineTo(19f)
                    close()
                    moveTo(8.33f, 19f)
                    verticalLineTo(5f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(8.33f)
                    close()
                }
            }
        }.build()
        
        return _View_column!!
    }

private var _View_column: ImageVector? = null

