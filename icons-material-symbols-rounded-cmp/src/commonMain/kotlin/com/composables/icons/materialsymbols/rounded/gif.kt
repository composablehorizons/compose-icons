package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(490f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(460f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(490f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(520f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(490f, 600f)
                close()
                moveToRelative(-250f, 0f)
                quadToRelative(-18f, 0f, -29f, -12.5f)
                reflectiveQuadTo(200f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -15f, 11f, -27.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                horizontalLineToRelative(130f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(400f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(370f, 420f)
                horizontalLineTo(260f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(370f, 480f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(400f, 510f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 15f, -11f, 27.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineTo(240f)
                close()
                moveToRelative(370f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(580f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(610f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(760f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(730f, 420f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(720f, 490f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(690f, 520f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 600f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null

