package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
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
                        moveTo(21.41f, 6.33f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-2.53f, 2.54f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(21.41f, 6.33f)
                        close()
                        moveTo(1.39f, 4.22f)
                        lineToRelative(7.32f, 7.32f)
                        lineTo(3f, 17.25f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(3.75f)
                        lineToRelative(5.71f, -5.71f)
                        lineToRelative(7.32f, 7.32f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        close()
                        moveTo(17.81f, 9.94f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-2.52f, 2.52f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(17.81f, 9.94f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

