package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flex_wrap: ImageVector
    get() {
        if (_Flex_wrap != null) return _Flex_wrap!!
        
        _Flex_wrap = ImageVector.Builder(
            name = "flex_wrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 880f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-240f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveTo(40f, 440f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-560f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Flex_wrap!!
    }

private var _Flex_wrap: ImageVector? = null

