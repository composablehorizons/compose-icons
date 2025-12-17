package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.File_download_done: ImageVector
    get() {
        if (_File_download_done != null) return _File_download_done!!
        
        _File_download_done = ImageVector.Builder(
            name = "file_download_done",
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
                        moveTo(20.13f, 5.41f)
                        lineTo(18.72f, 4f)
                        lineTo(9.53f, 13.19f)
                        lineTo(5.28f, 8.95f)
                        lineTo(3.87f, 10.36f)
                        lineTo(9.53f, 16.02f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 18f)
                        horizontalLineTo(19f)
                        verticalLineTo(20f)
                        horizontalLineTo(5f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _File_download_done!!
    }

private var _File_download_done: ImageVector? = null

