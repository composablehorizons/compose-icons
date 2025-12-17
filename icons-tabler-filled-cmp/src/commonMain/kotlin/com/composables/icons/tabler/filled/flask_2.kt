package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flask2: ImageVector
    get() {
        if (_Flask2 != null) return _Flask2!!
        
        _Flask2 = ImageVector.Builder(
            name = "flask-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(5.674f)
                lineToRelative(0.062f, 0.03f)
                arcToRelative(7f, 7f, 0f, false, true, 3.85f, 5.174f)
                lineToRelative(0.037f, 0.262f)
                arcToRelative(7f, 7f, 0f, false, true, -3.078f, 6.693f)
                arcToRelative(1f, 1f, 0f, false, true, -0.553f, 0.167f)
                horizontalLineToRelative(-6.635f)
                arcToRelative(1f, 1f, 0f, false, true, -0.552f, -0.166f)
                arcToRelative(7f, 7f, 0f, false, true, 0.807f, -12.134f)
                lineToRelative(0.062f, -0.028f)
                verticalLineToRelative(-5.672f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                horizontalLineToRelative(6f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.34f)
                arcToRelative(1f, 1f, 0f, false, true, -0.551f, 0.894f)
                lineToRelative(-0.116f, 0.049f)
                arcToRelative(5f, 5f, 0f, false, false, -2.92f, 2.717f)
                horizontalLineToRelative(9.172f)
                arcToRelative(5f, 5f, 0f, false, false, -2.918f, -2.715f)
                arcToRelative(1f, 1f, 0f, false, true, -0.667f, -0.943f)
                verticalLineToRelative(-6.342f)
                close()
            }
        }.build()
        
        return _Flask2!!
    }

private var _Flask2: ImageVector? = null

