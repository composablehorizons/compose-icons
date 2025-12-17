package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_compact: ImageVector
    get() {
        if (_View_compact != null) return _View_compact!!
        
        _View_compact = ImageVector.Builder(
            name = "view_compact",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineTo(3f)
                verticalLineToRelative(7f)
                close()
                moveToRelative(7f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7f)
                horizontalLineTo(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(3f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(19f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _View_compact!!
    }

private var _View_compact: ImageVector? = null

