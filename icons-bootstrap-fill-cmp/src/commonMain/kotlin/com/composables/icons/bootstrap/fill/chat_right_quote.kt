package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatRightQuote: ImageVector
    get() {
        if (_ChatRightQuote != null) return _ChatRightQuote!!
        
        _ChatRightQuote = ImageVector.Builder(
            name = "chat-right-quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(9.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(2.853f, 2.853f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.854f, -0.353f)
                close()
                moveTo(7.194f, 4.766f)
                quadToRelative(0.13f, 0.188f, 0.227f, 0.401f)
                curveToRelative(0.428f, 0.948f, 0.393f, 2.377f, -0.942f, 3.706f)
                arcToRelative(0.446f, 0.446f, 0f, false, true, -0.612f, 0.01f)
                arcToRelative(0.405f, 0.405f, 0f, false, true, -0.011f, -0.59f)
                curveToRelative(0.419f, -0.416f, 0.672f, -0.831f, 0.809f, -1.22f)
                curveToRelative(-0.269f, 0.165f, -0.588f, 0.26f, -0.93f, 0.26f)
                curveTo(4.775f, 7.333f, 4f, 6.587f, 4f, 5.667f)
                reflectiveCurveTo(4.776f, 4f, 5.734f, 4f)
                curveToRelative(0.271f, 0f, 0.528f, 0.06f, 0.756f, 0.166f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(0.169f, 0.07f, 0.327f, 0.182f, 0.469f, 0.324f)
                quadToRelative(0.128f, 0.125f, 0.227f, 0.272f)
                moveTo(11f, 7.073f)
                curveToRelative(-0.269f, 0.165f, -0.588f, 0.26f, -0.93f, 0.26f)
                curveToRelative(-0.958f, 0f, -1.735f, -0.746f, -1.735f, -1.666f)
                reflectiveCurveTo(9.112f, 4f, 10.069f, 4f)
                curveToRelative(0.271f, 0f, 0.528f, 0.06f, 0.756f, 0.166f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(0.17f, 0.07f, 0.327f, 0.182f, 0.469f, 0.324f)
                quadToRelative(0.128f, 0.125f, 0.227f, 0.272f)
                quadToRelative(0.131f, 0.188f, 0.228f, 0.401f)
                curveToRelative(0.428f, 0.948f, 0.392f, 2.377f, -0.942f, 3.706f)
                arcToRelative(0.446f, 0.446f, 0f, false, true, -0.613f, 0.01f)
                arcToRelative(0.405f, 0.405f, 0f, false, true, -0.011f, -0.59f)
                curveToRelative(0.42f, -0.416f, 0.672f, -0.831f, 0.81f, -1.22f)
                close()
            }
        }.build()
        
        return _ChatRightQuote!!
    }

private var _ChatRightQuote: ImageVector? = null

