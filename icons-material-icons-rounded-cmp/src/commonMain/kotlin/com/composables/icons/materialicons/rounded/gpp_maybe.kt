package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gpp_maybe: ImageVector
    get() {
        if (_Gpp_maybe != null) return _Gpp_maybe!!
        
        _Gpp_maybe = ImageVector.Builder(
            name = "gpp_maybe",
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
                    verticalLineToRelative(4.7f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                    verticalLineToRelative(-4.7f)
                    curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                    lineToRelative(-6f, -2.25f)
                    curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f)
                    close()
                    moveTo(12f, 16f)
                    lineTo(12f, 16f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(13f, 15.55f, 12.55f, 16f, 12f, 16f)
                    close()
                    moveTo(12f, 12f)
                    lineTo(12f, 12f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(3f)
                    curveTo(13f, 11.55f, 12.55f, 12f, 12f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Gpp_maybe!!
    }

private var _Gpp_maybe: ImageVector? = null

