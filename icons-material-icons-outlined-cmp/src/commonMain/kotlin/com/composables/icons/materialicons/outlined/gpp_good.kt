package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Gpp_good: ImageVector
    get() {
        if (_Gpp_good != null) return _Gpp_good!!
        
        _Gpp_good = ImageVector.Builder(
            name = "gpp_good",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                    lineTo(4f, 5f)
                    verticalLineToRelative(6.09f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                    verticalLineTo(5f)
                    lineTo(12f, 2f)
                    close()
                    moveTo(18f, 11.09f)
                    curveToRelative(0f, 4f, -2.55f, 7.7f, -6f, 8.83f)
                    curveToRelative(-3.45f, -1.13f, -6f, -4.82f, -6f, -8.83f)
                    verticalLineTo(6.31f)
                    lineToRelative(6f, -2.12f)
                    lineToRelative(6f, 2.12f)
                    verticalLineTo(11.09f)
                    close()
                    moveTo(8.82f, 10.59f)
                    lineTo(7.4f, 12f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(5.66f, -5.66f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-4.24f, 4.24f)
                    lineTo(8.82f, 10.59f)
                    close()
                }
            }
        }.build()
        
        return _Gpp_good!!
    }

private var _Gpp_good: ImageVector? = null

