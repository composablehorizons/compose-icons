package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phone_locked: ImageVector
    get() {
        if (_Phone_locked != null) return _Phone_locked!!
        
        _Phone_locked = ImageVector.Builder(
            name = "phone_locked",
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
                        moveTo(20f, 5f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(5f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(19f, 5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.63f, 14.4f)
                        lineToRelative(-2.52f, 2.5f)
                        curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6f, -6f)
                        lineToRelative(2.5f, -2.52f)
                        curveToRelative(0.23f, -0.24f, 0.33f, -0.57f, 0.27f, -0.9f)
                        lineTo(9.13f, 3.8f)
                        curveTo(9.04f, 3.34f, 8.63f, 3f, 8.15f, 3f)
                        lineTo(4f, 3f)
                        curveTo(3.44f, 3f, 2.97f, 3.47f, 3f, 4.03f)
                        curveTo(3.17f, 6.92f, 4.05f, 9.63f, 5.43f, 12f)
                        curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                        curveToRelative(2.37f, 1.37f, 5.08f, 2.26f, 7.97f, 2.43f)
                        curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1f)
                        lineToRelative(0f, -4.15f)
                        curveToRelative(0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f)
                        lineToRelative(-3.67f, -0.73f)
                        curveTo(16.2f, 14.07f, 15.86f, 14.17f, 15.63f, 14.4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phone_locked!!
    }

private var _Phone_locked: ImageVector? = null

