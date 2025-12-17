package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Snippet_folder: ImageVector
    get() {
        if (_Snippet_folder != null) return _Snippet_folder!!
        
        _Snippet_folder = ImageVector.Builder(
            name = "snippet_folder",
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
                    moveTo(12f, 6f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(6f)
                    horizontalLineTo(12f)
                    close()
                    moveTo(19f, 17f)
                    lineToRelative(-6f, 0f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3.5f)
                    lineToRelative(2.5f, 2.5f)
                    verticalLineTo(17f)
                    close()
                    moveTo(15.88f, 10.5f)
                    lineToRelative(1.62f, 1.62f)
                    verticalLineToRelative(3.38f)
                    lineToRelative(-3f, 0f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(15.88f)
                    close()
                }
            }
        }.build()
        
        return _Snippet_folder!!
    }

private var _Snippet_folder: ImageVector? = null

