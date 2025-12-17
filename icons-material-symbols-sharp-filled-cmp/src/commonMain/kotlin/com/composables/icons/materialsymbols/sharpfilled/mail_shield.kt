package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mail_shield: ImageVector
    get() {
        if (_Mail_shield != null) return _Mail_shield!!
        
        _Mail_shield = ImageVector.Builder(
            name = "mail_shield",
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
                horizontalLineToRelative(800f)
                verticalLineToRelative(331f)
                lineToRelative(-120f, -60f)
                lineToRelative(-240f, 120f)
                verticalLineToRelative(151f)
                quadToRelative(0f, 26f, 4f, 50.5f)
                reflectiveQuadToRelative(12f, 47.5f)
                horizontalLineTo(80f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-69f, -17f, -114.5f, -79.5f)
                reflectiveQuadTo(600f, 702f)
                verticalLineToRelative(-102f)
                lineToRelative(160f, -80f)
                lineToRelative(160f, 80f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 76f, -45.5f, 138.5f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(35f, -17f, 57.5f, -54f)
                reflectiveQuadToRelative(22.5f, -80f)
                verticalLineToRelative(-52f)
                lineToRelative(-80f, -40f)
                verticalLineToRelative(226f)
                close()
                moveTo(480f, 520f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(480f, 440f)
                lineTo(160f, 240f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
            }
        }.build()
        
        return _Mail_shield!!
    }

private var _Mail_shield: ImageVector? = null

