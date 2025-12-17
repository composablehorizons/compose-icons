package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Signal_cellular_add: ImageVector
    get() {
        if (_Signal_cellular_add != null) return _Signal_cellular_add!!
        
        _Signal_cellular_add = ImageVector.Builder(
            name = "signal_cellular_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 880f)
                lineToRelative(799f, -799f)
                verticalLineToRelative(425f)
                quadToRelative(-27f, -16f, -57.5f, -23.5f)
                reflectiveQuadTo(760f, 475f)
                quadToRelative(-102f, 0f, -173.5f, 71.5f)
                reflectiveQuadTo(515f, 720f)
                quadToRelative(0f, 46f, 15f, 85.5f)
                reflectiveQuadTo(575f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Signal_cellular_add!!
    }

private var _Signal_cellular_add: ImageVector? = null

