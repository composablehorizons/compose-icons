package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Payments: ImageVector
    get() {
        if (_Payments != null) return _Payments!!
        
        _Payments = ImageVector.Builder(
            name = "payments",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(480f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -80f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(760f, 560f)
                close()
                moveToRelative(-200f, -40f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(280f, 320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(560f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(840f, 320f)
                close()
            }
        }.build()
        
        return _Payments!!
    }

private var _Payments: ImageVector? = null

