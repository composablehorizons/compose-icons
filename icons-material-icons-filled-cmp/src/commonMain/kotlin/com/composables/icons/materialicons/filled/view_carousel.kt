package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_carousel: ImageVector
    get() {
        if (_View_carousel != null) return _View_carousel!!
        
        _View_carousel = ImageVector.Builder(
            name = "view_carousel",
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
                moveTo(2f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(10f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _View_carousel!!
    }

private var _View_carousel: ImageVector? = null

