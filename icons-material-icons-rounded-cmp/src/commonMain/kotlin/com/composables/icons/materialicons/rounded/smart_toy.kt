package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Smart_toy: ImageVector
    get() {
        if (_Smart_toy != null) return _Smart_toy!!
        
        _Smart_toy = ImageVector.Builder(
            name = "smart_toy",
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
                    moveTo(20f, 9f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 5f, 4f, 5.9f, 4f, 7f)
                    verticalLineToRelative(2f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-4f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    curveTo(23f, 10.34f, 21.66f, 9f, 20f, 9f)
                    close()
                    moveTo(7.5f, 11.5f)
                    curveTo(7.5f, 10.67f, 8.17f, 10f, 9f, 10f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(9.83f, 13f, 9f, 13f)
                    reflectiveCurveTo(7.5f, 12.33f, 7.5f, 11.5f)
                    close()
                    moveTo(15f, 17f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(16f, 16.55f, 15.55f, 17f, 15f, 17f)
                    close()
                    moveTo(15f, 13f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(14.17f, 10f, 15f, 10f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(15.83f, 13f, 15f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Smart_toy!!
    }

private var _Smart_toy: ImageVector? = null

