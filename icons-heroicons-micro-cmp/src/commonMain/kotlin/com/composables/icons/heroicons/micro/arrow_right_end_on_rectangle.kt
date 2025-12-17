package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowRightEndOnRectangle: ImageVector
    get() {
        if (_ArrowRightEndOnRectangle != null) return _ArrowRightEndOnRectangle!!
        
        _ArrowRightEndOnRectangle = ImageVector.Builder(
            name = "arrow-right-end-on-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 2f)
                arcTo(2.75f, 2.75f, 0f, false, true, 14f, 4.75f)
                verticalLineToRelative(6.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 11.25f, 14f)
                horizontalLineToRelative(-3f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, -2.75f, -2.75f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(3f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-3f)
                curveTo(7.56f, 3.5f, 7f, 4.06f, 7f, 4.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 8.25f, 2f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.97f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.97f, -0.97f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(7.19f)
                lineToRelative(-0.97f, -0.97f)
                close()
            }
        }.build()
        
        return _ArrowRightEndOnRectangle!!
    }

private var _ArrowRightEndOnRectangle: ImageVector? = null

