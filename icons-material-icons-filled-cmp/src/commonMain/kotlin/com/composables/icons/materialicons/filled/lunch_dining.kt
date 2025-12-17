package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Lunch_dining: ImageVector
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
                        moveTo(22f, 10f)
                        curveToRelative(0.32f, -3.28f, -4.28f, -6f, -9.99f, -6f)
                        curveTo(6.3f, 4f, 1.7f, 6.72f, 2.02f, 10f)
                        horizontalLineTo(22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.35f, 13.5f)
                        curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                        curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                        reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                        curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                        curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                        curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                        curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.18f, -0.64f)
                        curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                        curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                        curveToRelative(0.45f, 0.27f, 1.07f, 0.63f, 2.17f, 0.64f)
                        verticalLineToRelative(-1.98f)
                        curveToRelative(0f, 0f, -0.79f, -0.16f, -1.16f, -0.38f)
                        curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                        curveToRelative(-1.11f, 0f, -1.73f, 0.37f, -2.18f, 0.64f)
                        curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f)
                        reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f)
                        curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                        reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                        curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                        curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
                        curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                        curveToRelative(-1.11f, 0f, -1.73f, 0.37f, -2.18f, 0.64f)
                        curveTo(2.78f, 12.37f, 2.56f, 12.5f, 2f, 12.5f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.21f, -0.64f)
                        curveTo(4.58f, 13.63f, 4.8f, 13.5f, 5.35f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 16f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lunch_dining!!
    }

private var _Lunch_dining: ImageVector? = null

