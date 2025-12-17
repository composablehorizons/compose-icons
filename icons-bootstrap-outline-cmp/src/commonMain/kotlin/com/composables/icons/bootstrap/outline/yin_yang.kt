package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.YinYang: ImageVector
    get() {
        if (_YinYang != null) return _YinYang!!
        
        _YinYang = ImageVector.Builder(
            name = "yin-yang",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.167f, 4.5f)
                arcToRelative(1.167f, 1.167f, 0f, true, true, -2.334f, 0f)
                arcToRelative(1.167f, 1.167f, 0f, false, true, 2.334f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, 16f)
                arcTo(8f, 8f, 0f, false, false, 8f, 0f)
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, 7f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, -7f)
                moveToRelative(7f, 4.667f)
                arcToRelative(1.167f, 1.167f, 0f, true, true, 0f, -2.334f)
                arcToRelative(1.167f, 1.167f, 0f, false, true, 0f, 2.334f)
            }
        }.build()
        
        return _YinYang!!
    }

private var _YinYang: ImageVector? = null

