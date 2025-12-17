package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BinaryTree2: ImageVector
    get() {
        if (_BinaryTree2 != null) return _BinaryTree2!!
        
        _BinaryTree2 = ImageVector.Builder(
            name = "binary-tree-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 2.616f, 4.47f)
                lineToRelative(3.274f, 3.742f)
                arcToRelative(3f, 3f, 0f, true, true, -1.505f, 1.318f)
                lineToRelative(-3.275f, -3.743f)
                lineToRelative(-0.11f, 0.042f)
                verticalLineToRelative(6.342f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-6.342f)
                lineToRelative(-0.111f, -0.041f)
                lineToRelative(-3.274f, 3.742f)
                arcToRelative(3f, 3f, 0f, true, true, -1.505f, -1.318f)
                lineToRelative(3.273f, -3.742f)
                arcToRelative(3f, 3f, 0f, false, true, 2.617f, -4.47f)
            }
        }.build()
        
        return _BinaryTree2!!
    }

private var _BinaryTree2: ImageVector? = null

