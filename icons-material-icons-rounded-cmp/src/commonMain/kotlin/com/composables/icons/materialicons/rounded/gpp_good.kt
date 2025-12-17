package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gpp_good: ImageVector
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
                    moveTo(11.3f, 2.26f)
                    lineToRelative(-6f, 2.25f)
                    curveTo(4.52f, 4.81f, 4f, 5.55f, 4f, 6.39f)
                    verticalLineToRelative(4.71f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                    verticalLineTo(6.39f)
                    curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                    lineToRelative(-6f, -2.25f)
                    curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f)
                    close()
                    moveTo(10.23f, 14.83f)
                    lineToRelative(-2.12f, -2.12f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(3.54f, -3.54f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-4.24f, 4.24f)
                    curveTo(11.26f, 15.22f, 10.62f, 15.22f, 10.23f, 14.83f)
                    close()
                }
            }
        }.build()
        
        return _Gpp_good!!
    }

private var _Gpp_good: ImageVector? = null

