package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cloud_sync: ImageVector
    get() {
        if (_Cloud_sync != null) return _Cloud_sync!!
        
        _Cloud_sync = ImageVector.Builder(
            name = "cloud_sync",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(24f, 17.48f)
                        curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                        lineTo(15f, 20f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        curveToRelative(0f, -1.6f, 1.26f, -2.9f, 2.84f, -2.98f)
                        curveTo(15.4f, 12.83f, 16.6f, 12f, 18f, 12f)
                        curveToRelative(1.76f, 0f, 3.2f, 1.3f, 3.45f, 2.99f)
                        curveToRelative(0.02f, 0f, 0.03f, -0.01f, 0.05f, -0.01f)
                        curveTo(22.88f, 14.98f, 24f, 16.1f, 24f, 17.48f)
                        close()
                        moveTo(10f, 15f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1.44f)
                        curveToRelative(-1.22f, -1.1f, -2f, -2.67f, -2f, -4.44f)
                        curveToRelative(0f, -2.38f, 1.39f, -4.43f, 3.4f, -5.4f)
                        curveTo(9.77f, 6.42f, 10f, 6.04f, 10f, 5.63f)
                        curveToRelative(0f, -0.71f, -0.73f, -1.18f, -1.37f, -0.88f)
                        curveTo(5.89f, 6.03f, 4f, 8.79f, 4f, 12f)
                        curveToRelative(0f, 2.4f, 1.06f, 4.54f, 2.73f, 6f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(15f)
                        close()
                        moveTo(19f, 6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(7.56f)
                        curveToRelative(0.98f, 0.89f, 1.68f, 2.08f, 1.92f, 3.44f)
                        lineToRelative(2.02f, 0f)
                        curveToRelative(-0.25f, -1.99f, -1.23f, -3.74f, -2.66f, -5f)
                        horizontalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cloud_sync!!
    }

private var _Cloud_sync: ImageVector? = null

