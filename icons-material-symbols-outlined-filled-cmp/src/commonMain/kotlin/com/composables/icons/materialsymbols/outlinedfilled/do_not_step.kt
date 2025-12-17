package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Do_not_step: ImageVector
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
                lineToRelative(57f, 56f)
                lineToRelative(-180f, 179f)
                close()
                moveToRelative(-84f, -85f)
                lineTo(372f, 259f)
                lineToRelative(180f, -179f)
                lineToRelative(283f, 283f)
                lineToRelative(-179f, 179f)
                close()
                moveTo(791f, 904f)
                lineTo(553f, 667f)
                lineTo(420f, 800f)
                horizontalLineTo(40f)
                verticalLineToRelative(-105f)
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
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Do_not_step!!
    }

private var _Do_not_step: ImageVector? = null

