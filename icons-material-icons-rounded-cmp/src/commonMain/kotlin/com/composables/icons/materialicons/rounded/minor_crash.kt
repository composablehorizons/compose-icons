package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Minor_crash: ImageVector
    get() {
        if (_Minor_crash != null) return _Minor_crash!!
        
        _Minor_crash = ImageVector.Builder(
            name = "minor_crash",
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
                    moveTo(8.71f, 5.71f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(5.71f, 4.12f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.59f, 1.59f)
                    curveTo(9.1f, 4.68f, 9.1f, 5.32f, 8.71f, 5.71f)
                    close()
                    moveTo(18.29f, 2.71f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-1.59f, 1.59f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(1.59f, -1.59f)
                    curveTo(17.27f, 2.32f, 17.9f, 2.32f, 18.29f, 2.71f)
                    close()
                    moveTo(12f, 5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(3f)
                    curveTo(13f, 4.55f, 12.55f, 5f, 12f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Minor_crash!!
    }

private var _Minor_crash: ImageVector? = null

