package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SquareRootAlt: ImageVector
    get() {
        if (_SquareRootAlt != null) return _SquareRootAlt!!
        
        _SquareRootAlt = ImageVector.Builder(
            name = "square-root-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(571.31f, 251.31f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineTo(480f, 274.75f)
                lineToRelative(-46.06f, -46.06f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineToRelative(-22.62f, 22.62f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineTo(434.75f, 320f)
                lineToRelative(-46.06f, 46.06f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineTo(480f, 365.25f)
                lineToRelative(46.06f, 46.06f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(22.62f, -22.62f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineTo(525.25f, 320f)
                lineToRelative(46.06f, -46.06f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                close()
                moveTo(552f, 0f)
                horizontalLineTo(307.65f)
                curveToRelative(-14.54f, 0f, -27.26f, 9.8f, -30.95f, 23.87f)
                lineToRelative(-84.79f, 322.8f)
                lineToRelative(-58.41f, -106.1f)
                arcTo(32.008f, 32.008f, 0f, false, false, 105.47f, 224f)
                horizontalLineTo(24f)
                curveToRelative(-13.25f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(43.62f)
                lineToRelative(88.88f, 163.73f)
                curveTo(168.99f, 503.5f, 186.3f, 512f, 204.94f, 512f)
                curveToRelative(17.27f, 0f, 44.44f, -9f, 54.28f, -41.48f)
                lineTo(357.03f, 96f)
                horizontalLineTo(552f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _SquareRootAlt!!
    }

private var _SquareRootAlt: ImageVector? = null

