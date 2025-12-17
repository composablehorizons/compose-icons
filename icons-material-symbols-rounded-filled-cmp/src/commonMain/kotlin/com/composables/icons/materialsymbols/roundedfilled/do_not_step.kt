package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Do_not_step: ImageVector
    get() {
        if (_Do_not_step != null) return _Do_not_step!!
        
        _Do_not_step = ImageVector.Builder(
            name = "do_not_step",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 627f)
                lineToRelative(-56f, -56f)
                lineToRelative(179f, -179f)
                quadToRelative(23f, 23f, 23f, 56f)
                reflectiveQuadToRelative(-23f, 56f)
                lineTo(740f, 627f)
                close()
                moveToRelative(-84f, -85f)
                lineTo(372f, 259f)
                lineToRelative(123f, -123f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(227f, 227f)
                lineToRelative(-179f, 179f)
                close()
                moveTo(763f, 876f)
                lineTo(553f, 667f)
                lineTo(420f, 800f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -26f, 14.5f, -46f)
                reflectiveQuadTo(92f, 620f)
                quadToRelative(17f, -7f, 37.5f, -17f)
                reflectiveQuadToRelative(41.5f, -24f)
                lineToRelative(55f, 55f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-51f, -52f)
                lineToRelative(15.5f, -15.5f)
                quadTo(226f, 531f, 234f, 522f)
                lineToRelative(51f, 51f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-56f, -56f)
                quadToRelative(6f, -11f, 10.5f, -22f)
                reflectiveQuadToRelative(7.5f, -23f)
                lineToRelative(68f, 69f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6.5f, -14f)
                reflectiveQuadToRelative(-5.5f, -14f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(678f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Do_not_step!!
    }

private var _Do_not_step: ImageVector? = null

