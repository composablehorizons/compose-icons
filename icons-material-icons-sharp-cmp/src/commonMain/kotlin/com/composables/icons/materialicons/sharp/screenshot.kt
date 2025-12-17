package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Screenshot: ImageVector
    get() {
        if (_Screenshot != null) return _Screenshot!!
        
        _Screenshot = ImageVector.Builder(
            name = "screenshot",
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
                        moveTo(5f, 1f)
                        verticalLineToRelative(22f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(1f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(18f)
                        close()
                        moveTo(9.5f, 8.5f)
                        horizontalLineTo(12f)
                        verticalLineTo(7f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(8.5f)
                        close()
                        moveTo(12f, 17f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(2.5f)
                        horizontalLineTo(12f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screenshot!!
    }

private var _Screenshot: ImageVector? = null

