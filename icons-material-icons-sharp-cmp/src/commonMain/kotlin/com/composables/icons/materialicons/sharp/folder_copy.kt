package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Folder_copy: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 6f)
                        lineTo(1f, 6f)
                        lineTo(1f, 21f)
                        lineTo(20f, 21f)
                        lineTo(20f, 19f)
                        lineTo(3f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23f, 4f)
                        horizontalLineToRelative(-9f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(5.01f)
                        lineTo(5f, 17f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Folder_copy!!
    }

private var _Folder_copy: ImageVector? = null

