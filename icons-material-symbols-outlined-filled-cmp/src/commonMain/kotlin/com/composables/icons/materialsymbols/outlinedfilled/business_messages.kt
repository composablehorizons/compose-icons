package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Business_messages: ImageVector
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
                moveTo(280f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-370f)
                lineTo(40f, 160f)
                horizontalLineToRelative(760f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(280f)
                close()
                moveToRelative(260f, -100f)
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
            }
        }.build()
        
        return _Business_messages!!
    }

private var _Business_messages: ImageVector? = null

