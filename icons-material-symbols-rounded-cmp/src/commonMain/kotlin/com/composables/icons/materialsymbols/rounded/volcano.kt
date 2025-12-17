package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Volcano: ImageVector
    get() {
        if (_Volcano != null) return _Volcano!!
        
        _Volcano = ImageVector.Builder(
            name = "volcano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(774f, 880f)
                horizontalLineTo(203f)
                quadToRelative(-44f, 0f, -67.5f, -36f)
                reflectiveQuadToRelative(-5.5f, -76f)
                lineToRelative(89f, -200f)
                quadToRelative(10f, -22f, 29.5f, -35f)
                reflectiveQuadToRelative(43.5f, -13f)
                horizontalLineToRelative(68f)
                lineToRelative(60f, -150f)
                quadToRelative(9f, -23f, 29f, -36.5f)
                reflectiveQuadToRelative(45f, -13.5f)
                horizontalLineToRelative(166f)
                quadToRelative(27f, 0f, 48f, 16f)
                reflectiveQuadToRelative(29f, 42f)
                lineToRelative(114f, 400f)
                quadToRelative(11f, 38f, -13f, 70f)
                reflectiveQuadToRelative(-64f, 32f)
                close()
                moveToRelative(-571f, -80f)
                horizontalLineToRelative(571f)
                lineTo(660f, 400f)
                horizontalLineTo(494f)
                lineToRelative(-70f, 175f)
                quadToRelative(-5f, 11f, -15f, 18f)
                reflectiveQuadToRelative(-22f, 7f)
                horizontalLineToRelative(-95f)
                lineToRelative(-89f, 200f)
                close()
                moveToRelative(317f, -640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 160f)
                close()
                moveToRelative(153f, 31f)
                lineToRelative(57f, -57f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-57f, 57f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(673f, 247f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                close()
                moveToRelative(-282f, 56f)
                lineToRelative(-57f, -57f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(57f, 57f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(447f, 247f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(203f, 800f)
                horizontalLineToRelative(571f)
                horizontalLineToRelative(-571f)
                close()
            }
        }.build()
        
        return _Volcano!!
    }

private var _Volcano: ImageVector? = null

