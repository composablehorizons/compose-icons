package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_food: ImageVector
    get() {
        if (_No_food != null) return _No_food!!
        
        _No_food = ImageVector.Builder(
            name = "no_food",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 22f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(2f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(13f)
                    curveTo(15.55f, 21f, 16f, 21.45f, 16f, 22f)
                    close()
                    moveTo(22.89f, 6.1f)
                    curveTo(22.95f, 5.51f, 22.49f, 5f, 21.9f, 5f)
                    horizontalLineTo(18f)
                    verticalLineTo(2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3.9f)
                    curveToRelative(-0.59f, 0f, -1.05f, 0.51f, -1f, 1.1f)
                    lineToRelative(0.24f, 2.41f)
                    lineTo(18f, 15.17f)
                    lineToRelative(3.62f, 3.62f)
                    lineTo(22.89f, 6.1f)
                    close()
                    moveTo(21.19f, 22.61f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(12f, 12f)
                    lineTo(9.01f, 9.01f)
                    horizontalLineToRelative(0f)
                    lineToRelative(-6.2f, -6.2f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                    lineToRelative(4.99f, 4.99f)
                    curveToRelative(-2.56f, 0.54f, -4.76f, 2.08f, -5.28f, 4.63f)
                    curveTo(0.99f, 14.45f, 1.49f, 15f, 2.1f, 15f)
                    lineToRelative(10.07f, 0f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(13f)
                    curveToRelative(0.32f, 0f, 0.59f, -0.16f, 0.78f, -0.4f)
                    lineToRelative(4f, 4f)
                    curveTo(20.17f, 23f, 20.8f, 23f, 21.19f, 22.61f)
                    lineTo(21.19f, 22.61f)
                    close()
                }
            }
        }.build()
        
        return _No_food!!
    }

private var _No_food: ImageVector? = null

