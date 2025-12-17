package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Soba: ImageVector
    get() {
        if (_Soba != null) return _Soba!!
        
        _Soba = ImageVector.Builder(
            name = "soba",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 880f)
                quadToRelative(-42f, 0f, -74f, -25f)
                reflectiveQuadToRelative(-42f, -65f)
                lineTo(92f, 690f)
                quadToRelative(-5f, -19f, 7f, -34.5f)
                reflectiveQuadToRelative(32f, -15.5f)
                horizontalLineToRelative(18f)
                quadToRelative(2f, -9f, 5f, -18f)
                reflectiveQuadToRelative(6f, -17f)
                verticalLineToRelative(-409f)
                quadToRelative(0f, -15f, 10.5f, -26.5f)
                reflectiveQuadTo(196f, 156f)
                lineToRelative(651f, -72f)
                quadToRelative(14f, -2f, 23.5f, 6.5f)
                reflectiveQuadTo(880f, 113f)
                quadToRelative(0f, 11f, -7.5f, 19.5f)
                reflectiveQuadTo(854f, 143f)
                lineToRelative(-434f, 49f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(430f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 290f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 320f)
                horizontalLineTo(420f)
                verticalLineToRelative(65f)
                quadToRelative(14f, -2f, 29.5f, -3.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(121f, 0f, 212f, 74f)
                reflectiveQuadToRelative(118f, 186f)
                horizontalLineToRelative(19f)
                quadToRelative(20f, 0f, 31.5f, 15.5f)
                reflectiveQuadTo(867f, 690f)
                lineToRelative(-25f, 100f)
                quadToRelative(-10f, 40f, -42f, 65f)
                reflectiveQuadToRelative(-74f, 25f)
                horizontalLineTo(233f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(64f)
                quadToRelative(23f, -54f, 72f, -87f)
                reflectiveQuadToRelative(111f, -33f)
                quadToRelative(62f, 0f, 110.5f, 33f)
                reflectiveQuadToRelative(71.5f, 87f)
                horizontalLineToRelative(64f)
                quadToRelative(-26f, -78f, -92.5f, -129f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(-88f, 0f, -154.5f, 51f)
                reflectiveQuadTo(233f, 640f)
                close()
                moveToRelative(158f, 0f)
                horizontalLineToRelative(177f)
                quadToRelative(-17f, -19f, -39.5f, -29.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-26f, 0f, -49f, 10.5f)
                reflectiveQuadTo(391f, 640f)
                close()
                moveTo(220f, 501f)
                quadToRelative(9f, -11f, 19f, -21f)
                reflectiveQuadToRelative(21f, -19f)
                verticalLineToRelative(-141f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(181f)
                close()
                moveToRelative(100f, -81f)
                quadToRelative(10f, -5f, 19.5f, -9.5f)
                reflectiveQuadTo(360f, 402f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(100f)
                close()
                moveTo(220f, 260f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-50f)
                lineToRelative(-40f, 4f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(100f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-62f)
                lineToRelative(-40f, 5f)
                verticalLineToRelative(57f)
                close()
            }
        }.build()
        
        return _Soba!!
    }

private var _Soba: ImageVector? = null

