package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Lunch_dining: ImageVector
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
                        moveTo(3.37f, 14.28f)
                        curveToRelative(0.79f, -0.29f, 1.17f, -0.78f, 1.99f, -0.78f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(0.81f, 0f, 1.17f, 0.46f, 1.93f, 0.76f)
                        curveToRelative(0.67f, 0.26f, 1.39f, -0.25f, 1.39f, -0.96f)
                        curveToRelative(0f, -0.43f, -0.28f, -0.81f, -0.69f, -0.96f)
                        curveToRelative(-0.97f, -0.35f, -1.22f, -0.83f, -2.65f, -0.83f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.55f, 0f, -1.96f, 0.63f, -2.68f, 0.89f)
                        curveToRelative(-0.39f, 0.14f, -0.65f, 0.52f, -0.65f, 0.94f)
                        curveTo(2.01f, 14.03f, 2.71f, 14.52f, 3.37f, 14.28f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 9f)
                        curveToRelative(0.02f, -4f, -4.28f, -6f, -10f, -6f)
                        curveTo(6.29f, 3f, 2f, 5f, 2f, 9f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(18f)
                        curveTo(21.55f, 10f, 22f, 9.55f, 22f, 9f)
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

