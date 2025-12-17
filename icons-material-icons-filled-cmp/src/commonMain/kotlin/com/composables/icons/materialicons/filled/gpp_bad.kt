package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Gpp_bad: ImageVector
    get() {
        if (_Gpp_bad != null) return _Gpp_bad!!
        
        _Gpp_bad = ImageVector.Builder(
            name = "gpp_bad",
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
                    moveTo(15.5f, 14.09f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(12f, 13.42f)
                    lineTo(9.91f, 15.5f)
                    lineTo(8.5f, 14.09f)
                    lineTo(10.59f, 12f)
                    lineTo(8.5f, 9.91f)
                    lineTo(9.91f, 8.5f)
                    lineTo(12f, 10.59f)
                    lineToRelative(2.09f, -2.09f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(13.42f, 12f)
                    lineTo(15.5f, 14.09f)
                    close()
                }
            }
        }.build()
        
        return _Gpp_bad!!
    }

private var _Gpp_bad: ImageVector? = null

