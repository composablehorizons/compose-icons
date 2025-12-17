package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Infinity: ImageVector
    get() {
        if (_Infinity != null) return _Infinity!!
        
        _Infinity = ImageVector.Builder(
            name = "infinity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.68f, 5.792f)
                lineTo(7.345f, 7.75f)
                lineTo(5.681f, 9.708f)
                arcToRelative(2.75f, 2.75f, 0f, true, true, 0f, -3.916f)
                close()
                moveTo(8f, 6.978f)
                lineTo(6.416f, 5.113f)
                lineToRelative(-0.014f, -0.015f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, 5.304f)
                lineToRelative(0.014f, -0.015f)
                lineTo(8f, 8.522f)
                lineToRelative(1.584f, 1.865f)
                lineToRelative(0.014f, 0.015f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, -5.304f)
                lineToRelative(-0.014f, 0.015f)
                close()
                moveToRelative(0.656f, 0.772f)
                lineToRelative(1.663f, -1.958f)
                arcToRelative(2.75f, 2.75f, 0f, true, true, 0f, 3.916f)
                close()
            }
        }.build()
        
        return _Infinity!!
    }

private var _Infinity: ImageVector? = null

