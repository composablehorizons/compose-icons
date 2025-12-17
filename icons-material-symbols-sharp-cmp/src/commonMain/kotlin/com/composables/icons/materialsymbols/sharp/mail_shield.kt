package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mail_shield: ImageVector
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
                moveTo(480f, 440f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveToRelative(56f, 360f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(331f)
                lineToRelative(-80f, -40f)
                verticalLineToRelative(-131f)
                lineTo(480f, 520f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(361f)
                quadToRelative(2f, 21f, 5f, 40.5f)
                reflectiveQuadToRelative(10f, 39.5f)
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
                moveTo(160f, 720f)
                verticalLineToRelative(-289f)
                verticalLineToRelative(20f)
                verticalLineToRelative(-211f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Mail_shield!!
    }

private var _Mail_shield: ImageVector? = null

