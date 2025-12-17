package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Filter_alt_off: ImageVector
    get() {
        if (_Filter_alt_off != null) return _Filter_alt_off!!
        
        _Filter_alt_off = ImageVector.Builder(
            name = "filter_alt_off",
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
                        moveTo(19.79f, 5.61f)
                        curveTo(20.3f, 4.95f, 19.83f, 4f, 19f, 4f)
                        horizontalLineTo(6.83f)
                        lineToRelative(7.97f, 7.97f)
                        lineTo(19.79f, 5.61f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.49f, 20.49f)
                        lineTo(3.51f, 3.51f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(10f, 13f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1.17f)
                        lineToRelative(5.07f, 5.07f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        reflectiveCurveTo(20.88f, 20.88f, 20.49f, 20.49f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Filter_alt_off!!
    }

private var _Filter_alt_off: ImageVector? = null

