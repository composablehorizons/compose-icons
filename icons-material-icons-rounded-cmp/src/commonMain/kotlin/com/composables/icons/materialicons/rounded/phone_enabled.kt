package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phone_enabled: ImageVector
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
                        moveTo(4.78f, 15.27f)
                        lineToRelative(2.54f, -0.29f)
                        curveToRelative(0.61f, -0.07f, 1.21f, 0.14f, 1.64f, 0.57f)
                        lineToRelative(1.84f, 1.84f)
                        curveToRelative(2.83f, -1.44f, 5.15f, -3.75f, 6.59f, -6.59f)
                        lineToRelative(-1.85f, -1.85f)
                        curveToRelative(-0.43f, -0.43f, -0.64f, -1.03f, -0.57f, -1.64f)
                        lineToRelative(0.29f, -2.52f)
                        curveToRelative(0.12f, -1.01f, 0.97f, -1.77f, 1.99f, -1.77f)
                        horizontalLineToRelative(1.73f)
                        curveToRelative(1.13f, 0f, 2.07f, 0.94f, 2f, 2.07f)
                        curveToRelative(-0.53f, 8.54f, -7.36f, 15.36f, -15.89f, 15.89f)
                        curveToRelative(-1.13f, 0.07f, -2.07f, -0.87f, -2.07f, -2f)
                        verticalLineToRelative(-1.73f)
                        curveTo(3.01f, 16.24f, 3.77f, 15.39f, 4.78f, 15.27f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phone_enabled!!
    }

private var _Phone_enabled: ImageVector? = null

