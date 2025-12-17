package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Grid_4x4: ImageVector
    get() {
        if (_Grid_4x4 != null) return _Grid_4x4!!
        
        _Grid_4x4 = ImageVector.Builder(
            name = "grid_4x4",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(22f, 7f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(7f)
                        verticalLineTo(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(7f)
                        horizontalLineTo(22f)
                        close()
                        moveTo(7f, 7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        close()
                        moveTo(7f, 17f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(17f, 17f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(17f)
                        close()
                        moveTo(17f, 11f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Grid_4x4!!
    }

private var _Grid_4x4: ImageVector? = null

