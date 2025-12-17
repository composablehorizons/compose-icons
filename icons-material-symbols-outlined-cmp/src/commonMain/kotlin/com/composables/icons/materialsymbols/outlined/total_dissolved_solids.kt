package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Total_dissolved_solids: ImageVector
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
                moveTo(172f, 472f)
                quadToRelative(25f, -87f, 101.5f, -184.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(130f, 110f, 206.5f, 207.5f)
                reflectiveQuadTo(788f, 472f)
                horizontalLineToRelative(-84f)
                quadToRelative(-23f, -62f, -79f, -133.5f)
                reflectiveQuadTo(480f, 186f)
                quadToRelative(-88f, 81f, -144.5f, 152.5f)
                reflectiveQuadTo(256f, 472f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(622f, 146f)
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
                moveToRelative(-243f, 0f)
                horizontalLineToRelative(127f)
                lineTo(176f, 662f)
                quadToRelative(-8f, -27f, -12f, -54.5f)
                reflectiveQuadToRelative(-5f, -55.5f)
                close()
                moveToRelative(321f, -80f)
                close()
            }
        }.build()
        
        return _Total_dissolved_solids!!
    }

private var _Total_dissolved_solids: ImageVector? = null

