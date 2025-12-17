package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Grid_view: ImageVector
    get() {
        if (_Grid_view != null) return _Grid_view!!
        
        _Grid_view = ImageVector.Builder(
            name = "grid_view",
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
                            moveTo(3f, 3f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(8f)
                            verticalLineTo(3f)
                            horizontalLineTo(3f)
                            close()
                            moveTo(9f, 9f)
                            horizontalLineTo(5f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(9f)
                            close()
                            moveTo(3f, 13f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-8f)
                            horizontalLineTo(3f)
                            close()
                            moveTo(9f, 19f)
                            horizontalLineTo(5f)
                            verticalLineToRelative(-4f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(19f)
                            close()
                            moveTo(13f, 3f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(8f)
                            verticalLineTo(3f)
                            horizontalLineTo(13f)
                            close()
                            moveTo(19f, 9f)
                            horizontalLineToRelative(-4f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(9f)
                            close()
                            moveTo(13f, 13f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-8f)
                            horizontalLineTo(13f)
                            close()
                            moveTo(19f, 19f)
                            horizontalLineToRelative(-4f)
                            verticalLineToRelative(-4f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Grid_view!!
    }

private var _Grid_view: ImageVector? = null

