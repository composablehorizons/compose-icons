package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_ArrowTopRightOnSquare != null) return _ArrowTopRightOnSquare!!
        
        _ArrowTopRightOnSquare = ImageVector.Builder(
            name = "arrow-top-right-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 2.25f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.81f)
                lineTo(8.03f, 17.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineTo(19.19f, 3.75f)
                horizontalLineToRelative(-3.44f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                close()
                moveToRelative(-10.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(8.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(8.25f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()
        
        return _ArrowTopRightOnSquare!!
    }

private var _ArrowTopRightOnSquare: ImageVector? = null

