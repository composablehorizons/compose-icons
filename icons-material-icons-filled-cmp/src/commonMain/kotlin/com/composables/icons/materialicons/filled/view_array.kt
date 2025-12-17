package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_array: ImageVector
    get() {
        if (_View_array != null) return _View_array!!
        
        _View_array = ImageVector.Builder(
            name = "view_array",
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
                moveTo(21f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
                moveTo(17f, 5f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(10f)
                verticalLineTo(5f)
                close()
                moveTo(6f, 5f)
                horizontalLineTo(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _View_array!!
    }

private var _View_array: ImageVector? = null

