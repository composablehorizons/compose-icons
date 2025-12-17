package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_crash: ImageVector
    get() {
        if (_No_crash != null) return _No_crash!!
        
        _No_crash = ImageVector.Builder(
            name = "no_crash",
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
                    moveTo(19.5f, 24f)
                    curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineToRelative(-7.16f)
                    curveToRelative(0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                    lineToRelative(-1.97f, -5.67f)
                    curveTo(18.72f, 8.42f, 18.16f, 8f, 17.5f, 8f)
                    horizontalLineToRelative(-11f)
                    curveTo(5.84f, 8f, 5.29f, 8.42f, 5.08f, 9.01f)
                    lineToRelative(-1.97f, 5.67f)
                    curveTo(3.04f, 14.89f, 3f, 15.11f, 3f, 15.34f)
                    verticalLineToRelative(7.16f)
                    curveTo(3f, 23.33f, 3.68f, 24f, 4.5f, 24f)
                    reflectiveCurveTo(6f, 23.33f, 6f, 22.5f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(0.5f)
                    curveTo(18f, 23.33f, 18.67f, 24f, 19.5f, 24f)
                    close()
                    moveTo(6.85f, 10f)
                    horizontalLineToRelative(10.29f)
                    lineToRelative(1.04f, 3f)
                    horizontalLineTo(5.81f)
                    lineTo(6.85f, 10f)
                    close()
                    moveTo(6f, 17.5f)
                    curveTo(6f, 16.67f, 6.67f, 16f, 7.5f, 16f)
                    reflectiveCurveTo(9f, 16.67f, 9f, 17.5f)
                    reflectiveCurveTo(8.33f, 19f, 7.5f, 19f)
                    reflectiveCurveTo(6f, 18.33f, 6f, 17.5f)
                    close()
                    moveTo(15f, 17.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(17.33f, 19f, 16.5f, 19f)
                    reflectiveCurveTo(15f, 18.33f, 15f, 17.5f)
                    close()
                    moveTo(16.24f, 0.71f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-3.54f, 3.54f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(9.88f, 4.24f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(12f, 3.54f)
                    lineToRelative(2.83f, -2.83f)
                    curveTo(15.22f, 0.32f, 15.85f, 0.32f, 16.24f, 0.71f)
                    close()
                }
            }
        }.build()
        
        return _No_crash!!
    }

private var _No_crash: ImageVector? = null

