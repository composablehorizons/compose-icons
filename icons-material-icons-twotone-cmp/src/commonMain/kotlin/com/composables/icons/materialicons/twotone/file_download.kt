package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.File_download: ImageVector
    get() {
        if (_File_download != null) return _File_download!!
        
        _File_download = ImageVector.Builder(
            name = "file_download",
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
                        moveTo(14.17f, 11f)
                        lineTo(13f, 11f)
                        lineTo(13f, 5f)
                        lineTo(11f, 5f)
                        lineTo(11f, 11f)
                        lineTo(9.83f, 11f)
                        lineTo(12f, 13.17f)
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(5f)
                        lineToRelative(7f, 7f)
                        lineTo(19f, 9f)
                        close()
                        moveTo(11f, 11f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.17f)
                        lineTo(12f, 13.17f)
                        lineTo(9.83f, 11f)
                        horizontalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

