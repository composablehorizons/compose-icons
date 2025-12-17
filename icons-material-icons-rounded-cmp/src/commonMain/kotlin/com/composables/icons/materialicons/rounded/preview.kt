package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Preview: ImageVector
    get() {
        if (_Preview != null) return _Preview!!
        
        _Preview = ImageVector.Builder(
            name = "preview",
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineTo(5f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(19f)
                    close()
                    moveTo(13.5f, 13f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveTo(13.5f, 12.17f, 13.5f, 13f)
                    close()
                    moveTo(12f, 9f)
                    curveToRelative(-2.73f, 0f, -5.06f, 1.66f, -6f, 4f)
                    curveToRelative(0.94f, 2.34f, 3.27f, 4f, 6f, 4f)
                    reflectiveCurveToRelative(5.06f, -1.66f, 6f, -4f)
                    curveTo(17.06f, 10.66f, 14.73f, 9f, 12f, 9f)
                    close()
                    moveTo(12f, 15.5f)
                    curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                    curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                    curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                    curveTo(14.5f, 14.38f, 13.38f, 15.5f, 12f, 15.5f)
                    close()
                }
            }
        }.build()
        
        return _Preview!!
    }

private var _Preview: ImageVector? = null

