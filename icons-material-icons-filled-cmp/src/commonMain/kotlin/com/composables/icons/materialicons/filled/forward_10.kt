package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Forward_10: ImageVector
    get() {
        if (_Forward_10 != null) return _Forward_10!!
        
        _Forward_10 = ImageVector.Builder(
            name = "forward_10",
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
                        reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.86f, 15.94f)
                        lineTo(10.86f, 11.67f)
                        lineTo(10.77f, 11.67f)
                        lineTo(9f, 12.3f)
                        lineTo(9f, 12.99f)
                        lineTo(10.01f, 12.68f)
                        lineTo(10.01f, 15.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.25f, 13.44f)
                        verticalLineToRelative(0.74f)
                        curveToRelative(0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f)
                        curveToRelative(0.14f, 0f, 1.44f, 0.09f, 1.44f, -1.82f)
                        verticalLineToRelative(-0.74f)
                        curveToRelative(0f, -1.9f, -1.31f, -1.82f, -1.44f, -1.82f)
                        curveTo(13.55f, 11.62f, 12.25f, 11.53f, 12.25f, 13.44f)
                        close()
                        moveTo(14.29f, 13.32f)
                        verticalLineToRelative(0.97f)
                        curveToRelative(0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f)
                        curveToRelative(-0.38f, 0f, -0.6f, -0.26f, -0.6f, -1.03f)
                        verticalLineToRelative(-0.97f)
                        curveToRelative(0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f)
                        curveTo(14.07f, 12.3f, 14.29f, 12.57f, 14.29f, 13.32f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forward_10!!
    }

private var _Forward_10: ImageVector? = null

