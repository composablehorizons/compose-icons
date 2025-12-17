package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowsPointingOut: ImageVector
    get() {
        if (_ArrowsPointingOut != null) return _ArrowsPointingOut!!
        
        _ArrowsPointingOut = ImageVector.Builder(
            name = "arrows-pointing-out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.28f, 7.78f)
                lineToRelative(3.22f, -3.22f)
                verticalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.69f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                close()
                moveTo(2f, 17.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineTo(4.56f, 16.5f)
                horizontalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.22f, 13.28f)
                lineToRelative(3.22f, 3.22f)
                horizontalLineToRelative(-2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.747f, 0.747f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineToRelative(-3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                close()
                moveTo(3.5f, 4.56f)
                lineToRelative(3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineTo(4.56f, 3.5f)
                horizontalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(4.56f)
                close()
            }
        }.build()
        
        return _ArrowsPointingOut!!
    }

private var _ArrowsPointingOut: ImageVector? = null

