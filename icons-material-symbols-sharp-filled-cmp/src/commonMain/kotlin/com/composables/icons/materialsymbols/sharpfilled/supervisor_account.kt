package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Supervisor_account: ImageVector
    get() {
        if (_Supervisor_account != null) return _Supervisor_account!!
        
        _Supervisor_account = ImageVector.Builder(
            name = "supervisor_account",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17f, -62.5f)
                reflectiveQuadToRelative(47f, -43.5f)
                quadToRelative(60f, -30f, 124.5f, -46f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(25f, 0f, 50f, 3.5f)
                reflectiveQuadToRelative(50f, 8.5f)
                verticalLineToRelative(63f)
                quadToRelative(-45f, 22f, -72.5f, 58f)
                reflectiveQuadTo(400f, 747f)
                verticalLineToRelative(53f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-56f)
                quadToRelative(0f, -24f, 12.5f, -44.5f)
                reflectiveQuadTo(528f, 670f)
                quadToRelative(36f, -15f, 74.5f, -22.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(39f, 0f, 77.5f, 7.5f)
                reflectiveQuadTo(832f, 670f)
                quadToRelative(23f, 9f, 35.5f, 29.5f)
                reflectiveQuadTo(880f, 744f)
                verticalLineToRelative(56f)
                horizontalLineTo(480f)
                close()
                moveToRelative(200f, -200f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
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
        
        return _Supervisor_account!!
    }

private var _Supervisor_account: ImageVector? = null

