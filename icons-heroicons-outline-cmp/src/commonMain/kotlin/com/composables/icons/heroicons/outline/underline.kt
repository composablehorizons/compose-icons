package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Underline: ImageVector
    get() {
        if (_Underline != null) return _Underline!!
        
        _Underline = ImageVector.Builder(
            name = "underline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(17.995f, 3.744f)
                verticalLineToRelative(7.5f)
                arcToRelative(6f, 6f, 0f, true, true, -12f, 0f)
                verticalLineToRelative(-7.5f)
                moveToRelative(-2.25f, 16.502f)
                horizontalLineToRelative(16.5f)
            }
        }.build()
        
        return _Underline!!
    }

private var _Underline: ImageVector? = null

