package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.View_sidebar: ImageVector
    get() {
        if (_View_sidebar != null) return _View_sidebar!!
        
        _View_sidebar = ImageVector.Builder(
            name = "view_sidebar",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 8.67f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineTo(6f)
                        horizontalLineTo(20f)
                        verticalLineTo(8.67f)
                        close()
                        moveTo(17.5f, 10.67f)
                        horizontalLineTo(20f)
                        verticalLineToRelative(2.67f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineTo(10.67f)
                        close()
                        moveTo(4f, 6f)
                        horizontalLineToRelative(11.5f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        close()
                        moveTo(17.5f, 18f)
                        verticalLineToRelative(-2.67f)
                        horizontalLineTo(20f)
                        verticalLineTo(18f)
                        horizontalLineTo(17.5f)
                        close()
                    }
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 4f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(4f)
                        horizontalLineTo(2f)
                        close()
                        moveTo(20f, 8.67f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineTo(6f)
                        horizontalLineTo(20f)
                        verticalLineTo(8.67f)
                        close()
                        moveTo(17.5f, 10.67f)
                        horizontalLineTo(20f)
                        verticalLineToRelative(2.67f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineTo(10.67f)
                        close()
                        moveTo(4f, 6f)
                        horizontalLineToRelative(11.5f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        close()
                        moveTo(17.5f, 18f)
                        verticalLineToRelative(-2.67f)
                        horizontalLineTo(20f)
                        verticalLineTo(18f)
                        horizontalLineTo(17.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_sidebar!!
    }

private var _View_sidebar: ImageVector? = null

