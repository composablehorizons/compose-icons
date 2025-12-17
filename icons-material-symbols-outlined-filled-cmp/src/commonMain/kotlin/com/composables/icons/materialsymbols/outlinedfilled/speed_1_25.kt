package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Speed_1_25: ImageVector
    get() {
        if (_Speed_1_25 != null) return _Speed_1_25!!
        
        _Speed_1_25 = ImageVector.Builder(
            name = "speed_1_25",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(660f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(740f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(900f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(820f, 680f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(460f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(380f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 360f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(380f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Speed_1_25!!
    }

private var _Speed_1_25: ImageVector? = null

