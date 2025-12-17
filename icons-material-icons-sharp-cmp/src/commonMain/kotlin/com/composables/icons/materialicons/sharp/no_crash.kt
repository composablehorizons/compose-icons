package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_crash: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.57f, 8f)
                    horizontalLineTo(5.43f)
                    lineTo(3f, 15f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-9f)
                    lineTo(18.57f, 8f)
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
                    moveTo(12f, 6.36f)
                    lineTo(9.17f, 3.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(12f, 3.54f)
                    lineTo(15.54f, 0f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(12f, 6.36f)
                    close()
                }
            }
        }.build()
        
        return _No_crash!!
    }

private var _No_crash: ImageVector? = null

