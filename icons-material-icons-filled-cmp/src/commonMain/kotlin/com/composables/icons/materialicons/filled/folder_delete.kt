package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Folder_delete: ImageVector
    get() {
        if (_Folder_delete != null) return _Folder_delete!!
        
        _Folder_delete = ImageVector.Builder(
            name = "folder_delete",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
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
                    moveTo(16.5f, 10f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(10f)
                    horizontalLineTo(16.5f)
                    close()
                    moveTo(16.5f, 15.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15.5f)
                    close()
                }
            }
        }.build()
        
        return _Folder_delete!!
    }

private var _Folder_delete: ImageVector? = null

