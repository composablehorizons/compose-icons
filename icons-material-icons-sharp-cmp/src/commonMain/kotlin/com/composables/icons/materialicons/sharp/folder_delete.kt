package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Folder_delete: ImageVector
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
                    moveTo(22f, 6f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(8f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(22f)
                    close()
                    moveTo(16.5f, 10f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-5.5f)
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

