package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ios_share: ImageVector
    get() {
        if (_Ios_share != null) return _Ios_share!!
        
        _Ios_share = ImageVector.Builder(
            name = "ios_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 920f)
                horizontalLineTo(240f)
                close()
                moveToRelative(200f, -280f)
                verticalLineToRelative(-447f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -57f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 57f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Ios_share!!
    }

private var _Ios_share: ImageVector? = null

