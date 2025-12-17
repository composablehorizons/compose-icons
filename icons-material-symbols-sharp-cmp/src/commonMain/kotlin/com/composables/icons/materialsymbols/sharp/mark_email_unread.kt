package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mark_email_unread: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(484f)
                quadToRelative(-4f, 20f, -4f, 40f)
                reflectiveQuadToRelative(4f, 40f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                lineToRelative(146f, -91f)
                quadToRelative(14f, 13f, 30.5f, 22.5f)
                reflectiveQuadTo(691f, 388f)
                lineTo(480f, 520f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-324f)
                quadToRelative(23f, -5f, 43f, -14f)
                reflectiveQuadToRelative(37f, -22f)
                verticalLineToRelative(440f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -560f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(600f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Mark_email_unread!!
    }

private var _Mark_email_unread: ImageVector? = null

