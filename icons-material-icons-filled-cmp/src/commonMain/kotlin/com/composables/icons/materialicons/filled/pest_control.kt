package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pest_control: ImageVector
    get() {
        if (_Pest_control != null) return _Pest_control!!
        
        _Pest_control = ImageVector.Builder(
            name = "pest_control",
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
                        moveTo(21f, 15f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3.07f)
                        curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f)
                        lineToRelative(2.58f, -1.49f)
                        lineToRelative(-1f, -1.73f)
                        lineTo(16.92f, 10f)
                        curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f)
                        curveTo(15.97f, 8.48f, 16f, 8.25f, 16f, 8f)
                        curveToRelative(0f, -0.8f, -0.24f, -1.55f, -0.65f, -2.18f)
                        lineTo(17f, 4.17f)
                        lineToRelative(-1.41f, -1.41f)
                        lineToRelative(-1.72f, 1.72f)
                        curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0f)
                        lineTo(8.41f, 2.76f)
                        lineTo(7f, 4.17f)
                        lineToRelative(1.65f, 1.65f)
                        curveTo(8.24f, 6.45f, 8f, 7.2f, 8f, 8f)
                        curveToRelative(0f, 0.25f, 0.03f, 0.48f, 0.07f, 0.72f)
                        curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10f)
                        lineTo(4.71f, 8.63f)
                        lineToRelative(-1f, 1.73f)
                        lineToRelative(2.58f, 1.49f)
                        curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3.07f)
                        curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f)
                        lineToRelative(-2.58f, 1.49f)
                        lineToRelative(1f, 1.73f)
                        lineTo(7.08f, 18f)
                        curveToRelative(1.08f, 1.81f, 2.88f, 3f, 4.92f, 3f)
                        reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3f)
                        lineToRelative(2.37f, 1.37f)
                        lineToRelative(1f, -1.73f)
                        lineToRelative(-2.58f, -1.49f)
                        curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f)
                        horizontalLineTo(21f)
                        close()
                        moveTo(13f, 17f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pest_control!!
    }

private var _Pest_control: ImageVector? = null

