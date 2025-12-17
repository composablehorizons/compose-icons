package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_backpack: ImageVector
    get() {
        if (_No_backpack != null) return _No_backpack!!
        
        _No_backpack = ImageVector.Builder(
            name = "no_backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 630f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(303f, 189f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-13f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(46f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 98f)
                verticalLineToRelative(270f)
                quadToRelative(0f, 18f, -12f, 29f)
                reflectiveQuadToRelative(-28f, 11f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 12.5f, -62f)
                reflectiveQuadToRelative(34.5f, -51f)
                lineToRelative(39f, 39f)
                verticalLineToRelative(113f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(678f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(663f, 776f)
                horizontalLineToRelative(112f)
                lineToRelative(25f, 24f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(207f, -320f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-27f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(340f, 560f)
                horizontalLineToRelative(107f)
                close()
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

