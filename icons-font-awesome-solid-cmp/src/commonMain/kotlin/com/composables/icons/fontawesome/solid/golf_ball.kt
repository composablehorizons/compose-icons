package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GolfBall: ImageVector
    get() {
        if (_GolfBall != null) return _GolfBall!!
        
        _GolfBall = ImageVector.Builder(
            name = "golf-ball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 416f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 416f)
                horizontalLineToRelative(224f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                horizontalLineToRelative(-16f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineToRelative(-16f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                close()
                moveToRelative(320f, -208f)
                curveToRelative(0f, 74.2f, -39f, 139.2f, -97.5f, 176f)
                horizontalLineToRelative(-221f)
                curveTo(39f, 347.2f, 0f, 282.2f, 0f, 208f)
                curveTo(0f, 93.1f, 93.1f, 0f, 208f, 0f)
                reflectiveCurveToRelative(208f, 93.1f, 208f, 208f)
                close()
                moveToRelative(-180.1f, 43.9f)
                curveToRelative(18.3f, 0f, 33.1f, -14.8f, 33.1f, -33.1f)
                curveToRelative(0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                close()
                moveToRelative(49.1f, 46.9f)
                curveToRelative(0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                curveToRelative(18.3f, 0f, 33.1f, -14.9f, 33.1f, -33.1f)
                close()
                moveToRelative(64f, -64f)
                curveToRelative(0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                curveToRelative(18.3f, 0f, 33.1f, -14.9f, 33.1f, -33.1f)
                close()
            }
        }.build()
        
        return _GolfBall!!
    }

private var _GolfBall: ImageVector? = null

