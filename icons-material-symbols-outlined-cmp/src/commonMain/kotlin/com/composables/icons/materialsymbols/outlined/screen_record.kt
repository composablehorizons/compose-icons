package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Screen_record: ImageVector
    get() {
        if (_Screen_record != null) return _Screen_record!!
        
        _Screen_record = ImageVector.Builder(
            name = "screen_record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(158f, 718f)
                quadToRelative(-37f, -50f, -57.5f, -110.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -67f, 20f, -127f)
                reflectiveQuadToRelative(57f, -110f)
                lineToRelative(58f, 57f)
                quadToRelative(-26f, 38f, -40.5f, 83.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 51f, 14.5f, 97f)
                reflectiveQuadToRelative(40.5f, 84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-67f, 0f, -127f, -20f)
                reflectiveQuadToRelative(-110f, -57f)
                lineToRelative(57f, -58f)
                quadToRelative(38f, 26f, 83.5f, 40.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(51f, 0f, 96.5f, -14.5f)
                reflectiveQuadTo(660f, 745f)
                lineToRelative(57f, 58f)
                quadToRelative(-50f, 37f, -110f, 57f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(322f, -162f)
                lineToRelative(-57f, -57f)
                quadToRelative(26f, -38f, 40.5f, -84f)
                reflectiveQuadToRelative(14.5f, -97f)
                quadToRelative(0f, -51f, -14.5f, -96.5f)
                reflectiveQuadTo(745f, 300f)
                lineToRelative(58f, -57f)
                quadToRelative(37f, 50f, 57f, 110f)
                reflectiveQuadToRelative(20f, 127f)
                quadToRelative(0f, 67f, -20.5f, 127.5f)
                reflectiveQuadTo(802f, 718f)
                close()
                moveTo(299f, 215f)
                lineToRelative(-57f, -57f)
                quadToRelative(50f, -37f, 110.5f, -57.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(68f, 0f, 128f, 20.5f)
                reflectiveQuadTo(718f, 158f)
                lineToRelative(-57f, 57f)
                quadToRelative(-38f, -26f, -84f, -40.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-51f, 0f, -97f, 14.5f)
                reflectiveQuadTo(299f, 215f)
                close()
                moveToRelative(181f, 465f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Screen_record!!
    }

private var _Screen_record: ImageVector? = null

