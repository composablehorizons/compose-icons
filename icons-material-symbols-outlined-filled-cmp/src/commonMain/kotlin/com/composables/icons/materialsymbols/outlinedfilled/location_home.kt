package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Location_home: ImageVector
    get() {
        if (_Location_home != null) return _Location_home!!
        
        _Location_home = ImageVector.Builder(
            name = "location_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(240f, 760f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-11f)
                quadToRelative(0f, -14f, -6f, -26f)
                reflectiveQuadToRelative(-18f, -19f)
                quadToRelative(-49f, -31f, -103.5f, -47.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-58f, 0f, -112.5f, 16.5f)
                reflectiveQuadTo(264f, 704f)
                quadToRelative(-12f, 7f, -18f, 19f)
                reflectiveQuadToRelative(-6f, 26f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Location_home!!
    }

private var _Location_home: ImageVector? = null

