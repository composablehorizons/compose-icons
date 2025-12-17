package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.921f, 11.9f)
                lineTo(1.353f, 8.62f)
                arcToRelative(0.72f, 0.72f, 0f, false, true, 0f, -1.238f)
                lineTo(5.921f, 4.1f)
                arcTo(0.716f, 0.716f, 0f, false, true, 7f, 4.719f)
                verticalLineTo(6f)
                curveToRelative(1.5f, 0f, 6f, 0f, 7f, 8f)
                curveToRelative(-2.5f, -4.5f, -7f, -4f, -7f, -4f)
                verticalLineToRelative(1.281f)
                curveToRelative(0f, 0.56f, -0.606f, 0.898f, -1.079f, 0.62f)
                close()
            }
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

