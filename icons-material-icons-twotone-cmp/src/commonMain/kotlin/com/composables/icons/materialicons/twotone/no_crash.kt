package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_crash: ImageVector
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
                    moveTo(5f, 15f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(7.5f, 19f)
                    curveTo(6.67f, 19f, 6f, 18.33f, 6f, 17.5f)
                    reflectiveCurveTo(6.67f, 16f, 7.5f, 16f)
                    reflectiveCurveTo(9f, 16.67f, 9f, 17.5f)
                    reflectiveCurveTo(8.33f, 19f, 7.5f, 19f)
                    close()
                    moveTo(16.5f, 19f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(17.33f, 19f, 16.5f, 19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.92f, 9.01f)
                    curveTo(18.72f, 8.42f, 18.16f, 8f, 17.5f, 8f)
                    horizontalLineToRelative(-11f)
                    curveTo(5.84f, 8f, 5.29f, 8.42f, 5.08f, 9.01f)
                    lineTo(3f, 15f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-8f)
                    lineTo(18.92f, 9.01f)
                    close()
                    moveTo(6.85f, 10f)
                    horizontalLineToRelative(10.29f)
                    lineToRelative(1.04f, 3f)
                    horizontalLineTo(5.81f)
                    lineTo(6.85f, 10f)
                    close()
                    moveTo(19f, 20f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(20f)
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

