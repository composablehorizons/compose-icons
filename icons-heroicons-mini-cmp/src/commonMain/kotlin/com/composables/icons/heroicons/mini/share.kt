package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0.702f, 1.737f)
                lineTo(6.97f, 9.604f)
                arcToRelative(2.518f, 2.518f, 0f, false, true, 0f, 0.792f)
                lineToRelative(6.733f, 3.367f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.671f, 1.341f)
                lineToRelative(-6.733f, -3.367f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -3.475f)
                lineToRelative(6.733f, -3.366f)
                arcTo(2.52f, 2.52f, 0f, false, true, 13f, 4.5f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

