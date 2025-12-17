package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mode_edit: ImageVector
    get() {
        if (_Mode_edit != null) return _Mode_edit!!
        
        _Mode_edit = ImageVector.Builder(
            name = "mode_edit",
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
                        moveTo(3f, 17.25f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(3.75f)
                        lineTo(17.81f, 9.94f)
                        lineToRelative(-3.75f, -3.75f)
                        lineTo(3f, 17.25f)
                        close()
                        moveTo(21.41f, 6.34f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-2.53f, 2.54f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(21.41f, 6.34f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mode_edit!!
    }

private var _Mode_edit: ImageVector? = null

