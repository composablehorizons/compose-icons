package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Auto_awesome_mosaic: ImageVector
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
                        moveTo(5f, 5f)
                        horizontalLineTo(9f)
                        verticalLineTo(19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 15f)
                        horizontalLineTo(19f)
                        verticalLineTo(19f)
                        horizontalLineTo(15f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 5f)
                        horizontalLineTo(19f)
                        verticalLineTo(9f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        close()
                    }
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
                        moveTo(9f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 21f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(-8f)
                        verticalLineTo(21f)
                        close()
                        moveTo(15f, 15f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome_mosaic!!
    }

private var _Auto_awesome_mosaic: ImageVector? = null

