package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Squares2x2: ImageVector
    get() {
        if (_Squares2x2 != null) return _Squares2x2!!
        
        _Squares2x2 = ImageVector.Builder(
            name = "squares-2x2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(2.25f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(2.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(6f)
                close()
                moveToRelative(9.75f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(2.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(6f)
                close()
                moveTo(3f, 15.75f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(2.25f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-2.25f)
                close()
                moveToRelative(9.75f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-2.25f)
                close()
            }
        }.build()
        
        return _Squares2x2!!
    }

private var _Squares2x2: ImageVector? = null

