package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mail_asterisk: ImageVector
    get() {
        if (_Mail_asterisk != null) return _Mail_asterisk!!
        
        _Mail_asterisk = ImageVector.Builder(
            name = "mail_asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, -40f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
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
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-160f)
                lineTo(522f, 494f)
                quadToRelative(-20f, 12f, -42f, 12f)
                reflectiveQuadToRelative(-42f, -12f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(600f, 40f)
                lineToRelative(-25f, 44f)
                quadToRelative(-8f, 14f, -24.5f, 18f)
                reflectiveQuadTo(680f, 898f)
                quadToRelative(-14f, -8f, -18.5f, -24f)
                reflectiveQuadToRelative(3.5f, -30f)
                lineToRelative(26f, -44f)
                horizontalLineToRelative(-51f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(51f)
                lineToRelative(-26f, -44f)
                quadToRelative(-8f, -14f, -3.5f, -30f)
                reflectiveQuadToRelative(18.5f, -24f)
                quadToRelative(14f, -8f, 30.5f, -4f)
                reflectiveQuadToRelative(24.5f, 18f)
                lineToRelative(25f, 44f)
                lineToRelative(25f, -44f)
                quadToRelative(8f, -14f, 24.5f, -18f)
                reflectiveQuadToRelative(30.5f, 4f)
                quadToRelative(14f, 8f, 18.5f, 24f)
                reflectiveQuadToRelative(-3.5f, 30f)
                lineToRelative(-26f, 44f)
                horizontalLineToRelative(51f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 800f)
                horizontalLineToRelative(-51f)
                lineToRelative(26f, 44f)
                quadToRelative(8f, 14f, 3.5f, 30f)
                reflectiveQuadTo(840f, 898f)
                quadToRelative(-14f, 8f, -30.5f, 4f)
                reflectiveQuadTo(785f, 884f)
                lineToRelative(-25f, -44f)
                close()
            }
        }.build()
        
        return _Mail_asterisk!!
    }

private var _Mail_asterisk: ImageVector? = null

