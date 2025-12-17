package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Doorbell: ImageVector
    get() {
        if (_Doorbell != null) return _Doorbell!!
        
        _Doorbell = ImageVector.Builder(
            name = "doorbell",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.8f, 3.9f)
                    lineToRelative(-6f, 4.5f)
                    curveTo(4.3f, 8.78f, 4f, 9.37f, 4f, 10f)
                    verticalLineToRelative(9f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-9f)
                    curveToRelative(0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                    lineToRelative(-6f, -4.5f)
                    curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                    close()
                    moveTo(12f, 17.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    horizontalLineToRelative(2f)
                    curveTo(13f, 17.05f, 12.55f, 17.5f, 12f, 17.5f)
                    close()
                    moveTo(15.5f, 16f)
                    horizontalLineToRelative(-7f)
                    curveTo(8.22f, 16f, 8f, 15.78f, 8f, 15.5f)
                    verticalLineToRelative(0f)
                    curveTo(8f, 15.22f, 8.22f, 15f, 8.5f, 15f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2.34f)
                    curveToRelative(0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f)
                    verticalLineTo(9.25f)
                    curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                    reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineTo(9.5f)
                    curveTo(14.19f, 9.84f, 15f, 11.12f, 15f, 12.66f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(0.5f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(0f)
                    curveTo(16f, 15.78f, 15.78f, 16f, 15.5f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Doorbell!!
    }

private var _Doorbell: ImageVector? = null

