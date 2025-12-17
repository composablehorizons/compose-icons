package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Minor_crash: ImageVector
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
                    moveTo(9.41f, 5f)
                    lineTo(8f, 6.41f)
                    lineToRelative(-3f, -3f)
                    lineTo(6.41f, 2f)
                    lineTo(9.41f, 5f)
                    close()
                    moveTo(19f, 3.41f)
                    lineTo(17.59f, 2f)
                    lineToRelative(-3f, 3f)
                    lineTo(16f, 6.41f)
                    lineTo(19f, 3.41f)
                    close()
                    moveTo(13f, 0f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(0f)
                    close()
                    moveTo(21f, 15f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-8f)
                    lineToRelative(2.08f, -5.99f)
                    curveTo(5.29f, 8.42f, 5.84f, 8f, 6.5f, 8f)
                    horizontalLineToRelative(11f)
                    curveToRelative(0.66f, 0f, 1.22f, 0.42f, 1.42f, 1.01f)
                    lineTo(21f, 15f)
                    close()
                    moveTo(5.81f, 13f)
                    horizontalLineToRelative(12.38f)
                    lineToRelative(-1.04f, -3f)
                    horizontalLineTo(6.85f)
                    lineTo(5.81f, 13f)
                    close()
                    moveTo(19f, 15f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(15f)
                    close()
                    moveTo(7.5f, 19f)
                    curveTo(8.33f, 19f, 9f, 18.33f, 9f, 17.5f)
                    reflectiveCurveTo(8.33f, 16f, 7.5f, 16f)
                    reflectiveCurveTo(6f, 16.67f, 6f, 17.5f)
                    reflectiveCurveTo(6.67f, 19f, 7.5f, 19f)
                    close()
                    moveTo(16.5f, 19f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveTo(17.33f, 16f, 16.5f, 16f)
                    reflectiveCurveTo(15f, 16.67f, 15f, 17.5f)
                    reflectiveCurveTo(15.67f, 19f, 16.5f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Minor_crash!!
    }

private var _Minor_crash: ImageVector? = null

