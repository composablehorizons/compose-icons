package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_activity: ImageVector
    get() {
        if (_Local_activity != null) return _Local_activity!!
        
        _Local_activity = ImageVector.Builder(
            name = "local_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 640f)
                lineToRelative(112f, -84f)
                lineToRelative(110f, 84f)
                lineToRelative(-42f, -136f)
                lineToRelative(112f, -88f)
                horizontalLineTo(524f)
                lineToRelative(-44f, -136f)
                lineToRelative(-44f, 136f)
                horizontalLineTo(300f)
                lineToRelative(110f, 88f)
                lineToRelative(-42f, 136f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Local_activity!!
    }

private var _Local_activity: ImageVector? = null

