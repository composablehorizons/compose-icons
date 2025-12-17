package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareLetterR: ImageVector
    get() {
        if (_SquareLetterR != null) return _SquareLetterR!!
        
        _SquareLetterR = ImageVector.Builder(
            name = "square-letter-r",
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
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-2.332f)
                lineToRelative(2.2f, 2.932f)
                arcToRelative(1f, 1f, 0f, false, false, 1.4f, 0.2f)
                lineToRelative(0.096f, -0.081f)
                arcToRelative(1f, 1f, 0f, false, false, 0.104f, -1.319f)
                lineToRelative(-1.903f, -2.538f)
                lineToRelative(0.115f, -0.037f)
                arcToRelative(3.001f, 3.001f, 0f, false, false, -1.012f, -5.825f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _SquareLetterR!!
    }

private var _SquareLetterR: ImageVector? = null

