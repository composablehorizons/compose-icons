package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Houseboat: ImageVector
    get() {
        if (_Houseboat != null) return _Houseboat!!
        
        _Houseboat = ImageVector.Builder(
            name = "houseboat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 56f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(58f, 0f, 78f, 20f)
                reflectiveQuadToRelative(55f, 20f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(59f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                quadToRelative(35f, 0f, 55f, -20f)
                reflectiveQuadToRelative(78f, -20f)
                quadToRelative(59f, 0f, 77f, 20f)
                reflectiveQuadToRelative(56f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-57f, 0f, -78f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-36f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-59f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-38f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-57f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-35f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-78f, 20f)
                close()
                moveToRelative(10f, -250f)
                lineToRelative(56f, -56f)
                lineToRelative(67f, 66f)
                horizontalLineToRelative(67f)
                verticalLineToRelative(-135f)
                lineToRelative(-53f, 39f)
                lineToRelative(-47f, -64f)
                lineToRelative(300f, -220f)
                lineToRelative(300f, 220f)
                lineToRelative(-47f, 65f)
                lineToRelative(-53f, -39f)
                verticalLineToRelative(134f)
                horizontalLineToRelative(67f)
                lineToRelative(67f, -66f)
                lineToRelative(56f, 56f)
                lineToRelative(-90f, 90f)
                horizontalLineTo(180f)
                lineToRelative(-90f, -90f)
                close()
                moveToRelative(430f, 10f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Houseboat!!
    }

private var _Houseboat: ImageVector? = null

