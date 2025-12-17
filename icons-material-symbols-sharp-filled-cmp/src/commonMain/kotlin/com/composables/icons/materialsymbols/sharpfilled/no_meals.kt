package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_meals: ImageVector
    get() {
        if (_No_meals != null) return _No_meals!!
        
        _No_meals = ImageVector.Builder(
            name = "no_meals",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineToRelative(-59f, -59f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-87f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-59f, -287f)
                lineToRelative(-83f, -83f)
                lineToRelative(-117f, -117f)
                verticalLineToRelative(-165f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 80f)
                verticalLineToRelative(565f)
                close()
                moveTo(480f, 365f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-205f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(285f)
                close()
                moveTo(360f, 245f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-85f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(165f)
                close()
                moveTo(240f, 125f)
                lineToRelative(-45f, -45f)
                horizontalLineToRelative(45f)
                verticalLineToRelative(45f)
                close()
                moveToRelative(40f, 755f)
                verticalLineToRelative(-366f)
                quadToRelative(-51f, -14f, -85.5f, -56f)
                reflectiveQuadTo(160f, 360f)
                verticalLineToRelative(-201f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(121f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-81f)
                lineToRelative(81f, 80f)
                lineToRelative(90f, 91f)
                quadToRelative(-16f, 23f, -39.5f, 39.5f)
                reflectiveQuadTo(360f, 514f)
                verticalLineToRelative(366f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _No_meals!!
    }

private var _No_meals: ImageVector? = null

