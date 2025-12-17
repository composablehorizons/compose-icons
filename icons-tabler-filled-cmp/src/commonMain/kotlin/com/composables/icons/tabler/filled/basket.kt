package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Basket: ImageVector
    get() {
        if (_Basket != null) return _Basket!!
        
        _Basket = ImageVector.Builder(
            name = "basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.949f, 3.684f)
                lineToRelative(1.104f, 3.316f)
                horizontalLineToRelative(1.947f)
                arcToRelative(3f, 3f, 0f, false, true, 2.962f, 3.477f)
                lineToRelative(-1.252f, 7.131f)
                arcToRelative(4f, 4f, 0f, false, true, -3.954f, 3.392f)
                horizontalLineToRelative(-9.512f)
                arcToRelative(3.994f, 3.994f, 0f, false, true, -3.95f, -3.371f)
                lineToRelative(-1.258f, -7.173f)
                arcToRelative(3f, 3f, 0f, false, true, 2.964f, -3.456f)
                horizontalLineToRelative(1.945f)
                lineToRelative(1.105f, -3.316f)
                arcToRelative(1f, 1f, 0f, false, true, 1.898f, 0.632f)
                lineToRelative(-0.895f, 2.684f)
                horizontalLineToRelative(5.893f)
                lineToRelative(-0.895f, -2.684f)
                arcToRelative(1f, 1f, 0f, true, true, 1.898f, -0.632f)
                moveToRelative(-3.949f, 7.316f)
                arcToRelative(3f, 3f, 0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, -3f)
            }
        }.build()
        
        return _Basket!!
    }

private var _Basket: ImageVector? = null

