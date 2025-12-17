package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Save_as: ImageVector
    get() {
        if (_Save_as != null) return _Save_as!!
        
        _Save_as = ImageVector.Builder(
            name = "save_as",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 920f)
                verticalLineToRelative(-123f)
                lineToRelative(263f, -262f)
                lineToRelative(123f, 122f)
                lineTo(643f, 920f)
                horizontalLineTo(520f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(543f, 296f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
                moveTo(440f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(86f)
                lineTo(600f, 605f)
                verticalLineToRelative(-5f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(4f)
                lineToRelative(-44f, 44f)
                verticalLineToRelative(76f)
                close()
            }
        }.build()
        
        return _Save_as!!
    }

private var _Save_as: ImageVector? = null

