package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`20mp`: ImageVector
    get() {
        if (_20mp != null) return _20mp!!
        
        _20mp = ImageVector.Builder(
            name = "20mp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 320f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 220f)
                horizontalLineTo(290f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(260f, 250f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(290f, 280f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(260f, 360f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(290f, 460f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 430f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 400f)
                horizontalLineToRelative(-90f)
                close()
                moveToRelative(240f, 60f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(700f, 420f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(660f, 220f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 260f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 460f)
                close()
                moveToRelative(20f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
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
                moveToRelative(100f, -280f)
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
                moveToRelative(300f, 120f)
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
            }
        }.build()
        
        return _20mp!!
    }

private var _20mp: ImageVector? = null

