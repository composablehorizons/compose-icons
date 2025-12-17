package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Space_dashboard: ImageVector
    get() {
        if (_Space_dashboard != null) return _Space_dashboard!!
        
        _Space_dashboard = ImageVector.Builder(
            name = "space_dashboard",
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
                moveTo(11f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(8f)
                verticalLineTo(21f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-8f)
                verticalLineTo(21f)
                close()
                moveTo(21f, 10f)
                verticalLineTo(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(7f)
                horizontalLineTo(21f)
                close()
            }
        }.build()
        
        return _Space_dashboard!!
    }

private var _Space_dashboard: ImageVector? = null

