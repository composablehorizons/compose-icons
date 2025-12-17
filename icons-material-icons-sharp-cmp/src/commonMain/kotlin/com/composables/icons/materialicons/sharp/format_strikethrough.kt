package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_strikethrough: ImageVector
    get() {
        if (_Format_strikethrough != null) return _Format_strikethrough!!
        
        _Format_strikethrough = ImageVector.Builder(
            name = "format_strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Format_strikethrough!!
    }

private var _Format_strikethrough: ImageVector? = null

