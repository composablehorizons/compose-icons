package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
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
                        moveTo(21.27f, 10.9f)
                        curveToRelative(-1.21f, -0.33f, -2.31f, -1.46f, -2.29f, -2.89f)
                        curveToRelative(0.01f, -0.56f, -0.4f, -1.02f, -0.96f, -1.01f)
                        curveTo(15.83f, 7.03f, 14f, 5.22f, 14f, 3.02f)
                        curveToRelative(0f, -0.49f, -0.35f, -0.9f, -0.84f, -0.96f)
                        curveTo(6.53f, 1.22f, 2f, 6.81f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(5.61f, 0f, 10.11f, -4.62f, 10f, -10.18f)
                        curveTo(21.99f, 11.38f, 21.69f, 11.01f, 21.27f, 10.9f)
                        close()
                        moveTo(8.5f, 15f)
                        curveTo(7.67f, 15f, 7f, 14.33f, 7f, 13.5f)
                        reflectiveCurveTo(7.67f, 12f, 8.5f, 12f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(9.33f, 15f, 8.5f, 15f)
                        close()
                        moveTo(10.5f, 10f)
                        curveTo(9.67f, 10f, 9f, 9.33f, 9f, 8.5f)
                        reflectiveCurveTo(9.67f, 7f, 10.5f, 7f)
                        reflectiveCurveTo(12f, 7.67f, 12f, 8.5f)
                        reflectiveCurveTo(11.33f, 10f, 10.5f, 10f)
                        close()
                        moveTo(15f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(16f, 15.55f, 15.55f, 16f, 15f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

