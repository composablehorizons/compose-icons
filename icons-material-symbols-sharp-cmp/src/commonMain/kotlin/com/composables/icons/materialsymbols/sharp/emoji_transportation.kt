package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Emoji_transportation: ImageVector
    get() {
        if (_Emoji_transportation != null) return _Emoji_transportation!!
        
        _Emoji_transportation = ImageVector.Builder(
            name = "emoji_transportation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                verticalLineToRelative(-254f)
                lineToRelative(65f, -186f)
                horizontalLineToRelative(350f)
                lineToRelative(65f, 186f)
                verticalLineToRelative(254f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -300f)
                horizontalLineToRelative(320f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(508f)
                lineToRelative(-28f, 80f)
                close()
                moveToRelative(-20f, 60f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(60f, 100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 700f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 660f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 740f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 700f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 660f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 700f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 740f)
                close()
                moveTo(240f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(380f, -120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(460f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Emoji_transportation!!
    }

private var _Emoji_transportation: ImageVector? = null

