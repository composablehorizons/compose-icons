package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Total_dissolved_solids: ImageVector
    get() {
        if (_Total_dissolved_solids != null) return _Total_dissolved_solids!!
        
        _Total_dissolved_solids = ImageVector.Builder(
            name = "total_dissolved_solids",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 472f)
                quadToRelative(-23f, 0f, -35.5f, -18.5f)
                reflectiveQuadTo(194f, 415f)
                quadToRelative(42f, -90f, 116.5f, -171f)
                reflectiveQuadTo(454f, 103f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(480f, 93f)
                quadToRelative(7f, 0f, 14f, 2.5f)
                reflectiveQuadToRelative(12f, 7.5f)
                quadToRelative(69f, 60f, 143.5f, 141f)
                reflectiveQuadTo(766f, 415f)
                quadToRelative(9f, 20f, -3.5f, 38.5f)
                reflectiveQuadTo(727f, 472f)
                horizontalLineTo(233f)
                close()
                moveToRelative(561f, 146f)
                quadToRelative(-9f, 49f, -31.5f, 92.5f)
                reflectiveQuadTo(705f, 789f)
                quadToRelative(-35f, 35f, -78.5f, 57f)
                reflectiveQuadTo(535f, 876f)
                lineToRelative(259f, -258f)
                close()
                moveToRelative(-163f, -66f)
                horizontalLineToRelative(114f)
                lineTo(421f, 876f)
                quadToRelative(-23f, -5f, -44.5f, -11.5f)
                reflectiveQuadTo(335f, 847f)
                lineToRelative(296f, -295f)
                close()
                moveToRelative(-229f, 0f)
                horizontalLineToRelative(114f)
                lineTo(267f, 801f)
                quadToRelative(-15f, -14f, -28.5f, -29f)
                reflectiveQuadTo(214f, 740f)
                lineToRelative(188f, -188f)
                close()
                moveToRelative(-116f, 0f)
                lineTo(176f, 662f)
                quadToRelative(-5f, -17f, -7f, -34.5f)
                reflectiveQuadToRelative(-2f, -34.5f)
                quadToRelative(0f, -18f, 13.5f, -29.5f)
                reflectiveQuadTo(213f, 552f)
                horizontalLineToRelative(73f)
                close()
            }
        }.build()
        
        return _Total_dissolved_solids!!
    }

private var _Total_dissolved_solids: ImageVector? = null

