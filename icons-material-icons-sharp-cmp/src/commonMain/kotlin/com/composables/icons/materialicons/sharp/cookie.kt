package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cookie: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.95f, 10.99f)
                        curveToRelative(-1.79f, -0.03f, -3.7f, -1.95f, -2.68f, -4.22f)
                        curveToRelative(-2.98f, 1f, -5.77f, -1.59f, -5.19f, -4.56f)
                        curveTo(6.95f, 0.71f, 2f, 6.58f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveTo(17.89f, 22f, 22.54f, 16.92f, 21.95f, 10.99f)
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

