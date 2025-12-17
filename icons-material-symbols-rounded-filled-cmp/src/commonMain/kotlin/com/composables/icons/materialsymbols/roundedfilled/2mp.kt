package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`2mp`: ImageVector
    get() {
        if (_2mp != null) return _2mp!!
        
        _2mp = ImageVector.Builder(
            name = "2mp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(370f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(400f, 650f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(470f, 740f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(500f, 710f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(460f, 500f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 540f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 740f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 710f)
                verticalLineToRelative(-150f)
                close()
                moveToRelative(150f, -160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(570f, 320f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(530f, 220f)
                horizontalLineTo(420f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(390f, 250f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(420f, 280f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(390f, 360f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(420f, 460f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(570f, 430f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(540f, 400f)
                horizontalLineToRelative(-90f)
                close()
                moveToRelative(150f, 280f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 500f)
                horizontalLineTo(570f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(540f, 530f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(570f, 740f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(600f, 710f)
                verticalLineToRelative(-30f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _2mp!!
    }

private var _2mp: ImageVector? = null

