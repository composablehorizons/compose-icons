package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.309f, 189.836f)
                lineTo(184.313f, 37.851f)
                curveTo(199.719f, 24.546f, 224f, 35.347f, 224f, 56.015f)
                verticalLineToRelative(80.053f)
                curveToRelative(160.629f, 1.839f, 288f, 34.032f, 288f, 186.258f)
                curveToRelative(0f, 61.441f, -39.581f, 122.309f, -83.333f, 154.132f)
                curveToRelative(-13.653f, 9.931f, -33.111f, -2.533f, -28.077f, -18.631f)
                curveToRelative(45.344f, -145.012f, -21.507f, -183.51f, -176.59f, -185.742f)
                verticalLineTo(360f)
                curveToRelative(0f, 20.7f, -24.3f, 31.453f, -39.687f, 18.164f)
                lineToRelative(-176.004f, -152f)
                curveToRelative(-11.071f, -9.562f, -11.086f, -26.753f, 0f, -36.328f)
                close()
            }
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

