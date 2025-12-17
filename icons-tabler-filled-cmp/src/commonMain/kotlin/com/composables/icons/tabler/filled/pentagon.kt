package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.205f, 2.6f)
                lineToRelative(-6.96f, 5.238f)
                arcToRelative(3f, 3f, 0f, false, false, -1.045f, 3.338f)
                lineToRelative(2.896f, 8.765f)
                arcToRelative(3f, 3f, 0f, false, false, 2.85f, 2.059f)
                horizontalLineToRelative(8.12f)
                arcToRelative(3f, 3f, 0f, false, false, 2.841f, -2.037f)
                lineToRelative(2.973f, -8.764f)
                arcToRelative(3f, 3f, 0f, false, false, -1.05f, -3.37f)
                lineToRelative(-7.033f, -5.237f)
                lineToRelative(-0.091f, -0.061f)
                lineToRelative(-0.018f, -0.01f)
                lineToRelative(-0.106f, -0.07f)
                arcToRelative(3f, 3f, 0f, false, false, -3.377f, 0.148f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null

