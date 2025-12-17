package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flex_direction: ImageVector
    get() {
        if (_Flex_direction != null) return _Flex_direction!!
        
        _Flex_direction = ImageVector.Builder(
            name = "flex_direction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(560f, 440f)
                lineTo(520f, 600f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 103f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(487f)
                lineToRelative(104f, -103f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Flex_direction!!
    }

private var _Flex_direction: ImageVector? = null

