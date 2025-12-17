package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wheelchair_pickup: ImageVector
    get() {
        if (_Wheelchair_pickup != null) return _Wheelchair_pickup!!
        
        _Wheelchair_pickup = ImageVector.Builder(
            name = "wheelchair_pickup",
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
                    moveTo(4.5f, 4f)
                    curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                    reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                    reflectiveCurveTo(4.5f, 5.11f, 4.5f, 4f)
                    close()
                    moveTo(10f, 10.95f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 7f, 3f, 7.9f, 3f, 9f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.5f)
                    verticalLineToRelative(-0.11f)
                    curveToRelative(-1.24f, -1.26f, -2f, -2.99f, -2f, -4.89f)
                    curveTo(6.5f, 14.42f, 7.91f, 12.16f, 10f, 10.95f)
                    close()
                    moveTo(16.5f, 17f)
                    curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                    curveToRelative(0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f)
                    verticalLineToRelative(-2.16f)
                    curveTo(9.98f, 12.9f, 8.5f, 14.77f, 8.5f, 17f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                    horizontalLineTo(16.5f)
                    close()
                    moveTo(19f, 14f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4.46f)
                    lineToRelative(1.92f, 2.88f)
                    curveToRelative(0.31f, 0.46f, 0.93f, 0.58f, 1.39f, 0.28f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.46f, -0.31f, 0.58f, -0.93f, 0.28f, -1.39f)
                    lineToRelative(-2.21f, -3.32f)
                    curveTo(19.65f, 14.17f, 19.33f, 14f, 19f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Wheelchair_pickup!!
    }

private var _Wheelchair_pickup: ImageVector? = null

