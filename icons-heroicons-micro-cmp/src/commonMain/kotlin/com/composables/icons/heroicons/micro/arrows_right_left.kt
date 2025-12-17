package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowsRightLeft: ImageVector
    get() {
        if (_ArrowsRightLeft != null) return _ArrowsRightLeft!!
        
        _ArrowsRightLeft = ImageVector.Builder(
            name = "arrows-right-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.47f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.97f, -0.97f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(5.69f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(-4.94f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-0.97f, 0.97f)
                horizontalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(4.56f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowsRightLeft!!
    }

private var _ArrowsRightLeft: ImageVector? = null

