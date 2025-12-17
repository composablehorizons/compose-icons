package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Manage_accounts: ImageVector
    get() {
        if (_Manage_accounts != null) return _Manage_accounts!!
        
        _Manage_accounts = ImageVector.Builder(
            name = "manage_accounts",
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
                        moveTo(10.67f, 13.02f)
                        curveTo(10.45f, 13.01f, 10.23f, 13f, 10f, 13f)
                        curveToRelative(-2.42f, 0f, -4.68f, 0.67f, -6.61f, 1.82f)
                        curveTo(2.51f, 15.34f, 2f, 16.32f, 2f, 17.35f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8.26f)
                        curveTo(10.47f, 18.87f, 10f, 17.49f, 10f, 16f)
                        curveTo(10f, 14.93f, 10.25f, 13.93f, 10.67f, 13.02f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 10f, 12f)
                        arcTo(4f, 4f, 0f, false, true, 6f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 14f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.75f, 16f)
                        curveToRelative(0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f)
                        lineToRelative(0.84f, -0.73f)
                        curveToRelative(0.18f, -0.16f, 0.22f, -0.42f, 0.1f, -0.63f)
                        lineToRelative(-0.59f, -1.02f)
                        curveToRelative(-0.12f, -0.21f, -0.37f, -0.3f, -0.59f, -0.22f)
                        lineToRelative(-1.06f, 0.36f)
                        curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                        lineToRelative(-0.22f, -1.09f)
                        curveToRelative(-0.05f, -0.23f, -0.25f, -0.4f, -0.49f, -0.4f)
                        horizontalLineToRelative(-1.18f)
                        curveToRelative(-0.24f, 0f, -0.44f, 0.17f, -0.49f, 0.4f)
                        lineToRelative(-0.22f, 1.09f)
                        curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                        lineToRelative(-1.06f, -0.36f)
                        curveToRelative(-0.23f, -0.08f, -0.47f, 0.02f, -0.59f, 0.22f)
                        lineToRelative(-0.59f, 1.02f)
                        curveToRelative(-0.12f, 0.21f, -0.08f, 0.47f, 0.1f, 0.63f)
                        lineToRelative(0.84f, 0.73f)
                        curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f)
                        reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f)
                        lineToRelative(-0.84f, 0.73f)
                        curveToRelative(-0.18f, 0.16f, -0.22f, 0.42f, -0.1f, 0.63f)
                        lineToRelative(0.59f, 1.02f)
                        curveToRelative(0.12f, 0.21f, 0.37f, 0.3f, 0.59f, 0.22f)
                        lineToRelative(1.06f, -0.36f)
                        curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                        lineToRelative(0.22f, 1.09f)
                        curveToRelative(0.05f, 0.23f, 0.25f, 0.4f, 0.49f, 0.4f)
                        horizontalLineToRelative(1.18f)
                        curveToRelative(0.24f, 0f, 0.44f, -0.17f, 0.49f, -0.4f)
                        lineToRelative(0.22f, -1.09f)
                        curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                        lineToRelative(1.06f, 0.36f)
                        curveToRelative(0.23f, 0.08f, 0.47f, -0.02f, 0.59f, -0.22f)
                        lineToRelative(0.59f, -1.02f)
                        curveToRelative(0.12f, -0.21f, 0.08f, -0.47f, -0.1f, -0.63f)
                        lineToRelative(-0.84f, -0.73f)
                        curveTo(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16f)
                        close()
                        moveTo(17f, 18f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        reflectiveCurveTo(18.1f, 18f, 17f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Manage_accounts!!
    }

private var _Manage_accounts: ImageVector? = null

