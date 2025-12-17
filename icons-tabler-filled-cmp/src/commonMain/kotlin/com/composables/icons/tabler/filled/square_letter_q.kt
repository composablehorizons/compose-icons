package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareLetterQ: ImageVector
    get() {
        if (_SquareLetterQ != null) return _SquareLetterQ!!
        
        _SquareLetterQ = ImageVector.Builder(
            name = "square-letter-q",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-7f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, false, 4.168f, 2.764f)
                lineToRelative(0.125f, -0.057f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                lineToRelative(0.057f, -0.125f)
                arcToRelative(3f, 3f, 0f, false, false, 0.236f, -1.168f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                moveToRelative(1f, 7.001f)
                horizontalLineToRelative(-0.059f)
                arcToRelative(0.996f, 0.996f, 0f, false, false, -0.941f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1.001f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _SquareLetterQ!!
    }

private var _SquareLetterQ: ImageVector? = null

