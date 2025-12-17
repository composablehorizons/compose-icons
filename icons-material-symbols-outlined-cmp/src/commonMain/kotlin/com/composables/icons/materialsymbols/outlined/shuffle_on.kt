package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shuffle_on: ImageVector
    get() {
        if (_Shuffle_on != null) return _Shuffle_on!!
        
        _Shuffle_on = ImageVector.Builder(
            name = "shuffle_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 40f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(440f, -120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(102f)
                lineTo(594f, 536f)
                lineToRelative(-57f, 57f)
                lineToRelative(127f, 127f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-344f, 0f)
                lineToRelative(504f, -504f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(104f)
                lineTo(160f, 744f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(151f, -377f)
                lineToRelative(56f, -56f)
                lineToRelative(-207f, -207f)
                lineToRelative(-56f, 56f)
                lineToRelative(207f, 207f)
                close()
            }
        }.build()
        
        return _Shuffle_on!!
    }

private var _Shuffle_on: ImageVector? = null

