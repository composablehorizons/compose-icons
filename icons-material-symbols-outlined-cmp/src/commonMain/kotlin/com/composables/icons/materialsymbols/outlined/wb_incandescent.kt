package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wb_incandescent: ImageVector
    get() {
        if (_Wb_incandescent != null) return _Wb_incandescent!!
        
        _Wb_incandescent = ImageVector.Builder(
            name = "wb_incandescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(680f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(-40f, 276f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-480f, 0f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 84f)
                close()
                moveToRelative(240f, -116f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -48f, 21.5f, -89.5f)
                reflectiveQuadTo(360f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                quadToRelative(37f, 29f, 58.5f, 70.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-40f, -396f)
                quadToRelative(10f, -2f, 20f, -3f)
                reflectiveQuadToRelative(20f, -1f)
                quadToRelative(10f, 0f, 20f, 1f)
                reflectiveQuadToRelative(20f, 3f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(84f)
                close()
                moveToRelative(40f, 316f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -120f)
                close()
            }
        }.build()
        
        return _Wb_incandescent!!
    }

private var _Wb_incandescent: ImageVector? = null

