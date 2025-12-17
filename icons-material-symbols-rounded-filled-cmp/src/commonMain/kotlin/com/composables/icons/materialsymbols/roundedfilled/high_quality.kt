package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.High_quality: ImageVector
    get() {
        if (_High_quality != null) return _High_quality!!
        
        _High_quality = ImageVector.Builder(
            name = "high_quality",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(590f, 600f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(620f, 660f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(650f, 630f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(30f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 600f)
                horizontalLineToRelative(30f)
                close()
                moveToRelative(-290f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 390f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(270f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(280f, 20f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
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
        
        return _High_quality!!
    }

private var _High_quality: ImageVector? = null

