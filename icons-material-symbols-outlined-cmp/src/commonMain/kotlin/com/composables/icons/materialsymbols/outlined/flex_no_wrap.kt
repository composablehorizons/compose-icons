package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Flex_no_wrap: ImageVector
    get() {
        if (_Flex_no_wrap != null) return _Flex_no_wrap!!
        
        _Flex_no_wrap = ImageVector.Builder(
            name = "flex_no_wrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-560f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Flex_no_wrap!!
    }

private var _Flex_no_wrap: ImageVector? = null

