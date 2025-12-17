package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Folder_off: ImageVector
    get() {
        if (_Folder_off != null) return _Folder_off!!
        
        _Folder_off = ImageVector.Builder(
            name = "folder_off",
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
                        moveTo(20f, 6f)
                        horizontalLineToRelative(-8f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(6.83f)
                        lineToRelative(14.93f, 14.93f)
                        curveTo(21.91f, 18.65f, 22f, 18.34f, 22f, 18f)
                        verticalLineTo(8f)
                        curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 2.1f)
                        lineTo(0.69f, 3.51f)
                        lineToRelative(1.56f, 1.56f)
                        curveTo(2.1f, 5.35f, 2.01f, 5.66f, 2.01f, 6f)
                        lineTo(2f, 18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13.17f)
                        lineToRelative(3.31f, 3.31f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.1f, 2.1f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Folder_off!!
    }

private var _Folder_off: ImageVector? = null

