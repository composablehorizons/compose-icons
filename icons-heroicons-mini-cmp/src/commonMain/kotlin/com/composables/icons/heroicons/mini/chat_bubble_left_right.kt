package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleLeftRight: ImageVector
    get() {
        if (_ChatBubbleLeftRight != null) return _ChatBubbleLeftRight!!
        
        _ChatBubbleLeftRight = ImageVector.Builder(
            name = "chat-bubble-left-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.505f, 2.365f)
                arcTo(41.369f, 41.369f, 0f, false, true, 9f, 2f)
                curveToRelative(1.863f, 0f, 3.697f, 0.124f, 5.495f, 0.365f)
                curveToRelative(1.247f, 0.167f, 2.18f, 1.108f, 2.435f, 2.268f)
                arcToRelative(4.45f, 4.45f, 0f, false, false, -0.577f, -0.069f)
                arcToRelative(43.141f, 43.141f, 0f, false, false, -4.706f, 0f)
                curveTo(9.229f, 4.696f, 7.5f, 6.727f, 7.5f, 8.998f)
                verticalLineToRelative(2.24f)
                curveToRelative(0f, 1.413f, 0.67f, 2.735f, 1.76f, 3.562f)
                lineToRelative(-2.98f, 2.98f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 17.25f)
                verticalLineToRelative(-3.443f)
                curveToRelative(-0.501f, -0.048f, -1f, -0.106f, -1.495f, -0.172f)
                curveTo(2.033f, 13.438f, 1f, 12.162f, 1f, 10.72f)
                verticalLineTo(5.28f)
                curveToRelative(0f, -1.441f, 1.033f, -2.717f, 2.505f, -2.914f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6f)
                curveToRelative(-0.762f, 0f, -1.52f, 0.02f, -2.271f, 0.062f)
                curveTo(10.157f, 6.148f, 9f, 7.472f, 9f, 8.998f)
                verticalLineToRelative(2.24f)
                curveToRelative(0f, 1.519f, 1.147f, 2.839f, 2.71f, 2.935f)
                curveToRelative(0.214f, 0.013f, 0.428f, 0.024f, 0.642f, 0.034f)
                curveToRelative(0.2f, 0.009f, 0.385f, 0.09f, 0.518f, 0.224f)
                lineToRelative(2.35f, 2.35f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, -0.531f)
                verticalLineToRelative(-2.07f)
                curveToRelative(1.453f, -0.195f, 2.5f, -1.463f, 2.5f, -2.915f)
                verticalLineTo(8.998f)
                curveToRelative(0f, -1.526f, -1.157f, -2.85f, -2.729f, -2.936f)
                arcTo(41.645f, 41.645f, 0f, false, false, 14f, 6f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftRight!!
    }

private var _ChatBubbleLeftRight: ImageVector? = null

