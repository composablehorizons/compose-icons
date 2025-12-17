package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Underline: ImageVector
    get() {
        if (_Underline != null) return _Underline!!
        
        _Underline = ImageVector.Builder(
            name = "underline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(7f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4.75f, 2f)
                close()
                moveTo(2f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Underline!!
    }

private var _Underline: ImageVector? = null

