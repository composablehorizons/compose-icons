package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wysiwyg: ImageVector
    get() {
        if (_Wysiwyg != null) return _Wysiwyg!!
        
        _Wysiwyg = ImageVector.Builder(
            name = "wysiwyg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    moveTo(17f, 12f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 14f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(14f)
                    close()
                    moveTo(21f, 21f)
                    horizontalLineTo(3f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(21f)
                    close()
                    moveTo(19f, 7f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Wysiwyg!!
    }

private var _Wysiwyg: ImageVector? = null

