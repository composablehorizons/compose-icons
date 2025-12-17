package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(77f, 0f, 139f, -44f)
                reflectiveQuadToRelative(87f, -116f)
                horizontalLineToRelative(14f)
                lineToRelative(52f, 52f)
                quadToRelative(6f, 6f, 13f, 8.5f)
                reflectiveQuadToRelative(15f, 2.5f)
                quadToRelative(8f, 0f, 15f, -2.5f)
                reflectiveQuadToRelative(13f, -8.5f)
                lineToRelative(52f, -52f)
                lineToRelative(70f, 55f)
                quadToRelative(6f, 5f, 13.5f, 7.5f)
                reflectiveQuadTo(779f, 624f)
                quadToRelative(8f, -1f, 14.5f, -4.5f)
                reflectiveQuadTo(805f, 610f)
                lineToRelative(90f, -103f)
                quadToRelative(5f, -6f, 7.5f, -13f)
                reflectiveQuadToRelative(2.5f, -15f)
                quadToRelative(0f, -8f, -3f, -14.5f)
                reflectiveQuadToRelative(-8f, -11.5f)
                lineToRelative(-41f, -41f)
                quadToRelative(-6f, -6f, -13.5f, -9f)
                reflectiveQuadToRelative(-15.5f, -3f)
                horizontalLineTo(506f)
                quadToRelative(-24f, -68f, -84.5f, -114f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

