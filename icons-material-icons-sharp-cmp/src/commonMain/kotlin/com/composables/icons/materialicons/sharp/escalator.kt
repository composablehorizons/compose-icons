package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Escalator: ImageVector
    get() {
        if (_Escalator != null) return _Escalator!!
        
        _Escalator = ImageVector.Builder(
            name = "escalator",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        lineTo(21f, 3f)
                        close()
                        moveTo(18.5f, 9f)
                        horizontalLineToRelative(-3.2f)
                        lineToRelative(-5f, 9f)
                        horizontalLineTo(5.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3.2f)
                        lineToRelative(5f, -9f)
                        horizontalLineToRelative(4.8f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Escalator!!
    }

private var _Escalator: ImageVector? = null

