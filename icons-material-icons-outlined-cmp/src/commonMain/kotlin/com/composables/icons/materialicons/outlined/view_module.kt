package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.View_module: ImageVector
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
                moveTo(13.67f, 11f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(11f)
                close()
                moveTo(8.33f, 7f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(8.33f)
                close()
                moveTo(5f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                close()
                moveTo(10.33f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4f)
                horizontalLineTo(10.33f)
                close()
                moveTo(15.67f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineTo(19f)
                verticalLineToRelative(4f)
                horizontalLineTo(15.67f)
                close()
            }
        }.build()
        
        return _View_module!!
    }

private var _View_module: ImageVector? = null

