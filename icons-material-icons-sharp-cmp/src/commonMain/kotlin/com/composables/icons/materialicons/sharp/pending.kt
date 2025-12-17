package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pending: ImageVector
    get() {
        if (_Pending != null) return _Pending!!
        
        _Pending = ImageVector.Builder(
            name = "pending",
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
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(7f, 13.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    curveTo(8.5f, 12.83f, 7.83f, 13.5f, 7f, 13.5f)
                    close()
                    moveTo(12f, 13.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    curveTo(13.5f, 12.83f, 12.83f, 13.5f, 12f, 13.5f)
                    close()
                    moveTo(17f, 13.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    curveTo(18.5f, 12.83f, 17.83f, 13.5f, 17f, 13.5f)
                    close()
                }
            }
        }.build()
        
        return _Pending!!
    }

private var _Pending: ImageVector? = null

