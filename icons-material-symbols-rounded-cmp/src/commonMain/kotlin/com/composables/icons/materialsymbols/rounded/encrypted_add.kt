package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Encrypted_add: ImageVector
    get() {
        if (_Encrypted_add != null) return _Encrypted_add!!
        
        _Encrypted_add = ImageVector.Builder(
            name = "encrypted_add",
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
                moveTo(455f, 873f)
                quadToRelative(-134f, -44f, -214.5f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(186f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 481f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 441f)
                verticalLineToRelative(-186f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                quadToRelative(16f, 5f, 23.5f, 20f)
                reflectiveQuadToRelative(2.5f, 31f)
                quadToRelative(-5f, 16f, -20f, 23.5f)
                reflectiveQuadTo(455f, 873f)
                close()
                moveToRelative(225f, -113f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-80f)
                close()
                moveTo(444f, 600f)
                horizontalLineToRelative(72f)
                quadToRelative(9f, 0f, 15.5f, -7.5f)
                reflectiveQuadTo(536f, 576f)
                lineToRelative(-19f, -105f)
                quadToRelative(20f, -10f, 31.5f, -29f)
                reflectiveQuadToRelative(11.5f, -42f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 23f, 11.5f, 42f)
                reflectiveQuadToRelative(31.5f, 29f)
                lineToRelative(-19f, 105f)
                quadToRelative(-2f, 9f, 4.5f, 16.5f)
                reflectiveQuadTo(444f, 600f)
                close()
            }
        }.build()
        
        return _Encrypted_add!!
    }

private var _Encrypted_add: ImageVector? = null

