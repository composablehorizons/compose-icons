package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -7f, 1f, -14.5f)
                reflectiveQuadToRelative(3f, -13.5f)
                lineTo(322f, 568f)
                quadToRelative(-17f, 15f, -38f, 23.5f)
                reflectiveQuadToRelative(-44f, 8.5f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(23f, 0f, 44f, 8.5f)
                reflectiveQuadToRelative(38f, 23.5f)
                lineToRelative(282f, -164f)
                quadToRelative(-2f, -6f, -3f, -13.5f)
                reflectiveQuadToRelative(-1f, -14.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-23f, 0f, -44f, -8.5f)
                reflectiveQuadTo(638f, 288f)
                lineTo(356f, 452f)
                quadToRelative(2f, 6f, 3f, 13.5f)
                reflectiveQuadToRelative(1f, 14.5f)
                quadToRelative(0f, 7f, -1f, 14.5f)
                reflectiveQuadToRelative(-3f, 13.5f)
                lineToRelative(282f, 164f)
                quadToRelative(17f, -15f, 38f, -23.5f)
                reflectiveQuadToRelative(44f, -8.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

