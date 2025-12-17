package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Set_meal: ImageVector
    get() {
        if (_Set_meal != null) return _Set_meal!!
        
        _Set_meal = ImageVector.Builder(
            name = "set_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 600f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(520f)
                horizontalLineTo(40f)
                close()
                moveToRelative(83f, 140f)
                lineToRelative(-3f, -60f)
                lineToRelative(719f, -38f)
                lineToRelative(3f, 60f)
                lineToRelative(-719f, 38f)
                close()
                moveToRelative(-3f, 99f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(60f)
                horizontalLineTo(120f)
                close()
                moveToRelative(290f, -379f)
                quadToRelative(74f, 0f, 142.5f, -26f)
                reflectiveQuadTo(672f, 354f)
                quadToRelative(6f, 42f, 44f, 64f)
                reflectiveQuadToRelative(84f, 22f)
                verticalLineToRelative(-200f)
                quadToRelative(-46f, 0f, -84f, 22.5f)
                reflectiveQuadTo(672f, 328f)
                quadToRelative(-53f, -52f, -120.5f, -80f)
                reflectiveQuadTo(410f, 220f)
                quadToRelative(-79f, 0f, -152f, 27.5f)
                reflectiveQuadTo(140f, 340f)
                quadToRelative(45f, 65f, 118f, 92.5f)
                reflectiveQuadTo(410f, 460f)
                close()
            }
        }.build()
        
        return _Set_meal!!
    }

private var _Set_meal: ImageVector? = null

