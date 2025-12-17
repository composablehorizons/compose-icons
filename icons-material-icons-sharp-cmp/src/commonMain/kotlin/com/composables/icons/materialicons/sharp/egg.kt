package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Egg: ImageVector
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
                        moveTo(12f, 3f)
                        curveTo(8.5f, 3f, 5f, 9.33f, 5f, 14f)
                        curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                        reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                        curveTo(19f, 9.33f, 15.5f, 3f, 12f, 3f)
                        close()
                        moveTo(13f, 18f)
                        curveToRelative(-3f, 0f, -5f, -1.99f, -5f, -5f)
                        curveToRelative(0f, -0.55f, 0f, -1f, 0f, -1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, 0f, 0f, 1f, 0f, 1f)
                        curveToRelative(0f, 2.92f, 2.42f, 3f, 3f, 3f)
                        curveToRelative(0.55f, 0f, 1f, 0f, 1f, 0f)
                        lineToRelative(0f, 2f)
                        curveTo(14f, 18f, 13.55f, 18f, 13f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

