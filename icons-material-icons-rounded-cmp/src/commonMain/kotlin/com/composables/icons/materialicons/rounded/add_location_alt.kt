package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_location_alt: ImageVector
    get() {
        if (_Add_location_alt != null) return _Add_location_alt!!
        
        _Add_location_alt = ImageVector.Builder(
            name = "add_location_alt",
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
                    moveTo(19f, 0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(1f)
                    curveTo(18f, 0.45f, 18.45f, 0f, 19f, 0f)
                    close()
                    moveTo(12f, 12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveTo(10.9f, 12f, 12f, 12f)
                    close()
                    moveTo(14.72f, 2.47f)
                    curveTo(14.28f, 2.83f, 14f, 3.38f, 14f, 4f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    curveToRelative(0.32f, 0f, 0.62f, -0.08f, 0.89f, -0.21f)
                    curveTo(19.96f, 9.24f, 20f, 9.71f, 20f, 10.2f)
                    curveToRelative(0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f)
                    curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0f)
                    curveTo(6.45f, 17.12f, 4f, 13.38f, 4f, 10.2f)
                    curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                    curveTo(12.94f, 2f, 13.86f, 2.16f, 14.72f, 2.47f)
                    close()
                }
            }
        }.build()
        
        return _Add_location_alt!!
    }

private var _Add_location_alt: ImageVector? = null

