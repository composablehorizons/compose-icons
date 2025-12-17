package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Upload_file: ImageVector
    get() {
        if (_Upload_file != null) return _Upload_file!!
        
        _Upload_file = ImageVector.Builder(
            name = "upload_file",
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
                        moveTo(13f, 4f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(4f)
                        close()
                        moveTo(16f, 15f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(8f)
                        lineToRelative(4.01f, -4f)
                        lineTo(16f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4.01f, 2.9f, 4.01f, 4f)
                        lineTo(4f, 20f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                        horizontalLineTo(18f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        lineTo(14f, 2f)
                        close()
                        moveTo(18f, 20f)
                        horizontalLineTo(6f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 15f)
                        lineTo(11f, 15f)
                        lineTo(11f, 19f)
                        lineTo(13f, 19f)
                        lineTo(13f, 15f)
                        lineTo(16f, 15f)
                        lineTo(12.01f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Upload_file!!
    }

private var _Upload_file: ImageVector? = null

