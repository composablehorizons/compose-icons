package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_applications: ImageVector
    get() {
        if (_Settings_applications != null) return _Settings_applications!!
        
        _Settings_applications = ImageVector.Builder(
            name = "settings_applications",
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
                        moveTo(14f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 12f)
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
                        curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                        close()
                        moveTo(15.75f, 12f)
                        curveToRelative(0f, 0.22f, -0.03f, 0.42f, -0.06f, 0.63f)
                        lineToRelative(0.84f, 0.73f)
                        curveToRelative(0.18f, 0.16f, 0.22f, 0.42f, 0.1f, 0.63f)
                        lineToRelative(-0.59f, 1.02f)
                        curveToRelative(-0.12f, 0.21f, -0.37f, 0.3f, -0.59f, 0.22f)
                        lineToRelative(-1.06f, -0.36f)
                        curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f)
                        lineToRelative(-0.22f, 1.09f)
                        curveToRelative(-0.05f, 0.23f, -0.25f, 0.4f, -0.49f, 0.4f)
                        horizontalLineToRelative(-1.18f)
                        curveToRelative(-0.24f, 0f, -0.44f, -0.17f, -0.49f, -0.4f)
                        lineToRelative(-0.22f, -1.09f)
                        curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f)
                        lineToRelative(-1.06f, 0.36f)
                        curveToRelative(-0.23f, 0.08f, -0.47f, -0.02f, -0.59f, -0.22f)
                        lineToRelative(-0.59f, -1.02f)
                        curveToRelative(-0.12f, -0.21f, -0.08f, -0.47f, 0.1f, -0.63f)
                        lineToRelative(0.84f, -0.73f)
                        curveTo(8.28f, 12.42f, 8.25f, 12.22f, 8.25f, 12f)
                        reflectiveCurveToRelative(0.03f, -0.42f, 0.06f, -0.63f)
                        lineToRelative(-0.84f, -0.73f)
                        curveToRelative(-0.18f, -0.16f, -0.22f, -0.42f, -0.1f, -0.63f)
                        lineToRelative(0.59f, -1.02f)
                        curveToRelative(0.12f, -0.21f, 0.37f, -0.3f, 0.59f, -0.22f)
                        lineToRelative(1.06f, 0.36f)
                        curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f)
                        lineToRelative(0.22f, -1.09f)
                        curveTo(10.97f, 7.17f, 11.17f, 7f, 11.41f, 7f)
                        horizontalLineToRelative(1.18f)
                        curveToRelative(0.24f, 0f, 0.44f, 0.17f, 0.49f, 0.4f)
                        lineToRelative(0.22f, 1.09f)
                        curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f)
                        lineToRelative(1.06f, -0.36f)
                        curveToRelative(0.23f, -0.08f, 0.47f, 0.02f, 0.59f, 0.22f)
                        lineToRelative(0.59f, 1.02f)
                        curveToRelative(0.12f, 0.21f, 0.08f, 0.47f, -0.1f, 0.63f)
                        lineToRelative(-0.84f, 0.73f)
                        curveTo(15.72f, 11.58f, 15.75f, 11.78f, 15.75f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Settings_applications!!
    }

private var _Settings_applications: ImageVector? = null

