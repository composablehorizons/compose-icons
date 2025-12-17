package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Maps_home_work: ImageVector
    get() {
        if (_Maps_home_work != null) return _Maps_home_work!!
        
        _Maps_home_work = ImageVector.Builder(
            name = "maps_home_work",
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
                        moveTo(1f, 11f)
                        lineTo(1f, 21f)
                        lineTo(6f, 21f)
                        lineTo(6f, 15f)
                        lineTo(10f, 15f)
                        lineTo(10f, 21f)
                        lineTo(15f, 21f)
                        lineTo(15f, 11f)
                        lineTo(8f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 3f)
                        verticalLineToRelative(1.97f)
                        lineToRelative(7f, 5f)
                        verticalLineTo(11f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(3f)
                        horizontalLineTo(10f)
                        close()
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Maps_home_work!!
    }

private var _Maps_home_work: ImageVector? = null

