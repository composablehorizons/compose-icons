package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(2.92f, 2.92f)
                    curveTo(5.02f, 7.9f, 5f, 7.95f, 5f, 8f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0.34f, 0f, 0.65f, -0.09f, 0.93f, -0.24f)
                    lineToRelative(1.14f, 1.14f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                    moveTo(8.75f, 18f)
                    curveTo(8.34f, 18f, 8f, 17.66f, 8f, 17.25f)
                    verticalLineToRelative(-6.42f)
                    lineToRelative(1.5f, 1.5f)
                    verticalLineToRelative(4.92f)
                    curveTo(9.5f, 17.66f, 9.16f, 18f, 8.75f, 18f)
                    close()
                    moveTo(12f, 18f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineToRelative(-3.17f)
                    lineToRelative(1.5f, 1.5f)
                    verticalLineToRelative(1.67f)
                    curveTo(12.75f, 17.66f, 12.41f, 18f, 12f, 18f)
                    close()
                    moveTo(12f, 9f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(0.17f)
                    lineToRelative(1.75f, 1.75f)
                    verticalLineTo(9.75f)
                    curveTo(14.5f, 9.34f, 14.84f, 9f, 15.25f, 9f)
                    reflectiveCurveTo(16f, 9.34f, 16f, 9.75f)
                    verticalLineToRelative(3.42f)
                    lineToRelative(3f, 3f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveTo(9.45f, 2f, 9f, 2.45f, 9f, 3f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(8.83f)
                    lineToRelative(3.03f, 3.03f)
                    curveTo(11.91f, 9.02f, 11.95f, 9f, 12f, 9f)
                    close()
                    moveTo(10.5f, 3.5f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(3.5f)
                    close()
                }
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

