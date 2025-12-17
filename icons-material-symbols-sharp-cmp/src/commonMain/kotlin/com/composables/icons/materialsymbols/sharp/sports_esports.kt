package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_esports: ImageVector
    get() {
        if (_Sports_esports != null) return _Sports_esports!!
        
        _Sports_esports = ImageVector.Builder(
            name = "sports_esports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(65f, 760f)
                lineToRelative(78f, -560f)
                horizontalLineToRelative(674f)
                lineToRelative(78f, 560f)
                horizontalLineTo(736f)
                lineTo(616f, 640f)
                horizontalLineTo(344f)
                lineTo(224f, 760f)
                horizontalLineTo(65f)
                close()
                moveToRelative(127f, -80f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(337f)
                lineToRelative(120f, 120f)
                horizontalLineToRelative(35f)
                lineToRelative(-58f, -400f)
                horizontalLineTo(214f)
                lineToRelative(-57f, 400f)
                horizontalLineToRelative(35f)
                close()
                moveToRelative(488f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 520f)
                close()
                moveToRelative(-80f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 400f)
                close()
                moveTo(310f, 520f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(70f)
                close()
                moveToRelative(171f, -40f)
                close()
            }
        }.build()
        
        return _Sports_esports!!
    }

private var _Sports_esports: ImageVector? = null

