package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Recycle: ImageVector
    get() {
        if (_Recycle != null) return _Recycle!!
        
        _Recycle = ImageVector.Builder(
            name = "recycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(184.561f, 261.903f)
                curveToRelative(3.232f, 13.997f, -12.123f, 24.635f, -24.068f, 17.168f)
                lineToRelative(-40.736f, -25.455f)
                lineToRelative(-50.867f, 81.402f)
                curveTo(55.606f, 356.273f, 70.96f, 384f, 96.012f, 384f)
                horizontalLineTo(148f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(96.115f)
                curveToRelative(-75.334f, 0f, -121.302f, -83.048f, -81.408f, -146.88f)
                lineToRelative(50.822f, -81.388f)
                lineToRelative(-40.725f, -25.448f)
                curveToRelative(-12.081f, -7.547f, -8.966f, -25.961f, 4.879f, -29.158f)
                lineToRelative(110.237f, -25.45f)
                curveToRelative(8.611f, -1.988f, 17.201f, 3.381f, 19.189f, 11.99f)
                lineToRelative(25.452f, 110.237f)
                close()
                moveToRelative(98.561f, -182.915f)
                lineToRelative(41.289f, 66.076f)
                lineToRelative(-40.74f, 25.457f)
                curveToRelative(-12.051f, 7.528f, -9f, 25.953f, 4.879f, 29.158f)
                lineToRelative(110.237f, 25.45f)
                curveToRelative(8.672f, 1.999f, 17.215f, -3.438f, 19.189f, -11.99f)
                lineToRelative(25.45f, -110.237f)
                curveToRelative(3.197f, -13.844f, -11.99f, -24.719f, -24.068f, -17.168f)
                lineToRelative(-40.687f, 25.424f)
                lineToRelative(-41.263f, -66.082f)
                curveToRelative(-37.521f, -60.033f, -125.209f, -60.171f, -162.816f, 0f)
                lineToRelative(-17.963f, 28.766f)
                curveToRelative(-3.51f, 5.62f, -1.8f, 13.021f, 3.82f, 16.533f)
                lineToRelative(33.919f, 21.195f)
                curveToRelative(5.62f, 3.512f, 13.024f, 1.803f, 16.536f, -3.817f)
                lineToRelative(17.961f, -28.743f)
                curveToRelative(12.712f, -20.341f, 41.973f, -19.676f, 54.257f, -0.022f)
                close()
                moveTo(497.288f, 301.12f)
                lineToRelative(-27.515f, -44.065f)
                curveToRelative(-3.511f, -5.623f, -10.916f, -7.334f, -16.538f, -3.821f)
                lineToRelative(-33.861f, 21.159f)
                curveToRelative(-5.62f, 3.512f, -7.33f, 10.915f, -3.818f, 16.536f)
                lineToRelative(27.564f, 44.112f)
                curveToRelative(13.257f, 21.211f, -2.057f, 48.96f, -27.136f, 48.96f)
                horizontalLineTo(320f)
                verticalLineTo(336.02f)
                curveToRelative(0f, -14.213f, -17.242f, -21.383f, -27.313f, -11.313f)
                lineToRelative(-80f, 79.981f)
                curveToRelative(-6.249f, 6.248f, -6.249f, 16.379f, 0f, 22.627f)
                lineToRelative(80f, 79.989f)
                curveTo(302.689f, 517.308f, 320f, 510.3f, 320f, 495.989f)
                verticalLineTo(448f)
                horizontalLineToRelative(95.88f)
                curveToRelative(75.274f, 0f, 121.335f, -82.997f, 81.408f, -146.88f)
                close()
            }
        }.build()
        
        return _Recycle!!
    }

private var _Recycle: ImageVector? = null

