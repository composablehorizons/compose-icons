package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Drive_file_rename_outline: ImageVector
    get() {
        if (_Drive_file_rename_outline != null) return _Drive_file_rename_outline!!
        
        _Drive_file_rename_outline = ImageVector.Builder(
            name = "drive_file_rename_outline",
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
                        moveTo(12.06f, 10.02f)
                        lineTo(5f, 17.08f)
                        lineTo(5f, 18f)
                        lineTo(5.92f, 18f)
                        lineTo(12.98f, 10.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 16f)
                        lineTo(11f, 20f)
                        lineTo(21f, 20f)
                        lineTo(21f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.06f, 7.19f)
                        lineTo(3f, 16.25f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(3.75f)
                        lineToRelative(9.06f, -9.06f)
                        lineTo(12.06f, 7.19f)
                        close()
                        moveTo(5.92f, 18f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-0.92f)
                        lineToRelative(7.06f, -7.06f)
                        lineToRelative(0.92f, 0.92f)
                        lineTo(5.92f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.71f, 8.04f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-2.34f, -2.34f)
                        curveTo(16.17f, 4.09f, 15.92f, 4f, 15.66f, 4f)
                        curveToRelative(-0.25f, 0f, -0.51f, 0.1f, -0.7f, 0.29f)
                        lineToRelative(-1.83f, 1.83f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(18.71f, 8.04f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Drive_file_rename_outline!!
    }

private var _Drive_file_rename_outline: ImageVector? = null

