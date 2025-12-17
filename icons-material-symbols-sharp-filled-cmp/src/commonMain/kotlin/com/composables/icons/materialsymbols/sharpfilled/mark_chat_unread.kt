package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mark_chat_unread: ImageVector
    get() {
        if (_Mark_chat_unread != null) return _Mark_chat_unread!!
        
        _Mark_chat_unread = ImageVector.Builder(
            name = "mark_chat_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(484f)
                quadToRelative(-4f, 20f, -4f, 40f)
                reflectiveQuadToRelative(4f, 40f)
                quadToRelative(14f, 69f, 69f, 114.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(32f, 0f, 63f, -10f)
                reflectiveQuadToRelative(57f, -30f)
                verticalLineToRelative(440f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
            }
        }.build()
        
        return _Mark_chat_unread!!
    }

private var _Mark_chat_unread: ImageVector? = null

