package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mp: ImageVector
    get() {
        if (_Mp != null) return _Mp!!
        
        _Mp = ImageVector.Builder(
            name = "mp",
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
                        moveTo(21f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(3f)
                        close()
                        moveTo(6f, 9f)
                        horizontalLineToRelative(6.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(-4.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(15f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        close()
                        moveTo(15f, 15f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(9f)
                        horizontalLineTo(18f)
                        verticalLineToRelative(4.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(15f)
                        close()
                        moveTo(15f, 12f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mp!!
    }

private var _Mp: ImageVector? = null

