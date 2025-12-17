package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Snippet_folder: ImageVector
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
                    moveTo(15.88f, 10.5f)
                    lineToRelative(1.62f, 1.62f)
                    verticalLineToRelative(3.38f)
                    lineToRelative(-3f, 0f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(15.88f)
                    close()
                    moveTo(22f, 8f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    lineTo(2.01f, 6f)
                    curveTo(2.01f, 4.9f, 2.9f, 4f, 4f, 4f)
                    horizontalLineToRelative(6f)
                    lineToRelative(2f, 2f)
                    horizontalLineToRelative(8f)
                    curveTo(21.1f, 6f, 22f, 6.9f, 22f, 8f)
                    close()
                    moveTo(19f, 11.5f)
                    lineTo(16.5f, 9f)
                    horizontalLineTo(13f)
                    verticalLineToRelative(8f)
                    lineToRelative(6f, 0f)
                    verticalLineTo(11.5f)
                    close()
                }
            }
        }.build()
        
        return _Snippet_folder!!
    }

private var _Snippet_folder: ImageVector? = null

