package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Egg_alt: ImageVector
    get() {
        if (_Egg_alt != null) return _Egg_alt!!
        
        _Egg_alt = ImageVector.Builder(
            name = "egg_alt",
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
                        moveTo(19f, 9f)
                        curveTo(17f, 7f, 15.99f, 2f, 9.97f, 2f)
                        curveTo(4.95f, 2f, 1.94f, 6f, 2f, 11.52f)
                        curveTo(2.06f, 17.04f, 6.96f, 19f, 9.97f, 19f)
                        curveToRelative(2.01f, 0f, 2.01f, 3f, 6.02f, 3f)
                        curveTo(19f, 22f, 22f, 19f, 22f, 15.02f)
                        curveTo(22f, 12f, 21.01f, 11f, 19f, 9f)
                        close()
                        moveTo(12f, 15.5f)
                        curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                        reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                        reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                        reflectiveCurveTo(13.93f, 15.5f, 12f, 15.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Egg_alt!!
    }

private var _Egg_alt: ImageVector? = null

