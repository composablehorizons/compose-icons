package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Line_style: ImageVector
    get() {
        if (_Line_style != null) return _Line_style!!
        
        _Line_style = ImageVector.Builder(
            name = "line_style",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 16f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(16f)
                            close()
                            moveTo(9.5f, 16f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-5f)
                            verticalLineTo(16f)
                            close()
                            moveTo(16f, 16f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-5f)
                            verticalLineTo(16f)
                            close()
                            moveTo(3f, 20f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(20f)
                            close()
                            moveTo(7f, 20f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(7f)
                            verticalLineTo(20f)
                            close()
                            moveTo(11f, 20f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(20f)
                            close()
                            moveTo(15f, 20f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(20f)
                            close()
                            moveTo(19f, 20f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(20f)
                            close()
                            moveTo(3f, 12f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(12f)
                            close()
                            moveTo(13f, 12f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-8f)
                            verticalLineTo(12f)
                            close()
                            moveTo(3f, 4f)
                            verticalLineToRelative(4f)
                            horizontalLineToRelative(18f)
                            verticalLineTo(4f)
                            horizontalLineTo(3f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Line_style!!
    }

private var _Line_style: ImageVector? = null

