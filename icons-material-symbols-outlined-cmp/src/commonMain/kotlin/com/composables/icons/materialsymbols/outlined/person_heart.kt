package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_heart: ImageVector
    get() {
        if (_Person_heart != null) return _Person_heart!!
        
        _Person_heart = ImageVector.Builder(
            name = "person_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                close()
                moveToRelative(-320f, 80f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                horizontalLineToRelative(14f)
                quadToRelative(-11f, 18f, -16.5f, 38.5f)
                reflectiveQuadTo(472f, 600f)
                quadToRelative(-54f, 1f, -107.5f, 14.5f)
                reflectiveQuadTo(260f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(283f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(236f, 480f)
                lineTo(576f, 660f)
                quadToRelative(-13f, -13f, -18.5f, -28f)
                reflectiveQuadToRelative(-5.5f, -30f)
                quadToRelative(0f, -32f, 23f, -57f)
                reflectiveQuadToRelative(59f, -25f)
                quadToRelative(28f, 0f, 44f, 13f)
                reflectiveQuadToRelative(38f, 35f)
                quadToRelative(20f, -20f, 36.5f, -34f)
                reflectiveQuadToRelative(45.5f, -14f)
                quadToRelative(37f, 0f, 59.5f, 25.5f)
                reflectiveQuadTo(880f, 603f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(716f, 800f)
                close()
            }
        }.build()
        
        return _Person_heart!!
    }

private var _Person_heart: ImageVector? = null

