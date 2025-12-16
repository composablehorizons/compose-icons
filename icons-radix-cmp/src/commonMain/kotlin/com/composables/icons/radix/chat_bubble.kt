package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ChatBubble: ImageVector
    get() {
        if (_ChatBubble != null) return _ChatBubble!!
        
        _ChatBubble = ImageVector.Builder(
            name = "chat-bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.7559f, 2.0127f)
                curveTo(14.0164f, 2.14082f, 15f, 3.20566f, 15f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(15f, 10.7943f, 14.0164f, 11.8592f, 12.7559f, 11.9873f)
                lineTo(12.5f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                curveTo(11f, 14.7022f, 10.8782f, 14.8845f, 10.6914f, 14.9619f)
                curveTo(10.5046f, 15.0393f, 10.2895f, 14.9965f, 10.1465f, 14.8535f)
                lineTo(7.29297f, 12f)
                horizontalLineTo(2.5f)
                curveTo(1.11929f, 12f, 0f, 10.8807f, 0f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(1.54621E-5f, 3.11931f, 1.11929f, 2f, 2.5f, 2f)
                horizontalLineTo(12.5f)
                lineTo(12.7559f, 2.0127f)
                close()
                moveTo(2.5f, 3f)
                curveTo(1.67159f, 3f, 1.00001f, 3.67158f, 1f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(1f, 10.3284f, 1.67157f, 11f, 2.5f, 11f)
                horizontalLineTo(7.5f)
                lineTo(7.59766f, 11.0098f)
                curveTo(7.69389f, 11.0289f, 7.78311f, 11.0761f, 7.85352f, 11.1465f)
                lineTo(10f, 13.293f)
                verticalLineTo(11.5f)
                curveTo(10f, 11.2239f, 10.2239f, 11f, 10.5f, 11f)
                horizontalLineTo(12.5f)
                lineTo(12.6533f, 10.9922f)
                curveTo(13.4097f, 10.9154f, 14f, 10.2767f, 14f, 9.5f)
                verticalLineTo(4.5f)
                lineTo(13.9922f, 4.34668f)
                curveTo(13.9205f, 3.64069f, 13.3593f, 3.07949f, 12.6533f, 3.00781f)
                lineTo(12.5f, 3f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _ChatBubble!!
    }

private var _ChatBubble: ImageVector? = null

