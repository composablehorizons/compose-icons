package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Not_accessible_forward: ImageVector
    get() {
        if (_Not_accessible_forward != null) return _Not_accessible_forward!!
        
        _Not_accessible_forward = ImageVector.Builder(
            name = "not_accessible_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineToRelative(-65f, -65f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(-46f)
                lineTo(526f, 640f)
                horizontalLineToRelative(-86f)
                quadToRelative(-44f, 0f, -68f, -37.5f)
                reflectiveQuadToRelative(-6f, -78.5f)
                lineToRelative(14f, -30f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-31f, -259f)
                lineTo(654f, 540f)
                horizontalLineToRelative(26f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 620f)
                verticalLineToRelative(26f)
                close()
                moveTo(593f, 479f)
                lineTo(394f, 280f)
                horizontalLineToRelative(164f)
                quadToRelative(45f, 0f, 68.5f, 36.5f)
                reflectiveQuadTo(632f, 394f)
                lineToRelative(-39f, 85f)
                close()
                moveTo(320f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(320f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(320f, 880f)
                close()
                moveToRelative(320f, -620f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 260f)
                close()
            }
        }.build()
        
        return _Not_accessible_forward!!
    }

private var _Not_accessible_forward: ImageVector? = null

