package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_awesome_mosaic: ImageVector
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
                        moveTo(3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                        close()
                        moveTo(19f, 3f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(13f, 21f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-6f)
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

