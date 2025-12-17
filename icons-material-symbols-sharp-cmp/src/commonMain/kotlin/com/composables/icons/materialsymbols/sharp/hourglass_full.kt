package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hourglass_full: ImageVector
    get() {
        if (_Hourglass_full != null) return _Hourglass_full!!
        
        _Hourglass_full = ImageVector.Builder(
            name = "hourglass_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                quadToRelative(0f, -1.525f, 0.713f, -2.863f)
                quadTo(7.425f, 12.8f, 8.7f, 12f)
                quadToRelative(-1.275f, -0.8f, -1.987f, -2.138f)
                quadTo(6f, 8.525f, 6f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                quadToRelative(0f, 1.525f, -0.712f, 2.862f)
                quadTo(16.575f, 11.2f, 15.3f, 12f)
                quadToRelative(1.275f, 0.8f, 1.988f, 2.137f)
                quadTo(18f, 15.475f, 18f, 17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Hourglass_full!!
    }

private var _Hourglass_full: ImageVector? = null

