package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9.27f, 4.49f)
                    curveToRelative(-1.63f, 7.54f, 3.75f, 12.41f, 7.66f, 13.8f)
                    curveTo(15.54f, 19.38f, 13.81f, 20f, 12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    curveTo(4f, 8.55f, 6.2f, 5.6f, 9.27f, 4.49f)
                    moveTo(11.99f, 2.01f)
                    curveTo(6.4f, 2.01f, 2f, 6.54f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    curveToRelative(3.71f, 0f, 6.93f, -2.02f, 8.66f, -5.02f)
                    curveToRelative(-7.51f, -0.25f, -12.09f, -8.43f, -8.32f, -14.97f)
                    curveTo(12.22f, 2.01f, 12.11f, 2.01f, 11.99f, 2.01f)
                    lineTo(11.99f, 2.01f)
                    close()
                }
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

