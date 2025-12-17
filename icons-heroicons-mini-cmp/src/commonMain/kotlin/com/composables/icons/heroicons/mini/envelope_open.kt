package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) return _EnvelopeOpen!!
        
        _EnvelopeOpen = ImageVector.Builder(
            name = "envelope-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.106f, 6.447f)
                arcTo(2f, 2f, 0f, false, false, 1f, 8.237f)
                verticalLineTo(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8.236f)
                arcToRelative(2f, 2f, 0f, false, false, -1.106f, -1.789f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.788f, 0f)
                lineToRelative(-7f, 3.5f)
                close()
                moveToRelative(1.48f, 4.007f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.671f, 1.342f)
                lineToRelative(5.855f, 2.928f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.46f, 0f)
                lineToRelative(5.852f, -2.927f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.67f, -1.341f)
                lineToRelative(-5.853f, 2.926f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.118f, 0f)
                lineToRelative(-5.856f, -2.928f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

