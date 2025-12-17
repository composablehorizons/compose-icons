package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_sunblock: ImageVector
    get() {
        if (_Nest_sunblock != null) return _Nest_sunblock!!
        
        _Nest_sunblock = ImageVector.Builder(
            name = "nest_sunblock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(210f, -433f)
                lineToRelative(-57f, -57f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 57f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(28f, 368f)
                lineToRelative(-85f, -85f)
                lineToRelative(57f, -57f)
                lineToRelative(85f, 85f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(2f, -215f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                lineToRelative(-72f, -96f)
                lineToRelative(64f, -48f)
                lineToRelative(168f, 224f)
                horizontalLineTo(320f)
                close()
                moveToRelative(440f, 240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(760f)
                close()
                moveTo(80f, 640f)
                verticalLineToRelative(-80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-80f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(80f, 640f)
                close()
            }
        }.build()
        
        return _Nest_sunblock!!
    }

private var _Nest_sunblock: ImageVector? = null

