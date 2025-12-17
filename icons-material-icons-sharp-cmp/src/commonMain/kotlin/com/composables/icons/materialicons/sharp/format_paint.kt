package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_paint: ImageVector
    get() {
        if (_Format_paint != null) return _Format_paint!!
        
        _Format_paint = ImageVector.Builder(
            name = "format_paint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(14f)
                verticalLineTo(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(4f)
                verticalLineTo(12f)
                horizontalLineToRelative(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Format_paint!!
    }

private var _Format_paint: ImageVector? = null

