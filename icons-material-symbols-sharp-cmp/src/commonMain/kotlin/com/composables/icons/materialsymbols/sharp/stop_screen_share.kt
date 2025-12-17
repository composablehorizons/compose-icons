package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(577f, 463f)
                lineTo(474f, 360f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-80f)
                lineToRelative(120f, 120f)
                lineToRelative(-63f, 63f)
                close()
                moveToRelative(251f, 251f)
                lineToRelative(-74f, -74f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-440f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(646f)
                verticalLineToRelative(594f)
                horizontalLineToRelative(-52f)
                close()
                moveToRelative(-8f, 218f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(607f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-526f)
                lineToRelative(-52f, -54f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(400f, 514f)
                verticalLineToRelative(46f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -11f, 1f, -21f)
                reflectiveQuadToRelative(6f, -19f)
                lineTo(160f, 273f)
                verticalLineToRelative(367f)
                horizontalLineToRelative(366f)
                lineTo(400f, 514f)
                close()
                moveToRelative(134f, -94f)
                close()
                moveToRelative(-191f, 36f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

