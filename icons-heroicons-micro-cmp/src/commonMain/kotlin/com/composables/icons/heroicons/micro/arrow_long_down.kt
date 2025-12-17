package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowLongDown: ImageVector
    get() {
        if (_ArrowLongDown != null) return _ArrowLongDown!!
        
        _ArrowLongDown = ImageVector.Builder(
            name = "arrow-long-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(8.69f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.22f, 1.22f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 2f)
                close()
            }
        }.build()
        
        return _ArrowLongDown!!
    }

private var _ArrowLongDown: ImageVector? = null

