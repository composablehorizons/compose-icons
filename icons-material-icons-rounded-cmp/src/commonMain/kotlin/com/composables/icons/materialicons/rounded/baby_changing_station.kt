package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Baby_changing_station: ImageVector
    get() {
        if (_Baby_changing_station != null) return _Baby_changing_station!!
        
        _Baby_changing_station = ImageVector.Builder(
            name = "baby_changing_station",
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
                    moveTo(14f, 9f)
                    lineTo(14f, 9f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1.58f)
                    curveToRelative(-0.28f, 0f, -0.55f, -0.06f, -0.8f, -0.17f)
                    lineToRelative(-2.3f, -1.01f)
                    lineTo(7f, 12.75f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-8.67f)
                    curveToRelative(0f, -0.22f, 0.04f, -0.44f, 0.11f, -0.65f)
                    lineToRelative(1.48f, -4.32f)
                    curveTo(4.96f, 6.25f, 6.22f, 5.69f, 7.3f, 6.18f)
                    lineToRelative(4.15f, 1.83f)
                    lineTo(13f, 8f)
                    curveTo(13.55f, 8f, 14f, 8.45f, 14f, 9f)
                    close()
                    moveTo(8f, 1f)
                    curveTo(6.9f, 1f, 6f, 1.9f, 6f, 3f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(9.1f, 1f, 8f, 1f)
                    close()
                    moveTo(10f, 19f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(10f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(9f, 18.55f, 9.45f, 19f, 10f, 19f)
                    close()
                    moveTo(19.5f, 16f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                    reflectiveCurveTo(18f, 13.67f, 18f, 14.5f)
                    curveTo(18f, 15.33f, 18.67f, 16f, 19.5f, 16f)
                    close()
                    moveTo(13f, 12f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Baby_changing_station!!
    }

private var _Baby_changing_station: ImageVector? = null

