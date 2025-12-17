package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_locked: ImageVector
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
                        moveTo(21f, 15f)
                        lineToRelative(-5f, -1f)
                        lineToRelative(-2.9f, 2.9f)
                        curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6f, -6f)
                        lineTo(10f, 8f)
                        lineTo(9f, 3f)
                        lineTo(3f, 3f)
                        curveToRelative(0f, 3.28f, 0.89f, 6.35f, 2.43f, 9f)
                        curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                        curveToRelative(2.65f, 1.53f, 5.72f, 2.43f, 9f, 2.43f)
                        lineTo(21f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phone_locked!!
    }

private var _Phone_locked: ImageVector? = null

