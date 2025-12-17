package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wrap_text: ImageVector
    get() {
        if (_Wrap_text != null) return _Wrap_text!!
        
        _Wrap_text = ImageVector.Builder(
            name = "wrap_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 500f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 460f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 420f)
                horizontalLineToRelative(490f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(840f, 570f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(690f, 720f)
                horizontalLineToRelative(-96f)
                lineToRelative(22f, 22f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(616f, 798f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(559f, 799f)
                lineToRelative(-91f, -91f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(91f, -91f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(616f, 618f)
                lineToRelative(-22f, 22f)
                horizontalLineToRelative(96f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(760f, 570f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(690f, 500f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 220f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 280f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Wrap_text!!
    }

private var _Wrap_text: ImageVector? = null

