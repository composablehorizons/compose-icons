package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowLeftEndOnRectangle: ImageVector
    get() {
        if (_ArrowLeftEndOnRectangle != null) return _ArrowLeftEndOnRectangle!!
        
        _ArrowLeftEndOnRectangle = ImageVector.Builder(
            name = "arrow-left-end-on-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 2f)
                arcTo(2.75f, 2.75f, 0f, false, false, 2f, 4.75f)
                verticalLineToRelative(6.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 4.75f, 14f)
                horizontalLineToRelative(3f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.75f, -2.75f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(3f)
                curveTo(8.44f, 3.5f, 9f, 4.06f, 9f, 4.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 7.75f, 2f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.03f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(4.72f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-0.97f, -0.97f)
                horizontalLineToRelative(7.19f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(7.06f)
                lineToRelative(0.97f, -0.97f)
                close()
            }
        }.build()
        
        return _ArrowLeftEndOnRectangle!!
    }

private var _ArrowLeftEndOnRectangle: ImageVector? = null

