package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
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
                    moveTo(2.47f, 10.42f)
                    lineToRelative(3.07f, 9.22f)
                    curveTo(5.82f, 20.45f, 6.58f, 21f, 7.44f, 21f)
                    horizontalLineToRelative(9.12f)
                    curveToRelative(0.86f, 0f, 1.63f, -0.55f, 1.9f, -1.37f)
                    lineToRelative(3.07f, -9.22f)
                    curveToRelative(0.28f, -0.84f, -0.03f, -1.76f, -0.75f, -2.27f)
                    lineTo(13.15f, 2.8f)
                    curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0f)
                    lineTo(3.22f, 8.14f)
                    curveTo(2.5f, 8.65f, 2.19f, 9.58f, 2.47f, 10.42f)
                    close()
                }
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null

