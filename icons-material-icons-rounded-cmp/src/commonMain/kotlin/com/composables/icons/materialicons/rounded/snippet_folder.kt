package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Snippet_folder: ImageVector
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
                    horizontalLineToRelative(5.17f)
                    curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.41f, 0.59f)
                    lineTo(12f, 6f)
                    horizontalLineToRelative(8f)
                    curveTo(21.1f, 6f, 22f, 6.9f, 22f, 8f)
                    close()
                    moveTo(19f, 11.91f)
                    curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                    lineToRelative(-1.91f, -1.91f)
                    curveTo(16.61f, 9.11f, 16.35f, 9f, 16.09f, 9f)
                    horizontalLineTo(14f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    lineToRelative(4f, 0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(11.91f)
                    close()
                }
            }
        }.build()
        
        return _Snippet_folder!!
    }

private var _Snippet_folder: ImageVector? = null

