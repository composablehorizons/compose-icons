package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Zoom_in_map: ImageVector
    get() {
        if (_Zoom_in_map != null) return _Zoom_in_map!!
        
        _Zoom_in_map = ImageVector.Builder(
            name = "zoom_in_map",
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
                    moveTo(3f, 8f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    lineToRelative(4f, 0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    lineToRelative(0f, -4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(7f, 3.45f, 7f, 4f)
                    lineToRelative(0f, 1.59f)
                    lineTo(4.62f, 3.21f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineTo(5.59f, 7f)
                    lineTo(4f, 7f)
                    curveTo(3.45f, 7f, 3f, 7.45f, 3f, 8f)
                    close()
                    moveTo(20f, 7f)
                    horizontalLineToRelative(-1.59f)
                    lineToRelative(2.38f, -2.38f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(17f, 5.59f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(20.55f, 7f, 20f, 7f)
                    close()
                    moveTo(4f, 17f)
                    horizontalLineToRelative(1.59f)
                    lineToRelative(-2.38f, 2.38f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineTo(7f, 18.41f)
                    lineTo(7f, 20f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    lineToRelative(0f, -4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    lineToRelative(-4f, 0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveTo(3f, 16.55f, 3.45f, 17f, 4f, 17f)
                    close()
                    moveTo(21f, 16f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.59f)
                    lineToRelative(2.38f, 2.38f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(18.41f, 17f)
                    horizontalLineTo(20f)
                    curveTo(20.55f, 17f, 21f, 16.55f, 21f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Zoom_in_map!!
    }

private var _Zoom_in_map: ImageVector? = null

