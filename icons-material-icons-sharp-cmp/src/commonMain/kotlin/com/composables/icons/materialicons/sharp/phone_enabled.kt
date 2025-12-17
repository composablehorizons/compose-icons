package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_enabled: ImageVector
    get() {
        if (_Phone_enabled != null) return _Phone_enabled!!
        
        _Phone_enabled = ImageVector.Builder(
            name = "phone_enabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 15.46f)
                        lineToRelative(5.27f, -0.61f)
                        lineToRelative(2.52f, 2.52f)
                        curveToRelative(2.83f, -1.44f, 5.15f, -3.75f, 6.59f, -6.59f)
                        lineToRelative(-2.53f, -2.53f)
                        lineTo(15.46f, 3f)
                        horizontalLineToRelative(5.51f)
                        curveTo(21.55f, 13.18f, 13.18f, 21.55f, 3f, 20.97f)
                        verticalLineTo(15.46f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phone_enabled!!
    }

private var _Phone_enabled: ImageVector? = null

