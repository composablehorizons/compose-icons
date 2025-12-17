package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_italic: ImageVector
    get() {
        if (_Format_italic != null) return _Format_italic!!
        
        _Format_italic = ImageVector.Builder(
            name = "format_italic",
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
                moveTo(10f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-3.42f, 8f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.21f)
                lineToRelative(3.42f, -8f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.build()
        
        return _Format_italic!!
    }

private var _Format_italic: ImageVector? = null

