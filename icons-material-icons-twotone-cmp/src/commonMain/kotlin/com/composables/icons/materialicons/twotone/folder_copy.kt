package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Folder_copy: ImageVector
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
                        moveTo(11.17f, 4f)
                        lineTo(7f, 4f)
                        lineTo(7f, 15f)
                        lineTo(21f, 15f)
                        lineTo(21f, 6f)
                        lineTo(13.17f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 4f)
                        horizontalLineToRelative(-7f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 2f, 5.01f, 2.9f, 5.01f, 4f)
                        lineTo(5f, 15f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(23f, 4.9f, 22.1f, 4f, 21f, 4f)
                        close()
                        moveTo(21f, 15f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(4.17f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(21f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 6f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(13f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(17f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(3f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Folder_copy!!
    }

private var _Folder_copy: ImageVector? = null

