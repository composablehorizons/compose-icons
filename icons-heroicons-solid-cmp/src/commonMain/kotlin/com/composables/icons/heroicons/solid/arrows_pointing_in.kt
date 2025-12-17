package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowsPointingIn: ImageVector
    get() {
        if (_ArrowsPointingIn != null) return _ArrowsPointingIn!!
        
        _ArrowsPointingIn = ImageVector.Builder(
            name = "arrows-pointing-in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.97f, 3.97f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.69f)
                lineTo(3.22f, 4.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(17.56f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-3.97f, 3.97f)
                horizontalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2.69f)
                lineToRelative(3.97f, -3.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveTo(3.75f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2.69f)
                lineToRelative(-3.97f, 3.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.97f, -3.97f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(10.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(3.97f, 3.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.97f, -3.97f)
                verticalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _ArrowsPointingIn!!
    }

private var _ArrowsPointingIn: ImageVector? = null

