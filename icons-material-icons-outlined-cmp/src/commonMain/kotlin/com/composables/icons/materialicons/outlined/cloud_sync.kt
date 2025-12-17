package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cloud_sync: ImageVector
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
                        moveTo(21.5f, 14.98f)
                        curveToRelative(-0.02f, 0f, -0.03f, 0f, -0.05f, 0.01f)
                        curveTo(21.2f, 13.3f, 19.76f, 12f, 18f, 12f)
                        curveToRelative(-1.4f, 0f, -2.6f, 0.83f, -3.16f, 2.02f)
                        curveTo(13.26f, 14.1f, 12f, 15.4f, 12f, 17f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        lineToRelative(6.5f, -0.02f)
                        curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                        reflectiveCurveTo(22.88f, 14.98f, 21.5f, 14.98f)
                        close()
                        moveTo(21.51f, 18f)
                        lineTo(21.51f, 18f)
                        lineTo(15f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(1.25f)
                        verticalLineToRelative(-0.25f)
                        curveToRelative(0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                        reflectiveCurveToRelative(1.75f, 0.78f, 1.75f, 1.75f)
                        verticalLineTo(17f)
                        curveToRelative(0f, 0f, 1.75f, 0f, 1.76f, 0f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        curveTo(22f, 17.77f, 21.78f, 18f, 21.51f, 18f)
                        close()
                        moveTo(10f, 4.26f)
                        verticalLineToRelative(2.09f)
                        curveTo(7.67f, 7.18f, 6f, 9.39f, 6f, 12f)
                        curveToRelative(0f, 1.77f, 0.78f, 3.34f, 2f, 4.44f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2.73f)
                        curveTo(5.06f, 16.54f, 4f, 14.4f, 4f, 12f)
                        curveTo(4f, 8.27f, 6.55f, 5.15f, 10f, 4.26f)
                        close()
                        moveTo(20f, 6f)
                        horizontalLineToRelative(-2.73f)
                        curveToRelative(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5f)
                        lineToRelative(-2.02f, 0f)
                        curveTo(17.68f, 9.64f, 16.98f, 8.45f, 16f, 7.56f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cloud_sync!!
    }

private var _Cloud_sync: ImageVector? = null

