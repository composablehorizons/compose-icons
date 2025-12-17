package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ReplyAll: ImageVector
    get() {
        if (_ReplyAll != null) return _ReplyAll!!
        
        _ReplyAll = ImageVector.Builder(
            name = "reply-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136.309f, 189.836f)
                lineTo(312.313f, 37.851f)
                curveTo(327.72f, 24.546f, 352f, 35.348f, 352f, 56.015f)
                verticalLineToRelative(82.763f)
                curveToRelative(129.182f, 10.231f, 224f, 52.212f, 224f, 183.548f)
                curveToRelative(0f, 61.441f, -39.582f, 122.309f, -83.333f, 154.132f)
                curveToRelative(-13.653f, 9.931f, -33.111f, -2.533f, -28.077f, -18.631f)
                curveToRelative(38.512f, -123.162f, -3.922f, -169.482f, -112.59f, -182.015f)
                verticalLineToRelative(84.175f)
                curveToRelative(0f, 20.701f, -24.3f, 31.453f, -39.687f, 18.164f)
                lineTo(136.309f, 226.164f)
                curveToRelative(-11.071f, -9.561f, -11.086f, -26.753f, 0f, -36.328f)
                close()
                moveToRelative(-128f, 36.328f)
                lineTo(184.313f, 378.15f)
                curveTo(199.7f, 391.439f, 224f, 380.687f, 224f, 359.986f)
                verticalLineToRelative(-15.818f)
                lineToRelative(-108.606f, -93.785f)
                arcTo(55.96f, 55.96f, 0f, false, true, 96f, 207.998f)
                arcToRelative(55.953f, 55.953f, 0f, false, true, 19.393f, -42.38f)
                lineTo(224f, 71.832f)
                verticalLineTo(56.015f)
                curveToRelative(0f, -20.667f, -24.28f, -31.469f, -39.687f, -18.164f)
                lineTo(8.309f, 189.836f)
                curveToRelative(-11.086f, 9.575f, -11.071f, 26.767f, 0f, 36.328f)
                close()
            }
        }.build()
        
        return _ReplyAll!!
    }

private var _ReplyAll: ImageVector? = null

