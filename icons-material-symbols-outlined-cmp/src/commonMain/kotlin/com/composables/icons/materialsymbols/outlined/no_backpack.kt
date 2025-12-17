package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.No_backpack: ImageVector
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
                moveTo(800f, 687f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(353f)
                lineToRelative(-73f, -74f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(86f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 98f)
                verticalLineToRelative(367f)
                close()
                moveTo(660f, 547f)
                lineToRelative(-67f, -67f)
                horizontalLineToRelative(67f)
                verticalLineToRelative(67f)
                close()
                moveToRelative(-213f, -67f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(147f)
                close()
                moveToRelative(95f, -51f)
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
                moveTo(791f, 904f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

