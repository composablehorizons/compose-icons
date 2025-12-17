package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ods: ImageVector
    get() {
        if (_Ods != null) return _Ods!!
        
        _Ods = ImageVector.Builder(
            name = "ods",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 600f)
                close()
                moveToRelative(20f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(160f, 60f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 360f)
                horizontalLineTo(420f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(40f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(260f, 60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -31.5f)
                reflectiveQuadTo(720f, 454f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 360f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, 11.5f, 30.5f)
                reflectiveQuadTo(640f, 504f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(36f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 570f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 600f)
                horizontalLineToRelative(90f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Ods!!
    }

private var _Ods: ImageVector? = null

