package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowDownOnSquare: ImageVector
    get() {
        if (_ArrowDownOnSquare != null) return _ArrowDownOnSquare!!
        
        _ArrowDownOnSquare = ImageVector.Builder(
            name = "arrow-down-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 1f)
                close()
                moveTo(7.25f, 5f)
                verticalLineToRelative(4.44f)
                lineTo(6.03f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineTo(8.75f, 9.44f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.25f)
                close()
            }
        }.build()
        
        return _ArrowDownOnSquare!!
    }

private var _ArrowDownOnSquare: ImageVector? = null

