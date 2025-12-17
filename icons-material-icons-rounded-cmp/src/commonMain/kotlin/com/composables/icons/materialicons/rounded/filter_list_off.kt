package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Filter_list_off: ImageVector
    get() {
        if (_Filter_list_off != null) return _Filter_list_off!!
        
        _Filter_list_off = ImageVector.Builder(
            name = "filter_list_off",
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
                    moveTo(21f, 7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(8.83f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(20f)
                    curveTo(20.55f, 8f, 21f, 7.55f, 21f, 7f)
                    close()
                    moveTo(18f, 12f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(17f)
                    curveTo(17.55f, 13f, 18f, 12.55f, 18f, 12f)
                    close()
                    moveTo(13.98f, 16.81f)
                    curveTo(13.99f, 16.87f, 14f, 16.94f, 14f, 17f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.06f, 0f, 0.13f, 0.01f, 0.19f, 0.02f)
                    lineTo(10.17f, 13f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1.17f)
                    lineToRelative(-3f, -3f)
                    horizontalLineTo(4f)
                    curveTo(3.45f, 8f, 3f, 7.55f, 3f, 7f)
                    curveToRelative(0f, -0.32f, 0.15f, -0.6f, 0.38f, -0.79f)
                    lineTo(2.1f, 4.93f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(16.97f, 16.97f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                    lineTo(13.98f, 16.81f)
                    close()
                }
            }
        }.build()
        
        return _Filter_list_off!!
    }

private var _Filter_list_off: ImageVector? = null

