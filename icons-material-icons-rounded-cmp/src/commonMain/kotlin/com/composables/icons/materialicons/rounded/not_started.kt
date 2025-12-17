package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Not_started: ImageVector
    get() {
        if (_Not_started != null) return _Not_started!!
        
        _Not_started = ImageVector.Builder(
            name = "not_started",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(11f, 15f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(15f)
                    close()
                    moveTo(16.02f, 12.78f)
                    lineToRelative(-2.4f, 1.92f)
                    curveTo(12.97f, 15.22f, 12f, 14.76f, 12f, 13.92f)
                    verticalLineToRelative(-3.84f)
                    curveToRelative(0f, -0.84f, 0.97f, -1.3f, 1.62f, -0.78f)
                    lineToRelative(2.4f, 1.92f)
                    curveTo(16.52f, 11.62f, 16.52f, 12.38f, 16.02f, 12.78f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(24f, 24f)
                    lineTo(0f, 23.97f)
                    lineTo(0f, 0f)
                    lineTo(24f, 0.03f)
                    close()
                }
            }
        }.build()
        
        return _Not_started!!
    }

private var _Not_started: ImageVector? = null

