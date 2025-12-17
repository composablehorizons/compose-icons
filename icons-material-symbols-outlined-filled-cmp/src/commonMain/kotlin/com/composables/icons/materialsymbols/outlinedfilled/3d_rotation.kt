package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.`3d_rotation`: ImageVector
    get() {
        if (_3d_rotation != null) return _3d_rotation!!
        
        _3d_rotation = ImageVector.Builder(
            name = "3d_rotation",
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
                horizontalLineToRelative(80f)
                quadToRelative(0f, 115f, 72.5f, 203f)
                reflectiveQuadTo(418f, 794f)
                lineToRelative(-58f, -58f)
                lineToRelative(56f, -56f)
                lineTo(598f, 862f)
                quadToRelative(-29f, 10f, -58.5f, 14f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(20f, -280f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 600f)
                horizontalLineTo(500f)
                close()
                moveToRelative(-200f, 0f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineTo(300f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 600f)
                horizontalLineTo(300f)
                close()
                moveToRelative(260f, -60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, -60f)
                quadToRelative(0f, -115f, -72.5f, -203f)
                reflectiveQuadTo(542f, 166f)
                lineToRelative(58f, 58f)
                lineToRelative(-56f, 56f)
                lineToRelative(-182f, -182f)
                quadToRelative(29f, -10f, 58.5f, -14f)
                reflectiveQuadToRelative(59.5f, -4f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _3d_rotation!!
    }

private var _3d_rotation: ImageVector? = null

