package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Highlighter: ImageVector
    get() {
        if (_Highlighter != null) return _Highlighter!!
        
        _Highlighter = ImageVector.Builder(
            name = "highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.096f, 0.644f)
                arcToRelative(2f, 2f, 0f, false, true, 2.791f, 0.036f)
                lineToRelative(1.433f, 1.433f)
                arcToRelative(2f, 2f, 0f, false, true, 0.035f, 2.791f)
                lineToRelative(-0.413f, 0.435f)
                lineToRelative(-8.07f, 8.995f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.372f, 0.166f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.234f, -0.058f)
                lineToRelative(-0.412f, 0.412f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 15f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.412f, -1.412f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 12.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.166f, -0.372f)
                lineToRelative(8.995f, -8.07f)
                close()
                moveToRelative(-0.115f, 1.47f)
                lineTo(2.727f, 9.52f)
                lineToRelative(3.753f, 3.753f)
                lineToRelative(7.406f, -8.254f)
                close()
                moveToRelative(3.585f, 2.17f)
                lineToRelative(0.064f, -0.068f)
                arcToRelative(1f, 1f, 0f, false, false, -0.017f, -1.396f)
                lineTo(13.18f, 1.387f)
                arcToRelative(1f, 1f, 0f, false, false, -1.396f, -0.018f)
                lineToRelative(-0.068f, 0.065f)
                close()
                moveTo(5.293f, 13.5f)
                lineTo(2.5f, 10.707f)
                verticalLineToRelative(1.586f)
                lineTo(3.707f, 13.5f)
                close()
            }
        }.build()
        
        return _Highlighter!!
    }

private var _Highlighter: ImageVector? = null

