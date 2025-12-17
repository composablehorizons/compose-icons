package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`17mp`: ImageVector
    get() {
        if (_17mp != null) return _17mp!!
        
        _17mp = ImageVector.Builder(
            name = "17mp",
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
                        moveTo(3f, 3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(3f)
                        horizontalLineTo(3f)
                        close()
                        moveTo(7f, 5.5f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(8.5f)
                        verticalLineTo(7f)
                        horizontalLineTo(7f)
                        verticalLineTo(5.5f)
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
                        moveTo(12f, 7f)
                        verticalLineTo(5.5f)
                        horizontalLineToRelative(4.87f)
                        lineToRelative(-1.87f, 6f)
                        horizontalLineToRelative(-1.75f)
                        lineTo(14.62f, 7f)
                        horizontalLineTo(12f)
                        close()
                        moveTo(18f, 17f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(18f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 14f)
                        horizontalLineTo(16.5f)
                        verticalLineTo(15.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _17mp!!
    }

private var _17mp: ImageVector? = null

