package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.File_upload: ImageVector
    get() {
        if (_File_upload != null) return _File_upload!!
        
        _File_upload = ImageVector.Builder(
            name = "file_upload",
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
                        moveTo(9.83f, 8f)
                        lineTo(11f, 8f)
                        lineTo(11f, 14f)
                        lineTo(13f, 14f)
                        lineTo(13f, 8f)
                        lineTo(14.17f, 8f)
                        lineTo(12f, 5.83f)
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
                        moveTo(5f, 10f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(4f)
                        lineToRelative(-7f, -7f)
                        lineTo(5f, 10f)
                        close()
                        moveTo(13f, 8f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(8f)
                        horizontalLineTo(9.83f)
                        lineTo(12f, 5.83f)
                        lineTo(14.17f, 8f)
                        horizontalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _File_upload!!
    }

private var _File_upload: ImageVector? = null

