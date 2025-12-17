package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contract_delete: ImageVector
    get() {
        if (_Contract_delete != null) return _Contract_delete!!
        
        _Contract_delete = ImageVector.Builder(
            name = "contract_delete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(675f, 861f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -85f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 84f)
                lineToRelative(85f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 85f)
                lineToRelative(84f, 85f)
                lineToRelative(-56f, 56f)
                lineToRelative(-85f, -84f)
                lineToRelative(-85f, 84f)
                close()
                moveTo(360f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(415f)
                quadToRelative(-19f, -7f, -39f, -10.5f)
                reflectiveQuadToRelative(-41f, -3.5f)
                verticalLineToRelative(-321f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(214f)
                quadToRelative(-7f, 20f, -10.5f, 40f)
                reflectiveQuadToRelative(-3.5f, 40f)
                quadToRelative(0f, 44f, 15.5f, 85f)
                reflectiveQuadTo(582f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Contract_delete!!
    }

private var _Contract_delete: ImageVector? = null

