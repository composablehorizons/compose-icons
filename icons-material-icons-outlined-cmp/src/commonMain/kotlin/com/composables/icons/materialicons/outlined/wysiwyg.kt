package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wysiwyg: ImageVector
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineTo(5f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(19f)
                    close()
                    moveTo(17f, 12f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 16f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Wysiwyg!!
    }

private var _Wysiwyg: ImageVector? = null

