package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FootballBall: ImageVector
    get() {
        if (_FootballBall != null) return _FootballBall!!
        
        _FootballBall = ImageVector.Builder(
            name = "football-ball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481.5f, 60.3f)
                curveToRelative(-4.8f, -18.2f, -19.1f, -32.5f, -37.3f, -37.4f)
                curveTo(420.3f, 16.5f, 383f, 8.9f, 339.4f, 8f)
                lineTo(496f, 164.8f)
                curveToRelative(-0.8f, -43.5f, -8.2f, -80.6f, -14.5f, -104.5f)
                close()
                moveToRelative(-467f, 391.4f)
                curveToRelative(4.8f, 18.2f, 19.1f, 32.5f, 37.3f, 37.4f)
                curveToRelative(23.9f, 6.4f, 61.2f, 14f, 104.8f, 14.9f)
                lineTo(0f, 347.2f)
                curveToRelative(0.8f, 43.5f, 8.2f, 80.6f, 14.5f, 104.5f)
                close()
                moveTo(4.2f, 283.4f)
                lineTo(220.4f, 500f)
                curveToRelative(132.5f, -19.4f, 248.8f, -118.7f, 271.5f, -271.4f)
                lineTo(275.6f, 12f)
                curveTo(143.1f, 31.4f, 26.8f, 130.7f, 4.2f, 283.4f)
                close()
                moveToRelative(317.3f, -123.6f)
                curveToRelative(3.1f, -3.1f, 8.2f, -3.1f, 11.3f, 0f)
                lineToRelative(11.3f, 11.3f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-28.3f, 28.3f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-28.3f, -28.3f)
                lineToRelative(-22.6f, 22.7f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineTo(248f, 278.6f)
                lineToRelative(-22.6f, 22.6f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-28.3f, -28.3f)
                lineToRelative(-28.3f, 28.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0f)
                lineToRelative(-11.3f, -11.3f)
                curveToRelative(-3.1f, -3.1f, -3.1f, -8.2f, 0f, -11.3f)
                lineToRelative(28.3f, -28.3f)
                lineToRelative(-28.3f, -28.2f)
                curveToRelative(-3.1f, -3.1f, -3.1f, -8.2f, 0f, -11.3f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(3.1f, -3.1f, 8.2f, -3.1f, 11.3f, 0f)
                lineToRelative(28.3f, 28.3f)
                lineToRelative(22.6f, -22.6f)
                lineToRelative(-28.3f, -28.3f)
                curveToRelative(-3.1f, -3.1f, -3.1f, -8.2f, 0f, -11.3f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(3.1f, -3.1f, 8.2f, -3.1f, 11.3f, 0f)
                lineToRelative(28.3f, 28.3f)
                lineToRelative(22.6f, -22.6f)
                lineToRelative(-28.3f, -28.3f)
                curveToRelative(-3.1f, -3.1f, -3.1f, -8.2f, 0f, -11.3f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(3.1f, -3.1f, 8.2f, -3.1f, 11.3f, 0f)
                lineToRelative(28.3f, 28.3f)
                lineToRelative(28.3f, -28.5f)
                close()
            }
        }.build()
        
        return _FootballBall!!
    }

private var _FootballBall: ImageVector? = null

