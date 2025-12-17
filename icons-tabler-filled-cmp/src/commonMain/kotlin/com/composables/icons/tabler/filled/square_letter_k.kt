package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareLetterK: ImageVector
    get() {
        if (_SquareLetterK != null) return _SquareLetterK!!
        
        _SquareLetterK = ImageVector.Builder(
            name = "square-letter-k",
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
                moveToRelative(-4.47f, 5.152f)
                arcToRelative(1f, 1f, 0f, false, false, -1.378f, 0.318f)
                lineToRelative(-2.152f, 3.443f)
                verticalLineToRelative(-2.913f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(2.152f, 3.444f)
                arcToRelative(1f, 1f, 0f, false, false, 1.276f, 0.374f)
                lineToRelative(0.102f, -0.056f)
                lineToRelative(0.095f, -0.068f)
                arcToRelative(1f, 1f, 0f, false, false, 0.223f, -1.31f)
                lineToRelative(-2.17f, -3.47f)
                lineToRelative(2.17f, -3.47f)
                arcToRelative(1f, 1f, 0f, false, false, -0.318f, -1.378f)
            }
        }.build()
        
        return _SquareLetterK!!
    }

private var _SquareLetterK: ImageVector? = null

