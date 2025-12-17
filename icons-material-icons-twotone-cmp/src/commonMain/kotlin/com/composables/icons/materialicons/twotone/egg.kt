package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
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
                        moveTo(12f, 5f)
                        curveToRelative(-1.93f, 0f, -5f, 4.91f, -5f, 9f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        curveTo(17f, 9.91f, 13.93f, 5f, 12f, 5f)
                        close()
                        moveTo(13f, 18f)
                        curveToRelative(-3.01f, 0f, -5f, -2f, -5f, -5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 2.92f, 2.42f, 3f, 3f, 3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(13.55f, 18f, 13f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 3f)
                        curveTo(8.5f, 3f, 5f, 9.33f, 5f, 14f)
                        curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                        curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                        curveTo(19f, 9.33f, 15.5f, 3f, 12f, 3f)
                        close()
                        moveTo(12f, 19f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -4.09f, 3.07f, -9f, 5f, -9f)
                        reflectiveCurveToRelative(5f, 4.91f, 5f, 9f)
                        curveTo(17f, 16.76f, 14.76f, 19f, 12f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 16f)
                        curveToRelative(-0.58f, 0f, -3f, -0.08f, -3f, -3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 3f, 1.99f, 5f, 5f, 5f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(13.55f, 16f, 13f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

