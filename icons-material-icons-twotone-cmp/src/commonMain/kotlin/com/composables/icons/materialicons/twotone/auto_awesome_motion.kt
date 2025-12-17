package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Auto_awesome_motion: ImageVector
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
                        moveTo(12f, 12f)
                        horizontalLineTo(20f)
                        verticalLineTo(20f)
                        horizontalLineTo(12f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-8f)
                        curveTo(22f, 10.9f, 21.1f, 10f, 20f, 10f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 6f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 6f, 6f, 6.9f, 6f, 8f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome_motion!!
    }

private var _Auto_awesome_motion: ImageVector? = null

