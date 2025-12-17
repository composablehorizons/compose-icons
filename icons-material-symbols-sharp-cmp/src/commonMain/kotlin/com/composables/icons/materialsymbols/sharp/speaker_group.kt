package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Speaker_group: ImageVector
    get() {
        if (_Speaker_group != null) return _Speaker_group!!
        
        _Speaker_group = ImageVector.Builder(
            name = "speaker_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 680f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(260f, -460f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 240f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 180f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 300f)
                close()
                moveToRelative(0f, 340f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 500f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 500f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 560f)
                close()
                moveToRelative(60f, 360f)
                horizontalLineTo(160f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                close()
                moveTo(400f, 120f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Speaker_group!!
    }

private var _Speaker_group: ImageVector? = null

