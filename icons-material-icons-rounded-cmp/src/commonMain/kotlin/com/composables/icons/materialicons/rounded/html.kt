package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Html: ImageVector
    get() {
        if (_Html != null) return _Html!!
        
        _Html = ImageVector.Builder(
            name = "html",
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
                    moveTo(21f, 15f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(9.75f)
                    curveTo(20f, 9.34f, 20.34f, 9f, 20.75f, 9f)
                    reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(3.75f)
                    horizontalLineToRelative(1.75f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(16f, 10.49f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(3.76f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(13f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10.5f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.75f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveTo(16f, 13.66f, 16f, 13.25f)
                    verticalLineTo(10.49f)
                    close()
                    moveTo(5f, 9.75f)
                    curveTo(5f, 9.34f, 4.66f, 9f, 4.25f, 9f)
                    reflectiveCurveTo(3.5f, 9.34f, 3.5f, 9.75f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9.75f)
                    curveTo(1.5f, 9.34f, 1.16f, 9f, 0.75f, 9f)
                    reflectiveCurveTo(0f, 9.34f, 0f, 9.75f)
                    verticalLineToRelative(4.5f)
                    curveTo(0f, 14.66f, 0.34f, 15f, 0.75f, 15f)
                    reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(12.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1.75f)
                    curveTo(3.5f, 14.66f, 3.84f, 15f, 4.25f, 15f)
                    reflectiveCurveTo(5f, 14.66f, 5f, 14.25f)
                    verticalLineTo(9.75f)
                    close()
                    moveTo(10.25f, 10.5f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    curveTo(11f, 9.34f, 10.66f, 9f, 10.25f, 9f)
                    horizontalLineToRelative(-3.5f)
                    curveTo(6.34f, 9f, 6f, 9.34f, 6f, 9.75f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(3.75f)
                    curveTo(7.75f, 14.66f, 8.09f, 15f, 8.5f, 15f)
                    reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(10.25f)
                    close()
                }
            }
        }.build()
        
        return _Html!!
    }

private var _Html: ImageVector? = null

