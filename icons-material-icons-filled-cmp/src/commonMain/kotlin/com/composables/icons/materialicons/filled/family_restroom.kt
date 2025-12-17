package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Family_restroom: ImageVector
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
                    lineToRelative(-2.54f, -7.63f)
                    curveTo(19.68f, 7.55f, 18.92f, 7f, 18.06f, 7f)
                    horizontalLineToRelative(-0.12f)
                    curveToRelative(-0.86f, 0f, -1.63f, 0.55f, -1.9f, 1.37f)
                    lineToRelative(-0.86f, 2.58f)
                    curveTo(16.26f, 11.55f, 17f, 12.68f, 17f, 14f)
                    verticalLineToRelative(8f)
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
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(7.5f)
                    close()
                    moveTo(14f, 22f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.82f, 0f, -1.5f, 0.68f, -1.5f, 1.5f)
                    verticalLineToRelative(4f)
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

