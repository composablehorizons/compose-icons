package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Folder_delete: ImageVector
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
                    moveTo(20f, 6f)
                    horizontalLineToRelative(-8f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.89f, 4f, 2.01f, 4.89f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(22f, 6.89f, 21.11f, 6f, 20f, 6f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(5.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Folder_delete!!
    }

private var _Folder_delete: ImageVector? = null

