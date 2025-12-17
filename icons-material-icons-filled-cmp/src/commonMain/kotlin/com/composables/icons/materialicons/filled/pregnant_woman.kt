package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pregnant_woman: ImageVector
    get() {
        if (_Pregnant_woman != null) return _Pregnant_woman!!
        
        _Pregnant_woman = ImageVector.Builder(
            name = "pregnant_woman",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 4f)
                            curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                            reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                            reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                            reflectiveCurveTo(9f, 5.11f, 9f, 4f)
                            close()
                            moveTo(16f, 13f)
                            curveToRelative(-0.01f, -1.34f, -0.83f, -2.51f, -2f, -3f)
                            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                            verticalLineToRelative(7f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-5f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Pregnant_woman!!
    }

private var _Pregnant_woman: ImageVector? = null

