package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ent: ImageVector
    get() {
        if (_Ent != null) return _Ent!!
        
        _Ent = ImageVector.Builder(
            name = "ent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(364f, 880f)
                horizontalLineToRelative(80f)
                lineToRelative(25f, -240f)
                horizontalLineToRelative(131f)
                verticalLineToRelative(-80f)
                horizontalLineTo(477f)
                lineToRelative(9f, -80f)
                horizontalLineToRelative(194f)
                verticalLineToRelative(-80f)
                horizontalLineTo(413f)
                lineTo(364f, 880f)
                close()
                moveToRelative(-124f, 0f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(64f, 255f)
                horizontalLineTo(760f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(108f)
                lineToRelative(-38f, -155f)
                quadToRelative(-23f, -91f, -98f, -148f)
                reflectiveQuadToRelative(-172f, -57f)
                quadToRelative(-116f, 0f, -198f, 81f)
                reflectiveQuadToRelative(-82f, 197f)
                quadToRelative(0f, 60f, 24.5f, 114f)
                reflectiveQuadToRelative(69.5f, 96f)
                lineToRelative(26f, 24f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(254f, -360f)
                close()
            }
        }.build()
        
        return _Ent!!
    }

private var _Ent: ImageVector? = null

