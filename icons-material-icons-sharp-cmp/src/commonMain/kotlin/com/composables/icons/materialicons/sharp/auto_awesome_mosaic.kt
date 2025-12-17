package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_awesome_mosaic: ImageVector
    get() {
        if (_Auto_awesome_mosaic != null) return _Auto_awesome_mosaic!!
        
        _Auto_awesome_mosaic = ImageVector.Builder(
            name = "auto_awesome_mosaic",
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
                        moveTo(3f, 21f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        lineTo(3f, 3f)
                        verticalLineTo(21f)
                        close()
                        moveTo(21f, 3f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        close()
                        moveTo(13f, 21f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(-8f)
                        verticalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome_mosaic!!
    }

private var _Auto_awesome_mosaic: ImageVector? = null

