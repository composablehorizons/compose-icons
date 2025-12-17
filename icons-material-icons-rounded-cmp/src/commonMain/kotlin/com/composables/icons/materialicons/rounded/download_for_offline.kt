package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Download_for_offline: ImageVector
    get() {
        if (_Download_for_offline != null) return _Download_for_offline!!
        
        _Download_for_offline = ImageVector.Builder(
            name = "download_for_offline",
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
                    moveTo(12f, 2f)
                    curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                    reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                    reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                    close()
                    moveTo(11f, 10f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, 0.54f, 0.35f, 0.85f)
                    lineToRelative(-2.79f, 2.79f)
                    curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                    lineToRelative(-2.79f, -2.79f)
                    curveTo(8.54f, 10.54f, 8.76f, 10f, 9.21f, 10f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(16f, 17f)
                    horizontalLineTo(8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(17f, 16.55f, 16.55f, 17f, 16f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Download_for_offline!!
    }

private var _Download_for_offline: ImageVector? = null

