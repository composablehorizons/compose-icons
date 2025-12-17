package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Man: ImageVector
    get() {
        if (_Man != null) return _Man!!
        
        _Man = ImageVector.Builder(
            name = "man",
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
                        moveTo(14f, 7f)
                        horizontalLineToRelative(-4f)
                        curveTo(8.9f, 7f, 8f, 7.9f, 8f, 9f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        curveTo(16f, 7.9f, 15.1f, 7f, 14f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Man!!
    }

private var _Man: ImageVector? = null

