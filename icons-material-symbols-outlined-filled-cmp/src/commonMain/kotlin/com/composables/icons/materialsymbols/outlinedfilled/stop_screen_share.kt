package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(607f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-446f)
                lineToRelative(-52f, -54f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(400f, 514f)
                lineToRelative(-73f, -74f)
                quadToRelative(-5f, 9f, -6f, 19f)
                reflectiveQuadToRelative(-1f, 21f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-46f)
                close()
                moveToRelative(428f, 200f)
                lineTo(577f, 463f)
                lineToRelative(63f, -63f)
                lineToRelative(-120f, -120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-46f)
                lineTo(234f, 120f)
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 26f, -14.5f, 45.5f)
                reflectiveQuadTo(828f, 714f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

