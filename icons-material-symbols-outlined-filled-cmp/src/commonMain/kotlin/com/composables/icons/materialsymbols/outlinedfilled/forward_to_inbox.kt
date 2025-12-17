package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Forward_to_inbox: ImageVector
    get() {
        if (_Forward_to_inbox != null) return _Forward_to_inbox!!
        
        _Forward_to_inbox = ImageVector.Builder(
            name = "forward_to_inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 920f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-64f, -64f)
                lineToRelative(57f, -56f)
                lineToRelative(160f, 160f)
                lineTo(760f, 920f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(312f)
                quadToRelative(-27f, -16f, -57.5f, -24f)
                reflectiveQuadToRelative(-62.5f, -8f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                verticalLineToRelative(40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -280f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(480f, 440f)
                lineTo(160f, 240f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
            }
        }.build()
        
        return _Forward_to_inbox!!
    }

private var _Forward_to_inbox: ImageVector? = null

