package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Allergies: ImageVector
    get() {
        if (_Allergies != null) return _Allergies!!
        
        _Allergies = ImageVector.Builder(
            name = "allergies",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(284f, 538f)
                lineToRelative(72f, -36f)
                lineToRelative(-80f, -160f)
                lineToRelative(-72f, 36f)
                lineToRelative(80f, 160f)
                close()
                moveToRelative(96f, 182f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-289f)
                lineToRelative(-84f, -169f)
                lineToRelative(-72f, 36f)
                lineToRelative(76f, 152f)
                verticalLineToRelative(270f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-271f)
                lineToRelative(76f, -151f)
                lineToRelative(-72f, -36f)
                lineToRelative(-84f, 168f)
                verticalLineToRelative(290f)
                close()
                moveToRelative(176f, -182f)
                lineToRelative(80f, -160f)
                lineToRelative(-72f, -36f)
                lineToRelative(-80f, 160f)
                lineToRelative(72f, 36f)
                close()
            }
        }.build()
        
        return _Allergies!!
    }

private var _Allergies: ImageVector? = null

