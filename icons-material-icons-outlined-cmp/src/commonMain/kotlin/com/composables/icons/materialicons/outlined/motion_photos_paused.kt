package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Motion_photos_paused: ImageVector
    get() {
        if (_Motion_photos_paused != null) return _Motion_photos_paused!!
        
        _Motion_photos_paused = ImageVector.Builder(
            name = "motion_photos_paused",
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
                    moveTo(22f, 12f)
                    curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                    reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                    curveToRelative(0f, -1.19f, 0.22f, -2.32f, 0.6f, -3.38f)
                    lineTo(4.48f, 9.3f)
                    curveTo(4.17f, 10.14f, 4f, 11.05f, 4f, 12f)
                    curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                    reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                    reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                    curveToRelative(-0.95f, 0f, -1.85f, 0.17f, -2.69f, 0.48f)
                    lineTo(8.63f, 2.59f)
                    curveTo(9.69f, 2.22f, 10.82f, 2f, 12f, 2f)
                    curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                    close()
                    moveTo(5.5f, 4f)
                    curveTo(4.67f, 4f, 4f, 4.67f, 4f, 5.5f)
                    reflectiveCurveTo(4.67f, 7f, 5.5f, 7f)
                    reflectiveCurveTo(7f, 6.33f, 7f, 5.5f)
                    reflectiveCurveTo(6.33f, 4f, 5.5f, 4f)
                    close()
                    moveTo(11f, 16f)
                    verticalLineTo(8f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(15f, 16f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Motion_photos_paused!!
    }

private var _Motion_photos_paused: ImageVector? = null

