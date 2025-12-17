package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mark_email_unread: ImageVector
    get() {
        if (_Mark_email_unread != null) return _Mark_email_unread!!
        
        _Mark_email_unread = ImageVector.Builder(
            name = "mark_email_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(484f)
                quadToRelative(-4f, 20f, -4f, 40f)
                reflectiveQuadToRelative(4f, 40f)
                quadToRelative(7f, 32f, 23f, 59.5f)
                reflectiveQuadToRelative(39f, 48.5f)
                lineToRelative(-146f, 92f)
                lineToRelative(-320f, -200f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                lineToRelative(211f, -132f)
                quadToRelative(17f, 6f, 34f, 9f)
                reflectiveQuadToRelative(35f, 3f)
                quadToRelative(32f, 0f, 63f, -10f)
                reflectiveQuadToRelative(57f, -30f)
                verticalLineToRelative(440f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Mark_email_unread!!
    }

private var _Mark_email_unread: ImageVector? = null

