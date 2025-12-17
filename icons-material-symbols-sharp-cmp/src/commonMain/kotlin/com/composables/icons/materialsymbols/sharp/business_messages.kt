package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Business_messages: ImageVector
    get() {
        if (_Business_messages != null) return _Business_messages!!
        
        _Business_messages = ImageVector.Builder(
            name = "business_messages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-450f)
                lineTo(40f, 160f)
                horizontalLineToRelative(840f)
                verticalLineToRelative(640f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -560f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                close()
                moveToRelative(260f, 460f)
                lineToRelative(56f, -56f)
                lineToRelative(-44f, -44f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                lineToRelative(180f, 180f)
                close()
                moveTo(360f, 440f)
                horizontalLineToRelative(360f)
                lineTo(540f, 260f)
                lineToRelative(-56f, 56f)
                lineToRelative(44f, 44f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, -200f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Business_messages!!
    }

private var _Business_messages: ImageVector? = null

