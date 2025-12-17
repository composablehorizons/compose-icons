package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_cancel: ImageVector
    get() {
        if (_Person_cancel != null) return _Person_cancel!!
        
        _Person_cancel = ImageVector.Builder(
            name = "person_cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(696f, 520f)
                lineToRelative(-56f, -56f)
                lineToRelative(83f, -84f)
                lineToRelative(-83f, -83f)
                lineToRelative(56f, -57f)
                lineToRelative(84f, 84f)
                lineToRelative(83f, -84f)
                lineToRelative(57f, 57f)
                lineToRelative(-84f, 83f)
                lineToRelative(84f, 84f)
                lineToRelative(-57f, 56f)
                lineToRelative(-83f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveToRelative(-336f, -40f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(616f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(680f, 688f)
                verticalLineToRelative(112f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Person_cancel!!
    }

private var _Person_cancel: ImageVector? = null

