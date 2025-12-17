package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lunch_dining: ImageVector
    get() {
        if (_Lunch_dining != null) return _Lunch_dining!!
        
        _Lunch_dining = ImageVector.Builder(
            name = "lunch_dining",
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
                        moveTo(2f, 16f)
                        horizontalLineTo(22f)
                        verticalLineTo(21f)
                        horizontalLineTo(2f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.66f, 11.5f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.9f, 0f, 2.17f, -1f, 3.35f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.4f, 0.98f, 3.32f, 1f)
                        lineToRelative(-0.01f, -1.98f)
                        curveTo(20.38f, 12.19f, 20.37f, 11.5f, 18.66f, 11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 9f)
                        curveToRelative(0.02f, -4f, -4.28f, -6f, -10f, -6f)
                        curveTo(6.29f, 3f, 2f, 5f, 2f, 9f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(20f)
                        lineTo(22f, 9f)
                        lineTo(22f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lunch_dining!!
    }

private var _Lunch_dining: ImageVector? = null

