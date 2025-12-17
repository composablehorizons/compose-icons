package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Underline: ImageVector
    get() {
        if (_Underline != null) return _Underline!!
        
        _Underline = ImageVector.Builder(
            name = "underline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(9f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, 9f, 0f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(9f)
                arcTo(6f, 6f, 0f, false, true, 4f, 9f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4.75f, 2f)
                close()
                moveTo(2f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Underline!!
    }

private var _Underline: ImageVector? = null

