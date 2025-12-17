package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gpp_bad: ImageVector
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
                    moveTo(18.7f, 4.51f)
                    lineToRelative(-6f, -2.25f)
                    curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0f)
                    lineToRelative(-6f, 2.25f)
                    curveTo(4.52f, 4.81f, 4f, 5.55f, 4f, 6.39f)
                    verticalLineToRelative(4.7f)
                    curveToRelative(0f, 4.94f, 3.27f, 9.57f, 7.71f, 10.83f)
                    curveToRelative(0.19f, 0.05f, 0.39f, 0.05f, 0.57f, 0f)
                    curveTo(16.73f, 20.66f, 20f, 16.03f, 20f, 11.09f)
                    verticalLineToRelative(-4.7f)
                    curveTo(20f, 5.55f, 19.48f, 4.81f, 18.7f, 4.51f)
                    close()
                    moveTo(14.8f, 14.79f)
                    lineTo(14.8f, 14.79f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.01f)
                    lineTo(12f, 13.42f)
                    lineToRelative(-1.39f, 1.38f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(10.59f, 12f)
                    lineTo(9.2f, 10.61f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(12f, 10.59f)
                    lineToRelative(1.39f, -1.39f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(13.42f, 12f)
                    lineToRelative(1.38f, 1.38f)
                    curveTo(15.19f, 13.77f, 15.19f, 14.4f, 14.8f, 14.79f)
                    close()
                }
            }
        }.build()
        
        return _Gpp_bad!!
    }

private var _Gpp_bad: ImageVector? = null

