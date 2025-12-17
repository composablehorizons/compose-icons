package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Plagiarism: ImageVector
    get() {
        if (_Plagiarism != null) return _Plagiarism!!
        
        _Plagiarism = ImageVector.Builder(
            name = "plagiarism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(458f, 680f)
                quadToRelative(18f, 0f, 35.5f, -4.5f)
                reflectiveQuadTo(526f, 662f)
                lineToRelative(98f, 98f)
                lineToRelative(56f, -56f)
                lineToRelative(-98f, -98f)
                quadToRelative(9f, -15f, 13.5f, -32.5f)
                reflectiveQuadTo(600f, 538f)
                quadToRelative(0f, -58f, -41f, -98f)
                reflectiveQuadToRelative(-99f, -40f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 40f, 99f)
                reflectiveQuadToRelative(98f, 41f)
                close()
                moveToRelative(2f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(400f, 540f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(460f, 480f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(520f, 540f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(460f, 600f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -520f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Plagiarism!!
    }

private var _Plagiarism: ImageVector? = null

