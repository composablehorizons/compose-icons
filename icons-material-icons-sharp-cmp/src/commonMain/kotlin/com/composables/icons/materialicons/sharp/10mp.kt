package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`10mp`: ImageVector
    get() {
        if (_10mp != null) return _10mp!!
        
        _10mp = ImageVector.Builder(
            name = "10mp",
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
                        moveTo(13.5f, 7f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(7f)
                        close()
                        moveTo(21f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(3f)
                        close()
                        moveTo(12.5f, 18.5f)
                        horizontalLineTo(11f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(4.5f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(6.5f)
                        verticalLineTo(18.5f)
                        close()
                        moveTo(15f, 18.5f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(18f)
                        verticalLineTo(17f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(18.5f)
                        close()
                        moveTo(10f, 5.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(8.5f)
                        verticalLineTo(7f)
                        horizontalLineTo(7f)
                        verticalLineTo(5.5f)
                        horizontalLineTo(10f)
                        close()
                        moveTo(16.5f, 5.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(16.5f)
                        close()
                        moveTo(15f, 14f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _10mp!!
    }

private var _10mp: ImageVector? = null

