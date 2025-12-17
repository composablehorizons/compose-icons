package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Family_restroom: ImageVector
    get() {
        if (_Family_restroom != null) return _Family_restroom!!
        
        _Family_restroom = ImageVector.Builder(
            name = "family_restroom",
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
                    moveTo(16f, 4f)
                    curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                    reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                    reflectiveCurveTo(16f, 5.11f, 16f, 4f)
                    close()
                    moveTo(20f, 22f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(2.5f)
                    lineToRelative(-3f, -9f)
                    lineToRelative(-3f, 0f)
                    lineToRelative(-1.17f, 3.5f)
                    horizontalLineTo(17f)
                    verticalLineTo(22f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(12.5f, 11.5f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                    reflectiveCurveTo(11f, 9.17f, 11f, 10f)
                    reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f)
                    close()
                    moveTo(5.5f, 6f)
                    curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                    reflectiveCurveToRelative(-0.89f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.89f, -2f, 2f)
                    reflectiveCurveTo(4.39f, 6f, 5.5f, 6f)
                    close()
                    moveTo(7.5f, 22f)
                    verticalLineToRelative(-7f)
                    horizontalLineTo(9f)
                    verticalLineTo(7f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(7.5f)
                    close()
                    moveTo(14f, 22f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-5.5f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(18f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Family_restroom!!
    }

private var _Family_restroom: ImageVector? = null

