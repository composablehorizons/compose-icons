package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Space_bar: ImageVector
    get() {
        if (_Space_bar != null) return _Space_bar!!
        
        _Space_bar = ImageVector.Builder(
            name = "space_bar",
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
                moveTo(18f, 9f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Space_bar!!
    }

private var _Space_bar: ImageVector? = null

