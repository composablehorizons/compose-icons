package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Manage_accounts: ImageVector
    get() {
        if (_Manage_accounts != null) return _Manage_accounts!!
        
        _Manage_accounts = ImageVector.Builder(
            name = "manage_accounts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(584f, 756f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -14f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(628f, 500f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(21.5f, 15f)
                lineToRelative(58f, -20f)
                lineToRelative(40f, 70f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 12f, 2f, 25f)
                reflectiveQuadToRelative(-2f, 25f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(732f, 780f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                horizontalLineToRelative(14f)
                quadToRelative(6f, 0f, 12f, 2f)
                quadToRelative(-29f, 72f, -24f, 143f)
                reflectiveQuadToRelative(48f, 135f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 720f)
                close()
                moveTo(400f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Manage_accounts!!
    }

private var _Manage_accounts: ImageVector? = null

