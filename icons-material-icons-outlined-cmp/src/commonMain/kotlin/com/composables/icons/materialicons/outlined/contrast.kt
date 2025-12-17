package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Contrast: ImageVector
    get() {
        if (_Contrast != null) return _Contrast!!
        
        _Contrast = ImageVector.Builder(
            name = "contrast",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 22f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                    reflectiveCurveTo(6.48f, 22f, 12f, 22f)
                    close()
                    moveTo(13f, 4.07f)
                    curveToRelative(3.94f, 0.49f, 7f, 3.85f, 7f, 7.93f)
                    reflectiveCurveToRelative(-3.05f, 7.44f, -7f, 7.93f)
                    verticalLineTo(4.07f)
                    close()
                }
            }
        }.build()
        
        return _Contrast!!
    }

private var _Contrast: ImageVector? = null

