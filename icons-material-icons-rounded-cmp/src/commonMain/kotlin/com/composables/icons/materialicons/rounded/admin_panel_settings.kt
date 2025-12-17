package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Admin_panel_settings: ImageVector
    get() {
        if (_Admin_panel_settings != null) return _Admin_panel_settings!!
        
        _Admin_panel_settings = ImageVector.Builder(
            name = "admin_panel_settings",
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
                        moveTo(17f, 11f)
                        curveToRelative(0.34f, 0f, 0.67f, 0.04f, 1f, 0.09f)
                        verticalLineTo(7.58f)
                        curveToRelative(0f, -0.8f, -0.47f, -1.52f, -1.2f, -1.83f)
                        lineToRelative(-5.5f, -2.4f)
                        curveToRelative(-0.51f, -0.22f, -1.09f, -0.22f, -1.6f, 0f)
                        lineToRelative(-5.5f, 2.4f)
                        curveTo(3.47f, 6.07f, 3f, 6.79f, 3f, 7.58f)
                        verticalLineToRelative(3.6f)
                        curveToRelative(0f, 4.54f, 3.2f, 8.79f, 7.5f, 9.82f)
                        curveToRelative(0.55f, -0.13f, 1.08f, -0.32f, 1.6f, -0.55f)
                        curveTo(11.41f, 19.47f, 11f, 18.28f, 11f, 17f)
                        curveTo(11f, 13.69f, 13.69f, 11f, 17f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 13f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        curveTo(21f, 14.79f, 19.21f, 13f, 17f, 13f)
                        close()
                        moveTo(17f, 14.38f)
                        curveToRelative(0.62f, 0f, 1.12f, 0.51f, 1.12f, 1.12f)
                        reflectiveCurveToRelative(-0.51f, 1.12f, -1.12f, 1.12f)
                        reflectiveCurveToRelative(-1.12f, -0.51f, -1.12f, -1.12f)
                        reflectiveCurveTo(16.38f, 14.38f, 17f, 14.38f)
                        close()
                        moveTo(17f, 19.75f)
                        curveToRelative(-0.93f, 0f, -1.74f, -0.46f, -2.24f, -1.17f)
                        curveToRelative(0.05f, -0.72f, 1.51f, -1.08f, 2.24f, -1.08f)
                        reflectiveCurveToRelative(2.19f, 0.36f, 2.24f, 1.08f)
                        curveTo(18.74f, 19.29f, 17.93f, 19.75f, 17f, 19.75f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Admin_panel_settings!!
    }

private var _Admin_panel_settings: ImageVector? = null

