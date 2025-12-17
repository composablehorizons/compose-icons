package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_backpack: ImageVector
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
                moveTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(46f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 98f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 647f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 607f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(353f)
                lineToRelative(-50f, -51f)
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
                close()
                moveTo(480f, 480f)
                lineToRelative(79f, 80f)
                horizontalLineTo(340f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 480f)
                horizontalLineToRelative(140f)
                close()
                moveToRelative(62f, -51f)
                close()
                moveToRelative(-80f, 146f)
                close()
                moveTo(207f, 207f)
                lineToRelative(56f, 56f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 31.5f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-79f)
                lineToRelative(80f, 79f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 12.5f, -62f)
                reflectiveQuadToRelative(34.5f, -51f)
                close()
                moveTo(763f, 876f)
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
                close()
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

