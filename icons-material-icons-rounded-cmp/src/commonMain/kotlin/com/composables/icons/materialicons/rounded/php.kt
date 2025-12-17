package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Php: ImageVector
    get() {
        if (_Php != null) return _Php!!
        
        _Php = ImageVector.Builder(
            name = "php",
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
                    moveTo(6.5f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(20f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(13f, 12.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1.75f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveTo(9.5f, 14.66f, 9.5f, 14.25f)
                    verticalLineToRelative(-4.5f)
                    curveTo(9.5f, 9.34f, 9.84f, 9f, 10.25f, 9f)
                    reflectiveCurveTo(11f, 9.34f, 11f, 9.75f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9.75f)
                    curveTo(13f, 9.34f, 13.34f, 9f, 13.75f, 9f)
                    reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(4.5f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveTo(13f, 14.66f, 13f, 14.25f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(18f, 14.25f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(20f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.68f, 1.5f, 1.5f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(14.25f)
                    close()
                    moveTo(3f, 10f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2.5f)
                    curveTo(7.33f, 9f, 8f, 9.68f, 8f, 10.5f)
                    verticalLineToRelative(1f)
                    curveTo(8f, 12.32f, 7.33f, 13f, 6.5f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1.25f)
                    curveTo(4.5f, 14.66f, 4.16f, 15f, 3.75f, 15f)
                    reflectiveCurveTo(3f, 14.66f, 3f, 14.25f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Php!!
    }

private var _Php: ImageVector? = null

