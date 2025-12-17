package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.No_accounts: ImageVector
    get() {
        if (_No_accounts != null) return _No_accounts!!
        
        _No_accounts = ImageVector.Builder(
            name = "no_accounts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 438f)
                lineTo(422f, 252f)
                quadToRelative(14f, -6f, 28.5f, -9f)
                reflectiveQuadToRelative(29.5f, -3f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, 15f, -3f, 29.5f)
                reflectiveQuadToRelative(-9f, 28.5f)
                close()
                moveTo(234f, 684f)
                quadToRelative(51f, -39f, 114f, -61.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(18f, 0f, 34.5f, 1.5f)
                reflectiveQuadTo(549f, 606f)
                lineToRelative(-88f, -88f)
                quadToRelative(-47f, -6f, -80.5f, -39.5f)
                reflectiveQuadTo(341f, 398f)
                lineTo(227f, 284f)
                quadToRelative(-32f, 41f, -49.5f, 90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 59f, 19.5f, 111f)
                reflectiveQuadToRelative(54.5f, 93f)
                close()
                moveToRelative(498f, -8f)
                quadToRelative(32f, -41f, 50f, -90.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-56f, 0f, -105.5f, 18f)
                reflectiveQuadTo(284f, 228f)
                lineToRelative(448f, 448f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(143f, 708f, 111.5f, 635f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                quadTo(252f, 143f, 325f, 111.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(53f, 0f, 100f, -15.5f)
                reflectiveQuadToRelative(86f, -44.5f)
                quadToRelative(-39f, -29f, -86f, -44.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-53f, 0f, -100f, 15.5f)
                reflectiveQuadTo(294f, 740f)
                quadToRelative(39f, 29f, 86f, 44.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -60f)
                close()
            }
        }.build()
        
        return _No_accounts!!
    }

private var _No_accounts: ImageVector? = null

