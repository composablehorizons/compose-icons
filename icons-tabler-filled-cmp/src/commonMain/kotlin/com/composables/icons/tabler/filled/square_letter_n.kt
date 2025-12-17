package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareLetterN: ImageVector
    get() {
        if (_SquareLetterN != null) return _SquareLetterN!!
        
        _SquareLetterN = ImageVector.Builder(
            name = "square-letter-n",
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
                moveToRelative(-8.106f, 5.553f)
                curveToRelative(-0.471f, -0.944f, -1.894f, -0.608f, -1.894f, 0.447f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-3.764f)
                lineToRelative(2.106f, 4.211f)
                curveToRelative(0.471f, 0.944f, 1.894f, 0.608f, 1.894f, -0.447f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(3.764f)
                close()
            }
        }.build()
        
        return _SquareLetterN!!
    }

private var _SquareLetterN: ImageVector? = null

