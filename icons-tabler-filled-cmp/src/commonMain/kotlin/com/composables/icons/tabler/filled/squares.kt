package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Squares: ImageVector
    get() {
        if (_Squares != null) return _Squares!!
        
        _Squares = ImageVector.Builder(
            name = "squares",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 7f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 2.999f)
                lineToRelative(-7f, 0.001f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                lineToRelative(-0.001f, 7f)
                lineToRelative(-0.175f, -0.005f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, -2.995f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
        }.build()
        
        return _Squares!!
    }

private var _Squares: ImageVector? = null

