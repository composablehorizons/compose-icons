package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TwitterX: ImageVector
    get() {
        if (_TwitterX != null) return _TwitterX!!
        
        _TwitterX = ImageVector.Builder(
            name = "twitter-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6f, 0.75f)
                horizontalLineToRelative(2.454f)
                lineToRelative(-5.36f, 6.142f)
                lineTo(16f, 15.25f)
                horizontalLineToRelative(-4.937f)
                lineToRelative(-3.867f, -5.07f)
                lineToRelative(-4.425f, 5.07f)
                horizontalLineTo(0.316f)
                lineToRelative(5.733f, -6.57f)
                lineTo(0f, 0.75f)
                horizontalLineToRelative(5.063f)
                lineToRelative(3.495f, 4.633f)
                lineTo(12.601f, 0.75f)
                close()
                moveToRelative(-0.86f, 13.028f)
                horizontalLineToRelative(1.36f)
                lineTo(4.323f, 2.145f)
                horizontalLineTo(2.865f)
                close()
            }
        }.build()
        
        return _TwitterX!!
    }

private var _TwitterX: ImageVector? = null

