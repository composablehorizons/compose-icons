package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Open_jam: ImageVector
    get() {
        if (_Open_jam != null) return _Open_jam!!
        
        _Open_jam = ImageVector.Builder(
            name = "open_jam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-288f)
                lineToRelative(64f, 64f)
                lineToRelative(56f, -56f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(56f, 56f)
                lineToRelative(64f, -64f)
                verticalLineToRelative(288f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, -360f)
                close()
                moveTo(160f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 560f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Open_jam!!
    }

private var _Open_jam: ImageVector? = null

