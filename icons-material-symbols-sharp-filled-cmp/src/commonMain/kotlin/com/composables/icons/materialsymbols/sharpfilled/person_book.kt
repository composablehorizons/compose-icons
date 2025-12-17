package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_book: ImageVector
    get() {
        if (_Person_book != null) return _Person_book!!
        
        _Person_book = ImageVector.Builder(
            name = "person_book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(-69f, 0f, -129f, 21f)
                reflectiveQuadToRelative(-111f, 59f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                quadToRelative(-51f, -38f, -111f, -59f)
                reflectiveQuadToRelative(-129f, -21f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
            }
        }.build()
        
        return _Person_book!!
    }

private var _Person_book: ImageVector? = null

