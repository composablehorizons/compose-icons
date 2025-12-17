package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowDownOnSquare: ImageVector
    get() {
        if (_ArrowDownOnSquare != null) return _ArrowDownOnSquare!!
        
        _ArrowDownOnSquare = ImageVector.Builder(
            name = "arrow-down-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 1.5f)
                close()
                moveTo(11.25f, 7.5f)
                verticalLineToRelative(5.69f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.72f, 1.72f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(3.75f)
                close()
            }
        }.build()
        
        return _ArrowDownOnSquare!!
    }

private var _ArrowDownOnSquare: ImageVector? = null

