package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Car_repair: ImageVector
    get() {
        if (_Car_repair != null) return _Car_repair!!
        
        _Car_repair = ImageVector.Builder(
            name = "car_repair",
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
                    moveTo(16.22f, 12f)
                    curveToRelative(0.68f, 0f, 1.22f, -0.54f, 1.22f, -1.22f)
                    curveToRelative(0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f)
                    reflectiveCurveTo(15f, 10.11f, 15f, 10.78f)
                    curveTo(15f, 11.46f, 15.55f, 12f, 16.22f, 12f)
                    close()
                    moveTo(6.56f, 10.78f)
                    curveToRelative(0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f)
                    reflectiveCurveTo(9f, 11.46f, 9f, 10.78f)
                    curveToRelative(0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f)
                    reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f)
                    close()
                    moveTo(7.61f, 4f)
                    lineTo(6.28f, 8f)
                    horizontalLineToRelative(11.43f)
                    lineToRelative(-1.33f, -4f)
                    horizontalLineTo(7.61f)
                    close()
                    moveTo(16.28f, 3f)
                    curveToRelative(0f, 0f, 0.54f, 0.01f, 0.92f, 0.54f)
                    curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f)
                    curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f)
                    curveTo(17.66f, 4.66f, 19f, 8.69f, 19f, 8.69f)
                    verticalLineToRelative(6.5f)
                    curveToRelative(0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                    horizontalLineToRelative(-0.44f)
                    curveTo(17.35f, 16f, 17f, 15.64f, 17f, 15.19f)
                    verticalLineTo(14f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(1.19f)
                    curveTo(7f, 15.64f, 6.65f, 16f, 6.22f, 16f)
                    horizontalLineTo(5.78f)
                    curveTo(5.35f, 16f, 5f, 15.64f, 5f, 15.19f)
                    verticalLineToRelative(-6.5f)
                    curveToRelative(0f, 0f, 1.34f, -4.02f, 1.55f, -4.69f)
                    curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f)
                    curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f)
                    curveTo(7.18f, 3.01f, 7.72f, 3f, 7.72f, 3f)
                    horizontalLineTo(16.28f)
                    close()
                    moveTo(4f, 17.01f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(4f)
                    verticalLineTo(17.01f)
                    close()
                }
            }
        }.build()
        
        return _Car_repair!!
    }

private var _Car_repair: ImageVector? = null

