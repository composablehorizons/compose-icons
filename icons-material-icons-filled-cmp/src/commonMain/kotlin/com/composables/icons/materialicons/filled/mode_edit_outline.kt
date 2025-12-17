package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mode_edit_outline: ImageVector
    get() {
        if (_Mode_edit_outline != null) return _Mode_edit_outline!!
        
        _Mode_edit_outline = ImageVector.Builder(
            name = "mode_edit_outline",
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
                            moveTo(3f, 17.25f)
                            lineTo(3f, 21f)
                            lineTo(6.75f, 21f)
                            lineTo(17.81f, 9.94f)
                            lineTo(14.06f, 6.19f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.71f, 5.63f)
                            lineToRelative(-2.34f, -2.34f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-1.83f, 1.83f)
                            lineToRelative(3.75f, 3.75f)
                            lineToRelative(1.83f, -1.83f)
                            curveTo(21.1f, 6.65f, 21.1f, 6.02f, 20.71f, 5.63f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Mode_edit_outline!!
    }

private var _Mode_edit_outline: ImageVector? = null

