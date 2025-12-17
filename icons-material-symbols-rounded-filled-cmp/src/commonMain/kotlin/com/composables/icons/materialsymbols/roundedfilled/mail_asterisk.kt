package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mail_asterisk: ImageVector
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
                moveTo(760f, 840f)
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
                moveTo(480f, 440f)
                lineTo(212f, 272f)
                quadToRelative(-17f, -11f, -34.5f, -1f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 9f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 12.5f)
                lineToRelative(262f, 164f)
                quadToRelative(20f, 12f, 42f, 12f)
                reflectiveQuadToRelative(42f, -12f)
                lineToRelative(262f, -164f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17.5f, -30f)
                reflectiveQuadToRelative(-34.5f, 1f)
                lineTo(480f, 440f)
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
                verticalLineToRelative(276f)
                quadToRelative(0f, 12f, -10.5f, 18.5f)
                reflectiveQuadTo(848f, 536f)
                quadToRelative(-66f, -26f, -136.5f, -11.5f)
                reflectiveQuadTo(590f, 590f)
                quadToRelative(-36f, 36f, -54.5f, 83f)
                reflectiveQuadTo(519f, 771f)
                quadToRelative(1f, 12f, -7f, 20.5f)
                reflectiveQuadToRelative(-19f, 8.5f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Mail_asterisk!!
    }

private var _Mail_asterisk: ImageVector? = null

