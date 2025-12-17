package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pinboard: ImageVector
    get() {
        if (_Pinboard != null) return _Pinboard!!
        
        _Pinboard = ImageVector.Builder(
            name = "pinboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 880f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                lineToRelative(60f, -106f)
                verticalLineToRelative(-94f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(94f)
                lineToRelative(60f, 106f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                lineToRelative(-40f, 40f)
                close()
                moveToRelative(220f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-480f)
                horizontalLineTo(80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Pinboard!!
    }

private var _Pinboard: ImageVector? = null

