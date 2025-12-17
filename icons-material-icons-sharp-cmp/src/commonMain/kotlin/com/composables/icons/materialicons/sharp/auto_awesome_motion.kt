package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_awesome_motion: ImageVector
    get() {
        if (_Auto_awesome_motion != null) return _Auto_awesome_motion!!
        
        _Auto_awesome_motion = ImageVector.Builder(
            name = "auto_awesome_motion",
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
                        moveTo(14f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(2f)
                        close()
                        moveTo(18f, 6f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(6f)
                        close()
                        moveTo(22f, 10f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome_motion!!
    }

private var _Auto_awesome_motion: ImageVector? = null

