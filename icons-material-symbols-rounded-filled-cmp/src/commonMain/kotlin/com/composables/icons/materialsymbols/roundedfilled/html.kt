package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Html: ImageVector
    get() {
        if (_Html != null) return _Html!!
        
        _Html = ImageVector.Builder(
            name = "html",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(30f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(60f, 390f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(170f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(200f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(170f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(140f, 570f)
                verticalLineToRelative(-70f)
                horizontalLineTo(60f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(30f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(0f, 570f)
                close()
                moveToRelative(310f, 0f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(-40f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(240f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(270f, 360f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(440f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(410f, 420f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(340f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(310f, 570f)
                close()
                moveToRelative(170f, 0f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 360f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(740f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 570f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(110f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 560f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(580f, 530f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(510f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(480f, 570f)
                close()
                moveToRelative(350f, 30f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(800f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(830f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(860f, 390f)
                verticalLineToRelative(150f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(960f, 570f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(930f, 600f)
                horizontalLineTo(830f)
                close()
            }
        }.build()
        
        return _Html!!
    }

private var _Html: ImageVector? = null

