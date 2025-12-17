package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Forward_5: ImageVector
    get() {
        if (_Forward_5 != null) return _Forward_5!!
        
        _Forward_5 = ImageVector.Builder(
            name = "forward_5",
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
                        moveTo(18f, 13f)
                        curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                        reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                        reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                        verticalLineToRelative(4f)
                        lineToRelative(5f, -5f)
                        lineToRelative(-5f, -5f)
                        verticalLineToRelative(4f)
                        curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                        curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                        curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.03f, 15.38f)
                        curveToRelative(-0.44f, 0f, -0.58f, -0.31f, -0.6f, -0.56f)
                        horizontalLineToRelative(-0.84f)
                        curveToRelative(0.03f, 0.85f, 0.79f, 1.25f, 1.44f, 1.25f)
                        curveToRelative(0.93f, 0f, 1.44f, -0.63f, 1.44f, -1.43f)
                        curveToRelative(0f, -1.33f, -0.97f, -1.44f, -1.3f, -1.44f)
                        curveToRelative(-0.2f, 0f, -0.43f, 0.05f, -0.64f, 0.16f)
                        lineToRelative(0.11f, -0.92f)
                        horizontalLineToRelative(1.7f)
                        verticalLineToRelative(-0.71f)
                        horizontalLineToRelative(-2.39f)
                        lineToRelative(-0.25f, 2.17f)
                        lineToRelative(0.67f, 0.17f)
                        curveToRelative(0.13f, -0.13f, 0.28f, -0.23f, 0.57f, -0.23f)
                        curveToRelative(0.4f, 0f, 0.69f, 0.23f, 0.69f, 0.75f)
                        curveTo(12.62f, 14.64f, 12.65f, 15.38f, 12.03f, 15.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forward_5!!
    }

private var _Forward_5: ImageVector? = null

