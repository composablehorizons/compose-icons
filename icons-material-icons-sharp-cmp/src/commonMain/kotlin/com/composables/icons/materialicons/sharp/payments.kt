package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Payments: ImageVector
    get() {
        if (_Payments != null) return _Payments!!
        
        _Payments = ImageVector.Builder(
            name = "payments",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(23f, 7f)
                    verticalLineToRelative(13f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(17f)
                    verticalLineTo(7f)
                    horizontalLineTo(23f)
                    close()
                    moveTo(19f, 16f)
                    horizontalLineTo(1f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(16f)
                    close()
                    moveTo(13f, 10f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveTo(13f, 11.66f, 13f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Payments!!
    }

private var _Payments: ImageVector? = null

