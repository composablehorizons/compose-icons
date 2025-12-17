package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_list: ImageVector
    get() {
        if (_View_list != null) return _View_list!!
        
        _View_list = ImageVector.Builder(
            name = "view_list",
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
                moveTo(3f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(4f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                close()
                moveTo(8f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(13f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _View_list!!
    }

private var _View_list: ImageVector? = null

