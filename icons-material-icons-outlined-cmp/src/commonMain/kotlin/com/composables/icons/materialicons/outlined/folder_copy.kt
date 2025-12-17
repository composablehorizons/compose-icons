package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Folder_copy: ImageVector
    get() {
        if (_Folder_copy != null) return _Folder_copy!!
        
        _Folder_copy = ImageVector.Builder(
            name = "folder_copy",
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
                    moveTo(3f, 19f)
                    horizontalLineToRelative(17f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(23f, 6f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(7f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    lineTo(5.01f, 4f)
                    curveTo(5.01f, 2.9f, 5.9f, 2f, 7f, 2f)
                    horizontalLineToRelative(5f)
                    lineToRelative(2f, 2f)
                    horizontalLineToRelative(7f)
                    curveTo(22.1f, 4f, 23f, 4.9f, 23f, 6f)
                    close()
                    moveTo(7f, 15f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(-7.83f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(7f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Folder_copy!!
    }

private var _Folder_copy: ImageVector? = null

