package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Share_location: ImageVector
    get() {
        if (_Share_location != null) return _Share_location!!
        
        _Share_location = ImageVector.Builder(
            name = "share_location",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.02f, 20.77f)
                        lineTo(13.02f, 20.77f)
                        curveToRelative(0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.99f)
                        curveToRelative(1.12f, -0.26f, 2.18f, -0.7f, 3.12f, -1.3f)
                        curveToRelative(0.53f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.16f)
                        curveToRelative(-0.77f, 0.49f, -1.62f, 0.85f, -2.53f, 1.05f)
                        curveTo(13.32f, 19.9f, 13.02f, 20.31f, 13.02f, 20.77f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.03f, 12f)
                        curveToRelative(0f, -3.79f, 2.65f, -6.97f, 6.2f, -7.79f)
                        curveToRelative(0.44f, -0.1f, 0.75f, -0.51f, 0.75f, -0.96f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.64f, -0.6f, -1.13f, -1.22f, -0.98f)
                        curveTo(5.33f, 3.29f, 2.03f, 7.26f, 2.03f, 12f)
                        curveToRelative(0f, 4.74f, 3.3f, 8.71f, 7.73f, 9.74f)
                        curveToRelative(0.62f, 0.15f, 1.22f, -0.34f, 1.22f, -0.98f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.46f, -0.31f, -0.86f, -0.75f, -0.96f)
                        curveTo(6.68f, 18.97f, 4.03f, 15.79f, 4.03f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.79f, 11f)
                        lineTo(20.79f, 11f)
                        curveToRelative(0.64f, 0f, 1.13f, -0.59f, 0.99f, -1.21f)
                        curveToRelative(-0.26f, -1.12f, -0.7f, -2.17f, -1.3f, -3.12f)
                        curveToRelative(-0.34f, -0.54f, -1.1f, -0.61f, -1.55f, -0.16f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.32f, 0.32f, -0.4f, 0.83f, -0.15f, 1.21f)
                        curveToRelative(0.49f, 0.76f, 0.85f, 1.61f, 1.05f, 2.53f)
                        curveTo(19.92f, 10.7f, 20.33f, 11f, 20.79f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.35f, 3.55f)
                        curveToRelative(-0.95f, -0.6f, -2f, -1.04f, -3.12f, -1.3f)
                        curveToRelative(-0.62f, -0.14f, -1.21f, 0.35f, -1.21f, 0.98f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.96f)
                        curveToRelative(0.91f, 0.2f, 1.77f, 0.57f, 2.53f, 1.05f)
                        curveToRelative(0.39f, 0.24f, 0.89f, 0.17f, 1.21f, -0.16f)
                        lineToRelative(0f, 0f)
                        curveTo(17.96f, 4.64f, 17.89f, 3.89f, 17.35f, 3.55f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.92f, 17.49f)
                        lineTo(18.92f, 17.49f)
                        curveToRelative(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.16f)
                        curveToRelative(0.6f, -0.94f, 1.04f, -2f, 1.3f, -3.12f)
                        curveToRelative(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.45f, 0f, -0.87f, 0.3f, -0.96f, 0.74f)
                        curveToRelative(-0.2f, 0.91f, -0.57f, 1.77f, -1.05f, 2.53f)
                        curveTo(18.52f, 16.66f, 18.6f, 17.17f, 18.92f, 17.49f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 11.1f)
                        curveTo(16f, 8.61f, 14.1f, 7f, 12f, 7f)
                        reflectiveCurveToRelative(-4f, 1.61f, -4f, 4.1f)
                        curveToRelative(0f, 1.51f, 1.1f, 3.28f, 3.31f, 5.3f)
                        curveToRelative(0.39f, 0.36f, 0.98f, 0.36f, 1.38f, 0f)
                        curveTo(14.9f, 14.37f, 16f, 12.61f, 16f, 11.1f)
                        close()
                        moveTo(12f, 12f)
                        curveToRelative(-0.59f, 0f, -1.07f, -0.48f, -1.07f, -1.07f)
                        curveToRelative(0f, -0.59f, 0.48f, -1.07f, 1.07f, -1.07f)
                        reflectiveCurveToRelative(1.07f, 0.48f, 1.07f, 1.07f)
                        curveTo(13.07f, 11.52f, 12.59f, 12f, 12f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Share_location!!
    }

private var _Share_location: ImageVector? = null

