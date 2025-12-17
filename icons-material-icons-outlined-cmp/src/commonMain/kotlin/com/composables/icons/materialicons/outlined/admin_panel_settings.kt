package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Admin_panel_settings: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.12f, 15.5f)
                        arcTo(1.12f, 1.12f, 0f, false, true, 17f, 16.62f)
                        arcTo(1.12f, 1.12f, 0f, false, true, 15.88f, 15.5f)
                        arcTo(1.12f, 1.12f, 0f, false, true, 18.12f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 17.5f)
                        curveToRelative(-0.73f, 0f, -2.19f, 0.36f, -2.24f, 1.08f)
                        curveToRelative(0.5f, 0.71f, 1.32f, 1.17f, 2.24f, 1.17f)
                        reflectiveCurveToRelative(1.74f, -0.46f, 2.24f, -1.17f)
                        curveTo(19.19f, 17.86f, 17.73f, 17.5f, 17f, 17.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 11.09f)
                        verticalLineTo(6.27f)
                        lineTo(10.5f, 3f)
                        lineTo(3f, 6.27f)
                        verticalLineToRelative(4.91f)
                        curveToRelative(0f, 4.54f, 3.2f, 8.79f, 7.5f, 9.82f)
                        curveToRelative(0.55f, -0.13f, 1.08f, -0.32f, 1.6f, -0.55f)
                        curveTo(13.18f, 21.99f, 14.97f, 23f, 17f, 23f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        curveTo(23f, 14.03f, 20.84f, 11.57f, 18f, 11.09f)
                        close()
                        moveTo(11f, 17f)
                        curveToRelative(0f, 0.56f, 0.08f, 1.11f, 0.23f, 1.62f)
                        curveToRelative(-0.24f, 0.11f, -0.48f, 0.22f, -0.73f, 0.3f)
                        curveToRelative(-3.17f, -1f, -5.5f, -4.24f, -5.5f, -7.74f)
                        verticalLineToRelative(-3.6f)
                        lineToRelative(5.5f, -2.4f)
                        lineToRelative(5.5f, 2.4f)
                        verticalLineToRelative(3.51f)
                        curveTo(13.16f, 11.57f, 11f, 14.03f, 11f, 17f)
                        close()
                        moveTo(17f, 21f)
                        curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                        curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                        reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                        curveTo(21f, 19.21f, 19.21f, 21f, 17f, 21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Admin_panel_settings!!
    }

private var _Admin_panel_settings: ImageVector? = null

