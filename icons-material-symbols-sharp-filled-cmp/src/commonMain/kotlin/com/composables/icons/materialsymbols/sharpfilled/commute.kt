package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Commute: ImageVector
    get() {
        if (_Commute != null) return _Commute!!
        
        _Commute = ImageVector.Builder(
            name = "commute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 740f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-254f)
                lineToRelative(65f, -186f)
                horizontalLineToRelative(350f)
                lineToRelative(65f, 186f)
                verticalLineToRelative(254f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(320f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(508f)
                lineToRelative(-28f, 80f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 580f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 660f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 620f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 580f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 620f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 660f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-40f)
                lineToRelative(40f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 59f, -93f)
                reflectiveQuadToRelative(201f, -27f)
                quadToRelative(148f, 0f, 204f, 26f)
                reflectiveQuadToRelative(56f, 94f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveToRelative(40f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 640f)
                close()
            }
        }.build()
        
        return _Commute!!
    }

private var _Commute: ImageVector? = null

