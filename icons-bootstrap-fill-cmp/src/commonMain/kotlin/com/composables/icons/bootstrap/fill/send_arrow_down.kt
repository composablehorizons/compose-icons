package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SendArrowDown: ImageVector
    get() {
        if (_SendArrowDown != null) return _SendArrowDown!!
        
        _SendArrowDown = ImageVector.Builder(
            name = "send-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.11f, 0.54f)
                lineTo(13.026f, 8.03f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8f, 12.5f)
                curveToRelative(0f, 0.5f, 0f, 1.5f, -0.773f, 0.36f)
                lineToRelative(-1.59f, -2.498f)
                lineTo(0.644f, 7.184f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(-0.41f, -0.261f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.083f, -0.886f)
                lineToRelative(0.452f, -0.18f)
                lineToRelative(0.001f, -0.001f)
                lineTo(15.314f, 0.035f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.54f, 0.111f)
                moveTo(6.637f, 10.07f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(0.471f, -1.178f)
                lineToRelative(-1.178f, 0.471f)
                lineTo(5.93f, 9.363f)
                lineToRelative(0.338f, 0.215f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.154f, 0.154f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.354f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.722f, -0.016f)
                lineToRelative(-1.149f, -1.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.737f, -0.676f)
                lineToRelative(0.28f, 0.305f)
                verticalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.793f)
                lineToRelative(0.396f, -0.397f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _SendArrowDown!!
    }

private var _SendArrowDown: ImageVector? = null

