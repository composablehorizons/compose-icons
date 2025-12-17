package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.View_column: ImageVector
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
                moveTo(8.33f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17f)
                close()
                moveTo(13.67f, 17f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _View_column!!
    }

private var _View_column: ImageVector? = null

