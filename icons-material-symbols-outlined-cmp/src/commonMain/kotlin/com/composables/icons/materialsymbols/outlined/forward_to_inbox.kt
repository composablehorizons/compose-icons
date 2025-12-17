package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Forward_to_inbox: ImageVector
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
                moveTo(480f, 520f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                lineTo(480f, 520f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
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
                moveTo(160f, 320f)
                verticalLineToRelative(440f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(3f)
                verticalLineToRelative(-283f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Forward_to_inbox!!
    }

private var _Forward_to_inbox: ImageVector? = null

