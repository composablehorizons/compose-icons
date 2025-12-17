package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowLeftStartOnRectangle: ImageVector
    get() {
        if (_ArrowLeftStartOnRectangle != null) return _ArrowLeftStartOnRectangle!!
        
        _ArrowLeftStartOnRectangle = ImageVector.Builder(
            name = "arrow-left-start-on-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 11.25f, 2f)
                horizontalLineToRelative(-3f)
                arcTo(2.75f, 2.75f, 0f, false, false, 5.5f, 4.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(3f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 8.25f, 14f)
                horizontalLineToRelative(3f)
                arcTo(2.75f, 2.75f, 0f, false, false, 14f, 11.25f)
                verticalLineToRelative(-6.5f)
                close()
                moveToRelative(-9.47f, 0.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineTo(1.22f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-0.97f, -0.97f)
                horizontalLineToRelative(7.19f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.56f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowLeftStartOnRectangle!!
    }

private var _ArrowLeftStartOnRectangle: ImageVector? = null

